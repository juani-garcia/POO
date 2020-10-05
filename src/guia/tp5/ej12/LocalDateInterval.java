package guia.tp5.ej12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate> {
    private LocalDate first, last;
    private int step;

    public LocalDateInterval(LocalDate first, LocalDate last, int step) {
        this.first = first;
        this.last = last;
        this.step = step;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new LocalDateIterator();
    }

    private class LocalDateIterator implements Iterator<LocalDate>{
        private LocalDate current = first;

        public boolean hasNext(){ return current.isBefore(last.plusDays(1)); }

        public LocalDate next(){
            if(!hasNext())
                throw new NoSuchElementException();
            LocalDate aux = current;
            current = current.plusDays(step);
            return aux;
        }
    }

}
