package parcial2.repaso.ej7;

import java.time.LocalDate;
import java.util.*;

public class Library {
    private final Map<String, BookInfo> books  = new HashMap<>();
    private final Map<Person, BorrowType> borrowedBooks  = new HashMap<>();

    public Library addBook(String book, int stock){
        books.putIfAbsent(book, new BookInfo(book, stock));
        return this;
    }

    public void borrowBook(Person person, String book, LocalDate date){
        if(!books.containsKey(book)){
            throw new NoSuchElementException("Book not found");
        }
        books.get(book).borrowBook();
        borrowedBooks.putIfAbsent(person, new BorrowType(date.plusDays(person.getRole().getDays()), book));
    }

    public void printDueLoansBooks(LocalDate date){
        System.out.printf("Due loans at %s\n%n", date);
        for(Person p : borrowedBooks.keySet()){
            BorrowType borrow = borrowedBooks.get(p);
            if(borrow.isDueAt(date)){
                System.out.printf("%s (%s - %s)%n", p, borrow, borrow.dateDue.minusDays(p.getRole().getDays()));
            }
        }
    }

    public void returnBook(Person p){
        books.get(borrowedBooks.get(p).book).returnBook();
        borrowedBooks.remove(p);
    }

    private static class BorrowType{
        private final LocalDate dateDue;
        private final String book;

        public BorrowType(LocalDate date, String book) {
            this.dateDue = date;
            this.book = book;
        }

        private boolean isDueAt(LocalDate date){
            return date.isAfter(dateDue);
        }

        @Override
        public String toString() {
            return book;
        }
    }
}
