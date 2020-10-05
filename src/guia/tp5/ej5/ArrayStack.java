package guia.tp5.ej5;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E>{
    private E [] elems;
    private int occupied;
    private static final int BLOCK = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        elems = (E[]) new Object[BLOCK];
        int available = BLOCK;
    }

    private void resize(){
        elems = Arrays.copyOf(elems, elems.length + BLOCK);
    }

    @Override
    public void push(E elem) {
        if(occupied == elems.length)
            resize();
        elems[occupied++] = elem;
    }

    @Override
    public E pop() {
        if(isEmpty())
            throw new EmptyStackException();
        E aux = elems[occupied - 1];
        occupied--;
        return aux;
    }

    @Override
    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return elems[occupied - 1];
    }

    @Override
    public int size() {
        return occupied;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("[");
        for(int i = occupied - 1; i >= 0; i--){
            ans.append(elems[i]);
            if(i != 0)
                ans.append(", ");
        }
        ans.append("]");
        return ans.toString();
    }
}
