package guia.tp5.ej15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<T> implements Iterator<T[]> {
    private int N, current;
    private T[] array;

    public CyclicWindowIterator(T[] array, int N){
        this.array = array;
        this.N = N;
    }

    @Override
    public boolean hasNext() {
        return array.length > 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] next() {
        if(!hasNext())
            throw new NoSuchElementException();
        T[] ans =  (T[]) new Object[N];
        for(int i = 0; i < N; i++){
            ans[i] = array[(current + i) % array.length];
        }
        current++;
        return ans;
    }
}
