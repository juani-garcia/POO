package guia.tp3.ej4;

public class Tester4 {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.method((Number) 43); // B tiene acceso a los metodos de A. Por el polimorfismo, se utiliza el method de A
    }
}
