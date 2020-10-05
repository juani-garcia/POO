package guia.tp6.ej7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ej7{
    public static <T extends Comparable<? super T>> T max(Collection<T> c){
        Iterator<T> it = c.iterator();
        if(!it.hasNext()){
            throw new NoSuchElementException();
        }
        T max = it.next();
        while(it.hasNext()){
            T aux = it.next();
            if(max.compareTo(aux) > 0)
                max = aux;
        }
        return max;
    }
}
