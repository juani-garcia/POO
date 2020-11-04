package parcial2.repaso.ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{

    @Override
    public <K> Map<K, T> toMap(Function<T, K> generateKey) {
        Map<K, T> ans = new HashMap<>();
        this.forEach(t -> ans.put(generateKey.apply(t), t));
        return ans;
    }

}
