package parcial2.repaso.ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedListImpl<T> extends ArrayList<T> implements ReversedList<T>{
    @Override
    public Iterator<T> defaultIterator() {
        return super.iterator();
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<>() {
            private int current = size();
            @Override
            public boolean hasNext() {
                return current != 0;
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return get(--current);
            }
        };
    }
}

