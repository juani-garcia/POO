package guia.tp7.ej2;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{

    @Override
    public <R> R reduce(R initialVal, BiFunction<R, T, R> operation) {
        R acum = initialVal;
        for(T t : this){
            acum = operation.apply(acum, t);
        }
        return acum;
    }
}
