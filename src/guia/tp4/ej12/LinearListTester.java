package guia.tp4.ej12;

public class LinearListTester {
    public static void main(String[] args) {
        LinearList l1 = new StringList();
        LinearList l2 = new StringList();

        l1.add("Juan");
        l1.add("Jero");
        l1.add("Jose");

        l2.add("Juan");
        l2.add("Jose");
        l2.add("Jero");

        System.out.println(l1.get(2));
        System.out.println(l2.get(2));

        try {
            l1.set(-234, "Jero");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(l1.get(0));

        l2.remove(0);

        System.out.println(l2.get(0));

        System.out.println(l2.indexOf("Juan"));
        System.out.println(l2.size());

    }
}
