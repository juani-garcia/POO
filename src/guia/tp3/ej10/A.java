package guia.tp3.ej10;

public class A {
    int m1 () {
        return m3 ();
    }
    int m2 () {
        return 10 ;
    }
    int m3 () {
        return 5 ;
    }
    int m4 () {
        return m4 ();
    }
}