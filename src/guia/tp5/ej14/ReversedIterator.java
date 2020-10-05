package guia.tp5.ej14;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<T> implements Iterator<T> {
    private T[] array;
    private int current;

    public ReversedIterator(T[] array){
        this.array = array;
        current = array.length;
    }

    @Override
    public boolean hasNext() {
        return current > 0;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return array[--current];
    }
}
