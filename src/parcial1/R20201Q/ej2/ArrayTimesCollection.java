package parcial1.R20201Q.ej2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTimesCollection <E> implements TimesCollection <E> {

    private static final int INITIAL_DIM = 5;
    @SuppressWarnings("unchecked")
    private E[] array = (E[]) new Object[INITIAL_DIM];
    private int dim;
    private int times = 1;

    private void resize(){
        array = Arrays.copyOf(array, dim + INITIAL_DIM);
    }

    public void add(E elem){
        if(dim == array.length)
            resize();
        array[dim++] = elem;
    }

    public void setTimes(int times){
        if(times <= 0)
            throw new IllegalArgumentException("Times parameter should be positive.");
        this.times = times;
    }

    @Override
    public Iterator<E> iterator() {
        return new ATCIterator();
    }

    private class ATCIterator implements Iterator<E>{
        private int current, repeated;
        private final int amount = times;

        @Override
        public boolean hasNext() {
            return current < dim;
        }

        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            E ans = array[current];
            repeated++;
            if(repeated == amount){
                current++;
                repeated = 0;
            }
            return ans;
        }
    }

}