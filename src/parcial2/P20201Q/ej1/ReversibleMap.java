package parcial2.P20201Q.ej1;

import java.util.Map;
import java.util.function.Function;

interface ReversibleMap<K, V> extends Map<K, V> {

    <L> ReversibleMap<L, K> reverse(Function<V, L> create);

    default ReversibleMap<V, K> reverse(){
        return reverse(Function.identity());
    }
}
