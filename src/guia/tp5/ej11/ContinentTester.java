package guia.tp5.ej11;

import java.util.Arrays;
import java.util.Comparator;

public class ContinentTester {

   public static void main(String[] args) {
       Continent[] continents = new Continent[]{
               Continent.OCEANIA,
               Continent.AMERICA,
               Continent.EUROPE};
       Arrays.sort(continents, (o1, o2) -> (o1.getPopulation()-o2.getPopulation()));
       for(Continent continent : continents) {
           System.out.println(continent);
       }
   }

}
