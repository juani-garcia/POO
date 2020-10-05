package taller.taller3.ej1;

public interface List<E> {
    void add(E elem);
    int contains(E elem);
    boolean remove(int index);
    boolean isEmpty();

    default boolean removeElement(E elem){
        return remove(contains(elem));
    }
}
