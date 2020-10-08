package guia.tp6.ej8;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;

public class BagImpl<E> implements Bag<E>{
    private Map<E, Integer> bag;
    private int size;

    public BagImpl(){
        this.bag = new HashMap<>();
    }

    @Override
    public void add(E elem) {
        bag.putIfAbsent(elem, 0);
        bag.merge(elem, 1, Integer::sum);
    }

    @Override
    public void remove(E elem) {
        Integer aux = bag.get(elem);
        if(aux == null)
            throw new NoSuchElementException();
        bag.put(elem, aux - 1);
        if(bag.get(elem) == 0)
            bag.remove(elem);
    }

    @Override
    public int count(E elem) {
        return bag.getOrDefault(elem, 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E elem) {
        return bag.containsKey(elem);
    }

    @Override
    public int sizeDistinct() {
        return bag.size();
    }

}