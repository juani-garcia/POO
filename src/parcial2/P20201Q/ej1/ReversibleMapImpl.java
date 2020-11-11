package parcial2.P20201Q.ej1;

import java.util.HashMap;
import java.util.function.Function;

public class ReversibleMapImpl<K, V> extends HashMap<K, V> implements ReversibleMap<K, V>{

    @Override
    public <L> ReversibleMap<L, K> reverse(Function<V, L> create) {
        ReversibleMap<L, K> ans = new ReversibleMapImpl<>();
        entrySet().forEach(e -> ans.put(create.apply(e.getValue()), e.getKey()));
        return ans;
    }
}
