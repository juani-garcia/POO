package guia.tp7.ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IterableBagImpl<E extends Comparable<? super E>> extends BagImpl<E> implements IterableBag<E> {
    @Override
    public Iterable<E> elementsDistinct() {
        List<E> ans = new ArrayList<>(bag.keySet());
        ans.sort(Comparator.reverseOrder());
        return ans;
    }

    @Override
    public Iterable<E> elements() {
        List<E> ans = new ArrayList<>();
        for(E e : bag.keySet()){
            for(int i = bag.get(e); i > 0; i--)
                ans.add(e);
        }
        ans.sort(Comparator.reverseOrder());
        return ans;
    }
}
