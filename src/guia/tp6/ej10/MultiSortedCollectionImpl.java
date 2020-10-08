package guia.tp6.ej10;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T> {
    Map<Comparator<T>, SortedSet<T>> msc;
    Set<T> elems;

    public MultiSortedCollectionImpl() {
        this.msc = new HashMap<>();
        this.elems = new HashSet<>();
    }

    @Override
    public void add(Comparator<T> comp) {
        msc.put(comp, new TreeSet<>(comp));
        msc.get(comp).addAll(elems);
    }

    @Override
    public void add(T elem) {
        elems.add(elem);
        for(Set<T> ss : msc.values())
            ss.add(elem);
    }

    @Override
    public void remove(T elem) {
        elems.remove(elem);
        for(Set<T> ss : msc.values())
            ss.remove(elem);
    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        if(!msc.containsKey(comp))
            throw new IllegalArgumentException();
        return msc.get(comp);
    }
}
