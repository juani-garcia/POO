package taller.taller3.ej1;

import java.util.Arrays;

public class ArrayIntegerList implements List<Integer>{

    private static final int INITIAL_DIM = 5;

    private Integer[] elements;
    private int dim; //Se inicializa automaticamente en 0 y las booleans en false

    public ArrayIntegerList() {
        elements = new Integer[INITIAL_DIM];
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public int contains(Integer element) {
        for(int i=0; i < dim ; i++)
            if(elements[i].equals(element))// para usar el equals podríamos usar element == elements[i]
                return i;
        return -1;
    }

    @Override
    public void add(Integer element) {
        if(dim == elements.length)
            resize();
        elements[dim++]=element;
    }

    @Override
    public boolean remove(int index) {
        if(index >= dim || index < 0)
            throw new ArrayIndexOutOfBoundsException();           // Esto viene de dim - (index + 1)
        System.arraycopy(elements, index+1, elements, index, dim -1 -index);
        dim--;
        return true;
    }

    private void resize(){
        elements = Arrays.copyOf(elements, INITIAL_DIM + dim);
    }
}
