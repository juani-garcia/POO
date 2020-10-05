package parcial1.repaso.ej2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<ParallelIterator.Pair<T>> {
    private T[] v1, v2;
    private int current;

    public ParallelIterator(T[] v1, T[] v2){
        this.v1 = v1;
        this.v2 = v2;
        if(v1 == null){
            throw new NullPointerException("First collection missing");
        }else if(v2 == null){
            throw new NullPointerException("Second collection missing");
        }

    }

    @Override
    public boolean hasNext() {
        return current < v1.length && current < v2.length;
    }

    @Override
    public Pair<T> next() {
        if(!hasNext())
            throw new NoSuchElementException();
        Pair p = new Pair<>(v1[current], v2[current]);
        current++;
        return p;
    }

    public static class Pair<E> {
        E first, second;

        public Pair(E first, E second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return String.format("{%s, %s}", first, second);
        }
    }
}
