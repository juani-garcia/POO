package guia.tp5.ej5;

public interface Stack<E> {
    void push(E elem);

    E pop();

    E peek();

    int size();

    default boolean isEmpty(){
        return size() == 0;
    }

}
