package parcial2.repaso.ej4;

import java.util.*;

public abstract class BoardingFlight {
    private final SortedSet<Passenger> passengers;

    public BoardingFlight(Comparator<Passenger> criteria){
        passengers = new TreeSet<>(criteria);
    }

    public void addForBoarding(String name, int row, PassengerCategory category){
        passengers.add(new Passenger(name, row, category));
    }

    public Iterator<String> boardingCallIterator(){
        return new Iterator<>() {
            private final Iterator<Passenger> it = passengers.iterator();
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public String next() {
                return it.next().getName();
            }
        };
    }
}
