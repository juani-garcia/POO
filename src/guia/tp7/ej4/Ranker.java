package guia.tp7.ej4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ranker {
    private final SortedSet<Book> ranking;

    public Ranker(){
        ranking = new TreeSet<>(Comparator.comparingInt(Book::getRank).reversed().thenComparing(Book::getTitle));
    }

    public void add(Genre genre, Book book){
        book.setGenre(genre);
        ranking.add(book);
    }

    public Book remove(Book book){
        Iterator<Book> it = ranking.iterator();
        while(it.hasNext()){
            Book b = it.next();
            if(b.getTitle().equals(book.getTitle())){
                it.remove();
                return b;
            }
        }
        return null;
    }

    public void rateUp(Book book){
        Book rmv = remove(book);
        if(rmv == null){
            book.increment();
            add(Genre.NS, book);
        }else{
            rmv.increment();
            add(rmv.getGenre(), rmv);
        }
    }

    public void printRanking(){
        System.out.println("General ranking");
        ranking.forEach(System.out::println);
    }

    public void printRanking(Genre genre){
        System.out.println("Ranking of " + genre);
        ranking.stream().filter(e -> e.getGenre().equals(genre)).forEach(System.out::println);
    }
}
