package guia.tp6.ej6;

import java.time.LocalDate;

public class PersonCollectionImplTester {
    public static void main(String[] args) {
        Person juan = new Person("Juan", "Garcia", LocalDate.of(2001,2,23));
        Person ale = new Person("Ale", "Garcia", LocalDate.of(1963,1,3));
        Person agus = new Person("Agus", "Attas", LocalDate.of(1999, 7, 21));
        Person mat = new Person("Mateo", "BH", LocalDate.of(2001, 6, 22));
        PersonCollectionImpl people = new PersonCollectionImpl();
        people.addPerson(juan);
        people.addPerson(mat);
        people.addPerson(agus);
        people.addPerson(ale);
        System.out.println(people);
        System.out.println(people.findByLastName("BH"));
        System.out.println(people.findByLastName("Garcia"));
        System.out.println(people.findByName("Agus", "Attas"));
        System.out.println(people.findByName("Agustina", "Attas"));
    }
}
