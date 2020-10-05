package parcial1.R20201Q.ej2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTimesCollectionTester {
    public static void main(String[] args) {
        TimesCollection<String> stringTimesCollection = new ArrayTimesCollection<>();
        stringTimesCollection.add("Hello");
        stringTimesCollection.add("World");
        for (String s : stringTimesCollection) {
            System.out.println(s);
        }

        System.out.println("------------");

        stringTimesCollection.setTimes(3);
        for(String s : stringTimesCollection){
            System.out.println(s);
        }
        System.out.println("------------");

        TimesCollection<Integer> integerTimesCollection = new ArrayTimesCollection<>();

        integerTimesCollection.add(1);
        integerTimesCollection.add(3);
        integerTimesCollection.add(5);
        integerTimesCollection.setTimes(2);
        Iterator<Integer> it1 = integerTimesCollection.iterator();

        integerTimesCollection.setTimes(3);
        Iterator<Integer> it2 = integerTimesCollection.iterator();

        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("-------------");
        try {
            it1.next();
        } catch (NoSuchElementException e){
            System.out.println("No more elements.");
        }
        System.out.println("--------------");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("--------------");
        try{
            integerTimesCollection.setTimes(-1);
        } catch (IllegalArgumentException e){
            System.out.println("Times parameter should be positive.");
        }
    }
}