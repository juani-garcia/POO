package guia.tp6.ej10;

public class Person {
    private final String name;
    private final int age;

    @Override
    public String toString() {
        return String.format("%s # %d", name, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
