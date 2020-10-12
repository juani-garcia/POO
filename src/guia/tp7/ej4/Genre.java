package guia.tp7.ej4;

public enum Genre {
    FANTASY("Fantasy"),
    FICTION("Fiction"),
    DRAMA("Drama"),
    CHILDREN("Children"),
    NS("Not Specified");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}
