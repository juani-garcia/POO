package parcial2.R20201Q.ej2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedicalSystem {
    private final Map<String, Doctor> doctors;

    public MedicalSystem(){
        doctors = new HashMap<>();
    }

    public void addDoctor(String name, Role role){
        doctors.putIfAbsent(name, new Doctor(role));
    }

    public void book(String date, String doctor, String patient, int hour){
        getDoctor(doctor).book(date, patient, hour);
    }

    public List<String> getBookings(String date, String doctor){
        return getDoctor(doctor).getBookings(date);
    }

    private Doctor getDoctor(String doctor){
        if(!doctors.containsKey(doctor)){
            throw new MedicalSystemException("El doctor indicado no existe");
        }
        return doctors.get(doctor);
    }
}
