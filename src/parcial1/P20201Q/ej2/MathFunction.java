package parcial1.P20201Q.ej2;

@FunctionalInterface
public interface MathFunction <T extends Comparable <? super T>>{
    T evaluates(T x);
}
