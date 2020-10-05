package guia.tp6.ej3;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<E> implements Iterator<Pair<E,E>> {
    private final Collection<E> coll;
    private Iterator<E> iterator;

    public PairCyclicIterator(Collection<E> coll){
        this.coll = coll;
        this.iterator = coll.iterator();
    }

    @Override
    public boolean hasNext() {
        return !coll.isEmpty();
    }

    @Override
    public Pair<E, E> next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return new Pair<>(assign(), assign());
    }

    private E assign(){
        if(!iterator.hasNext())
            iterator = coll.iterator();
        return iterator.next();
    }
}
