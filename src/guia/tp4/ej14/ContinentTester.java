package guia.tp4.ej14;

public class ContinentTester {

   public static void main(String[] args) {
       System.out.println("Densidades de población:");
       for(Continent continent : Continent.values()) {
           System.out.println(String.format("%s = %.2f", continent, continent.getPopulationRatio()));
       }
       System.out.printf("%.2f", Continent.valueOf("AMERICA").getPopulationRatio());
   }

}
