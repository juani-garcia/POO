package taller.taller8.ej3;

public class SimpleListTester {
    public static void main(String[] args) {
        SimpleList<Integer> simpleList = new SimpleArrayList<>();

        simpleList.add(1);
        simpleList.add(3);
        simpleList.add(5);
        simpleList.add(7);

        System.out.println(simpleList.size());
        System.out.println(simpleList.contains(0));
        SimpleList<Integer> l2 = simpleList.map(element -> element * 2);
        for(Integer element : l2) {
            System.out.println(element);
        }

        SimpleList<String> l3 = l2.map(e -> String.format("<%d>", e));
        for(String s : l3){
            System.out.println(s);
        }

    }
}
