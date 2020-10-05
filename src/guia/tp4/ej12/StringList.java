package guia.tp4.ej12;

import java.util.Arrays;

public class StringList implements LinearList{
    private String[] elems;
    private int available;
    private int current;
    private static final int BLOCK = 5;

    public StringList(){
        this.available = BLOCK;
        this.current = 0;
        this.elems = new String[BLOCK];
    }

    @Override
    public void add(Object obj) throws IllegalArgumentException{
        if(!(obj instanceof String))
            throw new IllegalArgumentException("Invalid string");
        String str = (String) obj;
        if(current == available)
            resize();
        elems[current++] = str;
    }

    @Override
    public Object get(int i) throws IllegalArgumentException{
        if(i >= size() || i < 0)
            throw new IllegalArgumentException("Invalid index");
        return elems[i];
    }

    @Override
    public void set(int i, Object obj) throws IllegalArgumentException{
        if(i >= size() || i < 0 || !(obj instanceof String))
            throw new IllegalArgumentException("Invalid arguments");
        String str = (String) obj;
        elems[i] = str;
    }

    @Override
    public void remove(int i) throws IllegalArgumentException{
        if(i >= size() || i < 0)
            throw new IllegalArgumentException("Invalid index");
        System.arraycopy(elems, i + 1, elems, i, (current--) - (i + 1));
    }

    @Override
    public int indexOf(Object obj) throws IllegalArgumentException{
        if(!(obj instanceof String))
            throw new IllegalArgumentException("Invalid argument");
        String str = (String) obj;
        int i;
        for(i = 0; i < size(); i++){
            if(elems[i].compareTo(str) == 0)
                return i;
        }
        return -1;
    }

    @Override
    public int size() {
        return current;
    }

    private void resize(){
        elems = Arrays.copyOf(elems, BLOCK + available);
    }
}
