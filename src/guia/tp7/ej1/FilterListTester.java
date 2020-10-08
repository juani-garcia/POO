package guia.tp7.ej1;

public class FilterListTester {
    public static void main(String[] args) {
        FilterList<Integer> list = new ArrayFilterList<>();
        for(int i = 0; i<31; i++)
            list.add(i);
        FilterList<Integer> even = list.filter(e -> e % 2 == 0);
        System.out.println(even);
        FilterList<Integer> multOf6 = even.filter(e -> e % 3 == 0);
        System.out.println(multOf6);
    }
}
