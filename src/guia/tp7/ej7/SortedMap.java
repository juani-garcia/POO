package guia.tp7.ej7;

import java.util.Map;

public interface SortedMap<K,V> extends Map<K, V>, Iterable<Map.Entry<K, V>> {

   K higherKey();

   V higherValue();
  
}
