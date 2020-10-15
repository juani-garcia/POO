package guia.tp7.ej7;

public class MyComparableClass implements Comparable<MyComparableClass>{
    private final String name;
    public String sortableIdentifier = "";

    public MyComparableClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s - (%s)", name, sortableIdentifier);
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return sortableIdentifier.compareTo(o.sortableIdentifier);
    }


}
