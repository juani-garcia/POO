package guia.tp5.ej3;

import java.util.Arrays;

public class LinearListImpl<E> implements LinearList<E>{
    private E[] elems;
    private int occupied;
    private int available;
    private static final int BLOCK = 10;

    @SuppressWarnings("unchecked")
    public LinearListImpl(){
        int available = BLOCK;
        elems = (E[]) new Object[BLOCK];
    }

    private void resize(){
        elems = Arrays.copyOf(elems, BLOCK + available);
    }

    @Override
    public void add(E elem) {
        if(occupied == available)
            resize();
        elems[occupied++] = elem;
    }

    @Override
    public E get(int i){
        if(i < 0 || i > occupied)
            throw new IndexOutOfBoundsException("Invalid index");
        return elems[i];
    }

    @Override
    public void set(int i, E elem) {
        if(i < 0 || i > occupied)
            throw new IndexOutOfBoundsException("Invalid index");
        elems[i] = elem;
    }

    @Override
    public void remove(int i) {
        if(i < 0 || i > occupied)
            throw new IndexOutOfBoundsException("Invalid index");
        System.arraycopy(elems,i+1,elems,i,(occupied--) - i - 1);
    }

    @Override
    public int indexOf(E elem) {
        for(int i = 0; i < occupied; i++)
            if(elems[i].equals(elem))
                return i;
        throw new IndexOutOfBoundsException("Invalid element");
    }

    @Override
    public int size() {
        return occupied;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i < occupied; i++){
            ans.append(elems[i]);
            ans.append(" ");
        }
        return ans.toString();
    }
}