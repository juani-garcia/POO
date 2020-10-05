package guia.tp5.ej4;

public class PrependLinearListImpl < T > implements LinearList < T > {
    private Node first ;

    @Override
    public void add ( T obj ) {
    first = new Node(obj);
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void set(int i, T elem) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int indexOf(T elem) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        private T head ;
        private Node  tail ;

        Node (T head) {
            this.head = head ;
            this.tail = first ;
            first = this ;
        }
    }
}