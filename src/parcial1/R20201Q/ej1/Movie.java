package parcial1.R20201Q.ej1;

public class Movie implements Comparable<Movie> {
    private String title;
    private double value;
    private int year;

    public Movie(String title, int year, double value) {
        this.title = title;
        this.value = value;
        this.year = year;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Movie o) {
        int cmp = Double.compare(o.value, value);
        if(cmp == 0)
            cmp = title.compareTo(o.title);
        return cmp;
    }

    public String getTitle() {
        return title;
    }

    public double getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
