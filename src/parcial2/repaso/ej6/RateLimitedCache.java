package parcial2.repaso.ej6;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class RateLimitedCache<K, V> extends BaseCache<K, V> {
    private final Map<String, User> users;

    public RateLimitedCache(){
        users = new HashMap<>();
    }

    public void register(String user, QuotaType quota){
        users.putIfAbsent(user, new User(quota));
    }

    @Override
    public void put(String user, String date, K key, V value) {
        if(!users.containsKey(user)){
            throw new NoSuchElementException();
        }
        users.get(user).addPut(date);
        super.put(user, date, key, value);
    }

    @Override
    public V get(String user, String date, K key) {
        if(!users.containsKey(user)){
            throw new NoSuchElementException();
        }
        users.get(user).addGet(date);
        return super.get(user, date, key);
    }
}
