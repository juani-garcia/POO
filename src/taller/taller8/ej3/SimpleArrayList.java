package taller.taller8.ej3;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {
    @Override
    public <R> SimpleList<R> map(Function<E, R> func) {
        /*
        SimpleList<R> ans = new SimpleArrayList<>();
        for(E e: this){
            ans.add(func.apply(e));
        }
        return ans; */
        return stream().map(func).collect(Collectors.toCollection(SimpleArrayList::new));
    }
}
