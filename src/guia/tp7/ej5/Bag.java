package guia.tp7.ej5;

public interface Bag<E>{
    void add(E elem);
    void remove(E elem);
    int size();
    boolean contains(E elem);
    int sizeDistinct();
    int count(E elem);
}
