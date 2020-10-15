package guia.tp7.ej7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapImpl<K, V> extends TreeMap<K, V>
        implements SortedMap<K, V>, Iterable<Map.Entry<K, V>> {
    @Override
    public K higherKey() {
        return firstKey();
    }

    @Override
    public V higherValue() {
        return get(firstKey());
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.entrySet().iterator();
    }
}
