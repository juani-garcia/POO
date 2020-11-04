package parcial2.P20121Q.ej3;

import java.util.*;

public class ConcatNSimpleList<T> implements SimpleList<T> {
    private final List<SimpleList<T>> concat;

    public ConcatNSimpleList(){
        concat = new ArrayList<>();
    }

    public ConcatNSimpleList<T> add(SimpleList<T> list){
        concat.add(list);
        return this;
    }

    @Override
    public void append(T elem) {
        concat.get(concat.size() - 1).append(elem);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int current;
            private Iterator<T> it = concat.size() == 0? Collections.emptyIterator() : concat.get(0).iterator();

            @Override
            public boolean hasNext() {
                if(it.hasNext()){
                    return true;
                }
                while(current < concat.size()){
                    current++;
                    it = concat.get(current).iterator();
                    if(it.hasNext()){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return it.next();
            }

            @Override
            public void remove() {
                it.remove();
            }
        };
    }

}
