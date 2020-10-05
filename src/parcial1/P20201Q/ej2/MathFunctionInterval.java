package parcial1.P20201Q.ej2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MathFunctionInterval<T extends Comparable <T>> implements Iterable<T>{
    T start, end;
    MathFunction<T> function;

    public MathFunctionInterval(T start, T end, MathFunction<T> function) {
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException("Start debe ser menor que End");
        this.start = start;
        this.end = end;
        this.function = function;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            T current = start;

            @Override
            public boolean hasNext() {
                return current.compareTo(end) <= 0;
            }

            @Override
            public T next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                T ans = current;
                current = function.evaluates(current);
                return ans;
            }
        };
    }

}

