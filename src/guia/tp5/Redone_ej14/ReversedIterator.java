package guia.tp5.Redone_ej14;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<T> implements Iterator<T>{
    private int dim;
    private T[] array;

    public ReversedIterator(T[] array){
        this.dim = array.length - 1;
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return dim >= 0;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return array[dim--];
    }
}
