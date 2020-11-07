package parcial2.repaso.ej5;

import java.util.HashMap;
import java.util.Map;

public class DoubleKeyHashMap<K1, K2, V> implements DoubleKeyMap<K1, K2, V>{
    private final Map<K1, Map<K2, V>> dkm = new HashMap<>();

    @Override
    public int size() {
        return dkm.values().stream().mapToInt(Map::size).sum();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(K1 firstKey, K2 secondKey) {
        return dkm.getOrDefault(firstKey, new HashMap<>()).containsKey(secondKey);
    }

    @Override
    public boolean containsValue(V value) {
        for(Map<K2, V> map : dkm.values()){
            if(map.containsValue(value)){
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(K1 firstKey, K2 secondKey) {
        return dkm.getOrDefault(firstKey, new HashMap<>()).get(secondKey);
    }

    @Override
    public void put(K1 firstKey, K2 secondKey, V value) {
        dkm.putIfAbsent(firstKey, new HashMap<>());
        dkm.get(firstKey).put(secondKey, value);
    }
}
