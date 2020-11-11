package parcial2.R20201Q.ej1;

import java.util.Map;
import java.util.function.UnaryOperator;

public interface SpecialMap<K, V> extends Map<K, V> {

    SpecialMap<K, V> convert(UnaryOperator<K> newKeys, UnaryOperator<V> newValues);

}
