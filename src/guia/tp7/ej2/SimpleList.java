package guia.tp7.ej2;

import java.util.List;
import java.util.function.BiFunction;

public interface SimpleList<T> extends List<T> {

     <R> R reduce(R initialVal, BiFunction<R, T, R> operation);

}
