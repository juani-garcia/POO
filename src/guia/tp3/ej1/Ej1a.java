package guia.tp3.ej1;

public class Ej1a {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hola");
        s2 = s1;
        if (s1 == s2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}
