package parcial2.repaso.ej1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface SimpleList<T> extends List<T> {
    <K> Map<K, T> toMap(Function<T, K> generateKey);
}
