package guia.tp7.ej1;

@FunctionalInterface
public interface Criteria<T> {
    boolean test(T elem);
}
