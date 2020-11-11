package parcial2.P20201Q.ej2;

import java.util.*;

public class LimitedCache<K, V> implements Cache<K, V>{

    private final Map<K, UsageInfo<V>> cache;
    private final int limit;

    public LimitedCache(int limit){
        this.limit = limit;
        cache = new HashMap<>();
    }

    @Override
    public void add(K key, V value) {
        if(limit == size()){
            deleteMinKey();
        }
        cache.put(key, new UsageInfo<>(value));
    }

    private void deleteMinKey(){
        Optional<K> minKey = cache.keySet().stream().min(Comparator.comparingInt(k -> cache.get(k).amount));
        if(minKey.isEmpty()){
            throw new NoSuchElementException();
        }
        cache.remove(minKey.get());
    }

    @Override
    public V get(K key) {
        return cache.getOrDefault(key, new UsageInfo<>(null)).getValue();
    }

    @Override
    public int size() {
        return cache.size();
    }

    private static class UsageInfo<T>{
        private final T value;
        private int amount;

        private UsageInfo(T value){
            this.value = value;
        }

        private T getValue(){
            amount++;
            return value;
        }

        private int getAmount(){
            return amount;
        }
    }
}
