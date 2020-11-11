package parcial2.P20201Q.ej2;

public interface Cache <K, V> {
    /**
     * Agrega el par clave-valor al cache
     */
    void add(K key, V value);
    /**
     * Devuelve el valor asociado a una clave o null si la clave no existe
     */
    V get(K key);
    /**
     * Devuelve la cantidad de claves almacenadas
     */
    int size();
}
