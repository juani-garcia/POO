package guia.tp6.ej8;

import java.util.Collection;

public interface Bag<E>{
    void add(E elem);
    void remove(E elem);
    int size();
    boolean contains(E elem);
    int sizeDistinct();
    int count(E elem);
}
