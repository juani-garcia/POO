package parcial2.R20201Q.ej2;

import java.util.*;
import java.util.stream.Collectors;

public class Doctor {
    private final Role role;
    private final Map<String, SortedMap<Integer, String>> calendar;

    public Doctor(Role role){
        this.role = role;
        calendar = new HashMap<>();
    }

    public void book(String date, String patient, int hour){
        if(!role.canBook(hour)){
            throw new MedicalSystemException("Hora fuera del rango del horario medico");
        }
        calendar.putIfAbsent(date, new TreeMap<>());
        if(calendar.get(date).containsKey(hour)){
            throw new MedicalSystemException("Ya existe un turno a esa hora");
        }
        // El medico trabaja en ese horario y esta disponible -> lo agrego
        calendar.get(date).put(hour, patient);
    }

    public List<String> getBookings(String date){
        return new ArrayList<>(calendar.getOrDefault(date, new TreeMap<>()).values());
    }


}
