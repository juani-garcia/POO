package parcial1.R20201Q.ej2;

public interface TimesCollection <E> extends Iterable<E>{
    void add(E element);
    void setTimes(int n);
}