package guia.tp6.ej6;

import java.util.*;

public class PersonCollectionImpl implements PersonCollection{
    Map<String, List<Person>> people;

    public PersonCollectionImpl(){
        this.people = new HashMap<>();
    }

    @Override
    public void addPerson(Person aPerson) {
        people.putIfAbsent(aPerson.getLastName(), new ArrayList<>());
        people.get(aPerson.getLastName()).add(aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return people.get(lastName);
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        Person p = new Person(firstName, lastName, null);
        for(Person person : people.get(lastName)){
            if(person.equals(p))
                return person;
        }
        throw new NoSuchElementException();
    }

    @Override
    public String toString() {
        return people.toString();
    }
}
