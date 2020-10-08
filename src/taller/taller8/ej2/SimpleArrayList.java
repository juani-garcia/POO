package taller.taller8.ej2;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {
    @Override
    public SimpleList<E> map(UnaryOperator<E> func) {
        SimpleList<E> ans = new SimpleArrayList<>();
        for(E e: this){
            ans.add(func.apply(e));
        }
        return ans;
    }
}
