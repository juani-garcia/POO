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
        return new Iterator<T>() {
            private int current;
            private Iterator<T> it = concat.size() == 0? Collections.emptyIterator() : concat.get(0).iterator();

            @Override
            public boolean hasNext() {
                if(it.hasNext()){
                    return true;
                }
                for(int i = current + 1; i < concat.size(); i++){
                    Iterator<T> aux = concat.get(i).iterator();
                    if(aux.hasNext()){
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
                while(!it.hasNext()){
                    current++;
                    it = concat.get(current).iterator();
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
