package guia.tp6.ej9;

import java.util.*;

public class TimeSetImpl<E> implements TimeSet<E>{
    private final Map<E, TimeElem> ts;

    public TimeSetImpl() {
        this.ts = new HashMap<>();
    }

    @Override
    public void add(E elem, int hours, int minutes) {
        TimeElem time = new TimeElem(hours, minutes);
        ts.put(elem, time);
    }

    @Override
    public void remove(E elem) {
        ts.remove(elem);
    }

    @Override
    public int size() {
        return ts.size();
    }

    @Override
    public boolean contains(E elem) {
        return ts.containsKey(elem);
    }

    @Override
    public Set<E> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        TimeElem timeFrom = new TimeElem(hoursFrom, minutesFrom);
        TimeElem timeTo = new TimeElem(hoursTo, minutesTo);
        Set<E> ans = new HashSet<>();
        for(E key : ts.keySet()){
            TimeElem time = ts.get(key);
            if(time.compareTo(timeFrom) >= 0 && time.compareTo(timeTo) <= 0)
                ans.add(key);
        }
        return ans;
    }

    private static class TimeElem implements Comparable<TimeElem>{
        private final int hour, minutes;

        TimeElem(int hour, int minutes) {
            this.hour = hour;
            this.minutes = minutes;
        }

        @Override
        public int compareTo(TimeElem o) {
            int cmp = Integer.compare(hour, o.hour);
            if(cmp == 0)
                cmp = Integer.compare(minutes, o.minutes);
            return cmp;
        }
    }
}
