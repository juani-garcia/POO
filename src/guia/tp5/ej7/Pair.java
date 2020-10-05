package guia.tp5.ej7;

import java.util.Objects;

public class Pair<A extends Comparable<? super A>, B extends Comparable<B>> implements Comparable<Pair<A,B>>{
    private A value1;
    private B value2;

    public Pair(A Value1, B Value2){
        value1 = Value1;
        value2 = Value2;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", value1, value2);
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if(!(obj instanceof Pair)){
            return false;
        }
        Pair<A,B> p = (Pair<A,B>) obj;
        return value1.equals(p.value1) && value2.equals(p.value2);
    }

    public void setFirst(A a) {
        this.value1 = a;
    }

    public void setSecond(B b) {
        this.value2 = b;
    }

    public int compareTo(Pair<A,B> other){
        int cmp = value1.compareTo(other.value1);
        if(cmp == 0)
            cmp = value2.compareTo(other.value2);
        return cmp;
    }

}
