package parcial1.repaso.Redone_ej2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<A,B> implements Iterator<Pair<A,B>> {
    private A[] v1;
    private B[] v2;
    private int current;

    public ParallelIterator(A[] v1, B[] v2){
        if(v1 == null || v2 == null)
            throw new IllegalArgumentException("Arrays must be not-null");
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean hasNext() {
        return current < v1.length && current < v2.length;
    }

    @Override
    public Pair<A, B> next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return new Pair<>(v1[current], v2[current++]);
    }
}
