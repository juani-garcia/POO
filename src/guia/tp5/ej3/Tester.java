package guia.tp5.ej3;

public class Tester {
    public static void main(String[] args) {
        LinearListImpl<String> l1 = new LinearListImpl();
        l1.add("juan");
        l1.add("el otaku");
        l1.add("el anime hace mal");
        l1.add("enserio");
        System.out.println(l1);
        l1.set(1, "mateo");
        l1.remove(0);
        System.out.println(l1);

    }
}
