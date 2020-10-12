package guia.tp7.ej4;

import java.util.Objects;

public class Book{
    private final String title, author;
    private int rank;
    private Genre genre;

    @Override
    public String toString() {
        return String.format("%s: %d", title, rank);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int rank) {
        this.title = title;
        this.author = author;
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRank() {
        return rank;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void increment(){
        rank++;
    }

}
