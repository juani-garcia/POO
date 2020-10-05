package guia.tp6.ej8;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<E> implements Bag<E>{
    private Map<E, Integer> bag;

    public BagImpl(){
        this.bag = new HashMap<>();
    }

    @Override
    public void add(E elem) {
        bag.putIfAbsent(elem, 0);
        bag.put(elem, bag.get(elem) + 1);
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
        int sum = 0;
        for(int e : bag.values()){
            sum += e;
        }
        return sum;
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