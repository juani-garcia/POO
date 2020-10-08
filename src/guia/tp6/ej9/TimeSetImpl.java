package guia.tp6.ej9;

import java.util.*;

public class TimeSetImpl<E> implements TimeSet<E>{
    private final SortedSet<TimeElem<E>> ts;

    public TimeSetImpl(){
        this.ts = new TreeSet<>();
    }

    @Override
    public void add(E elem, int hours, int minutes) {
        remove(elem);
        TimeElem<E> te = new TimeElem<>(elem, hours, minutes);
        ts.add(te);
    }

    @Override
    public void remove(E elem) {
       Iterator<TimeElem<E>> it = ts.iterator();
       while(it.hasNext()){
           if(it.next().getElem().equals(elem)){
               it.remove();
               return;
           }
       }
    }

    @Override
    public int size() {
        return ts.size();
    }

    @Override
    public boolean contains(E elem) {
        for (TimeElem<E> t : ts) {
            if (t.getElem().equals(elem))
                return true;
        }
        return false;
    }

    @Override
    public Set<E> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        TimeElem<E> tf = new TimeElem<>(null, hoursFrom, minutesFrom);
        TimeElem<E> tt = new TimeElem<>(null, hoursTo, minutesTo);
        Set<E> ans = new HashSet<>();
        for(TimeElem<E> te : ts){
            if(te.compareTo(tt) > 0)
                break;
            if(te.compareTo(tf) > 0)
                ans.add(te.getElem());
        }
        return ans;
    }

    private static class TimeElem<T> implements Comparable<TimeElem<T>>{
        private final int hour, minutes;
        private final T elem;

        private TimeElem(T elem, int hour, int minutes) {
            this.hour = hour;
            this.minutes = minutes;
            this.elem = elem;
        }

        @Override
        public int compareTo(TimeElem o) {
            int cmp = Integer.compare(hour, o.hour);
            if(cmp == 0)
                cmp = Integer.compare(minutes, o.minutes);
            return cmp;
        }

        @Override
        public String toString() {
            return elem.toString();
        }

        private T getElem(){
            return elem;
        }
    }
}
