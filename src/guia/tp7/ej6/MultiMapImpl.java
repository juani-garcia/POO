package guia.tp7.ej6;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V> {
    private final Map<K, SortedSet<V>> map;

    public MultiMapImpl() {
        map = new HashMap<>();
    }

    @Override
    public void put(K key, V value) {
        map.putIfAbsent(key, new TreeSet<>(Comparator.reverseOrder()));
        map.get(key).add(value);
    }

    @Override
    public int size() {
        return map.values().stream().mapToInt(SortedSet::size).sum();
    }

    @Override
    public int size(K key) {
        return map.getOrDefault(key, new TreeSet<>()).size();
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

    @Override
    public void remove(K key, V value) {
        map.getOrDefault(key, new TreeSet<>()).remove(value);
    }

    @Override
    public Iterable<V> get(K key) {
        return map.get(key);
    }
}
