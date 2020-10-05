package taller.taller5.ej2;

public class ListTester {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>((o1, o2) -> o2.compareTo(o2));
        System.out.println(list.isEmpty()); // true
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);

        for (Integer i : list){
            System.out.println(i);
        }
    }
}