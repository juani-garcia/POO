package parcial2.repaso.ej7;

import java.util.Objects;

public class Person {
    private final String name;
    private final Role role;

    public Person(String name, Role role){
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return name;
    }

    public Role getRole(){
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                role == person.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
}
