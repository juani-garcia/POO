package guia.tp5.Redone_ej15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<E> implements Iterator<E[]> {
    private int N, current;
    private E[] array;

    public CyclicWindowIterator(E[] array, int N){
        this.array = array;
        this.N = N;
    }

    @Override
    public boolean hasNext() {
        return array.length != 0;
    }

    @Override
    public E[] next() {
        if(!hasNext())
            throw new NoSuchElementException();
        E[] ans = (E[]) new Object[N];
        for(int i = 0; i < N; i++)
            ans[i] = array[(current + i) % array.length];
        current++;
        return ans;
    }
}
