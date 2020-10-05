package guia.tp5.ej1;

public class Pair<A, B> {
    private A value1;
    private B value2;

    public Pair (A Value1, B Value2){
        value1 = Value1;
        value2 = Value2;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", value1, value2);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pair)){
            return false;
        }
        Pair<A, B> p = (Pair) obj;
        return value1.equals(p.value1) && value2.equals(p.value2);
    }

    /* public void set(A a) {
        this.value1 = a;
    } */

    public void set(B b) {
        this.value2 = b;
    }

}
