package parcial2.repaso.ej3;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

 public class FilteredKeyMapIterator<K, V> implements Iterator<K> {
    private final Predicate<K> filter;
    private final Iterator<Map.Entry<K, V>> it;
    private Map.Entry<K, V> current = null;
    private boolean wasConsumed = true;

    public FilteredKeyMapIterator(Map<K, V> map, Predicate<K> filter){
        this.filter = filter;
        it = map.entrySet().iterator();

    }
    @Override
    public boolean hasNext() {
        if(!wasConsumed){
            return true;
        }
        while(it.hasNext()){
            Map.Entry<K, V> aux = it.next();
            if(filter.test(aux.getKey())){
                wasConsumed = false;
                current = aux;
                return true;
            }
        }
        return false;
    }

    @Override
    public K next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        wasConsumed = true;
        return current.getKey();
    }

    public V getValue(){
        if(current == null){
            throw new NoSuchElementException();
        }
        return current.getValue();
    }
}
