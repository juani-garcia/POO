package parcial1.P20201Q.Redone_ej2;

import java.util.Iterator;

public class MathFunctionInterval<T extends Comparable <? super T>> implements Iterable<T>{
    private T start, end;
    MathFunction<T> function;

    public MathFunctionInterval(T start, T end, MathFunction<T> function){
        this.start = start;
        this.end = end;
        this.function = function;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>(){
            private T current;
            @Override
            public boolean hasNext() {
                return current.compareTo(end) < 0;
            }

            @Override
            public T next() {
                T ans = current;
                current = function.evaluates(current);
                return null;
            }
        };
    }
}
