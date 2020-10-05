package taller.taller5.ej2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T>{

    private T[] elements;
    private static final int INITIAL_DIM = 5;
    private int dim;
    private Comparator<T> cmp;

    @SuppressWarnings("unchecked")
    public ArrayList(Comparator<T> cmp) {
        this.cmp = cmp;
        elements = (T[]) new Object[INITIAL_DIM];
    }

    @Override
    public int contains(T element) {
        for (int i = 0; i < dim; i++) {
            if(elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(T element) {
        if(dim == elements.length) {
            resize();
        }
        elements[dim++] = element;
    }
    
    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }

    @Override
    public boolean remove(int index) {
        if(index < 0 || index >= dim) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(elements, index + 1, elements, index, dim - 1 - index);
        dim--;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        T[] aux = Arrays.copyOf(elements, dim);
        Arrays.sort(aux, cmp);
        return new ArrayListIterator<T>(aux);
    }

    private static class ArrayListIterator<E> implements Iterator<E>{
        private int current;
        private E[] array;

        public ArrayListIterator(E[] array){
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return current < array.length;
        }

        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return array[current++];
        }
    }
}