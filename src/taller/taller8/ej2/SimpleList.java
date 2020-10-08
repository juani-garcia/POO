package taller.taller8.ej2;

import java.util.List;
import java.util.function.UnaryOperator;

public interface SimpleList<T> extends List<T> {
    SimpleList<T> map(UnaryOperator<T> func);
}
