package guia.tp7.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArrayFilterList<E> extends ArrayList<E> implements FilterList<E>{

    @Override
    public FilterList<E> filter(Criteria<E> crit) {
        /*
        FilterList<E> ans = new ArrayFilterList<>();
        for(E elem : this){
            if(crit.test(elem))
                ans.add(elem);
        }
        return ans; */

        return stream().filter(crit::test).collect(Collectors.toCollection(ArrayFilterList::new));
        // Ambas son equivalentes: la segunda es mas linda
    }
}
