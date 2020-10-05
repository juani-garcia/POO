package parcial1.R20201Q.Redone_ej1;

public class Movie implements Comparable<Movie>{
    private String name;
    private int year;
    private double rating;

    @Override
    public String toString() {
        return name;
    }

    public Movie(String name, int year, double rating){
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie other){
        int cmp = Double.compare(other.rating, rating);
        if(cmp == 0)
            cmp = name.compareTo(other.name);
        return cmp;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
}
