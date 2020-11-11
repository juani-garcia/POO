package parcial2.R20201Q.ej1;

import java.util.HashMap;
import java.util.function.UnaryOperator;

public class SpecialHashMap<K, V> extends HashMap<K, V> implements SpecialMap<K, V> {

    @Override
    public SpecialMap<K, V> convert(UnaryOperator<K> newKeys, UnaryOperator<V> newValues) {
        SpecialMap<K, V> ans = new SpecialHashMap<K, V>();
        for(Entry<K, V> entry : entrySet()){
            ans.put(newKeys.apply(entry.getKey()), newValues.apply(entry.getValue()));
        }
        return ans;
    }

}
