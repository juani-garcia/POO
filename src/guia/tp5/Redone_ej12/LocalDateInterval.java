package guia.tp5.Redone_ej12;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class LocalDateInterval implements Iterable<LocalDate>{
    LocalDate first, last;
    int step;

    public LocalDateInterval(LocalDate first, LocalDate last, int step){
        this.first = first;
        this.last = last;
        this.step = step;
    }

    public Iterator<LocalDate> iterator(){
        return new Iterator<>(){
            private LocalDate current = first;

            @Override
            public boolean hasNext() {
                return current.isBefore(last.plusDays(1));
            }

            @Override
            public LocalDate next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                LocalDate ans = current;
                current = current.plusDays(step);
                return ans;
            }
        };
    }
}
