package guia.tp6.ej3;

public class Pair<A, B>{
        private final A first;
        private final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return String.format("# %s + %s #", first, second);
        }
    }