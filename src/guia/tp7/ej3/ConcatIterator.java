package guia.tp7.ej3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<E> implements Iterator<E> {
    private final Iterator<E> it1, it2;

    public ConcatIterator(Iterator<E> it1, Iterator<E> it2) {
        this.it1 = it1;
        this.it2 = it2;
    }

    @Override
    public boolean hasNext() {
        return it1.hasNext() || it2.hasNext();
    }

    @Override
    public E next() {
        if(!hasNext())
            throw new NoSuchElementException();
        if(it1.hasNext()){
            return it1.next();
        }
        return it2.next();
    }
}
