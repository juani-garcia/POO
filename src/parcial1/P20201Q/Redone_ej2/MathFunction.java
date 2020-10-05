package parcial1.P20201Q.Redone_ej2;

@FunctionalInterface
public interface MathFunction<T extends Comparable <? super T>>{
    T evaluates(T x);
}
