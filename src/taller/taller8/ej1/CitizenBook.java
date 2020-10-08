package taller.taller8.ej1;

import java.util.*;

public class CitizenBook {
    private Map<String, SortedSet<Citizen>> cb;
    private Comparator<Citizen> cmp = Comparator.comparing(Citizen::getFn).thenComparingInt(Citizen::getId);

    public CitizenBook(){
        this.cb = new HashMap<>();
    }

    public void add(Citizen c){
        cb.putIfAbsent(c.getLn(), new TreeSet<>(cmp));
        cb.get(c.getLn()).add(c);
    }

    public SortedSet<Citizen> getByLastName(String ln){
        return cb.getOrDefault(ln, new TreeSet<>(cmp));
    }
}
