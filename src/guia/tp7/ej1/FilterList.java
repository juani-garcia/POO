package guia.tp7.ej1;

import java.util.List;

public interface FilterList<T> extends List<T> {
    FilterList<T> filter(Criteria<T> crit);
}