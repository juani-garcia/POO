package parcial2.P20121Q.ej3;

import java.util.ArrayList;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {
    public void append(T elem) {
add(elem);
}
}