package parcial1.repaso.Redone_ej2;

public class Pair<A,B> {
    private A first;
    private B second;

    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", first, second);
    }
}
