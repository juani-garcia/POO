package parcial1.repaso.Redone_ej2;

import java.util.NoSuchElementException;

public class ParallelIteratorTester {

   public static void main(String[] args) {
       String[] v1 = new String[]{"hola", "mundo", "adios"};
       Integer[] v2 = new Integer[]{0, 1};

       ParallelIterator<String, Integer> myIterator = new ParallelIterator<>(v1, v2);
       System.out.println(myIterator.next());
       System.out.println(myIterator.next());
       try {
           System.out.println(myIterator.next());
       } catch (NoSuchElementException ex) {
           System.out.println(ex.getClass());
       }

       System.out.println("##########");

       try {
           new ParallelIterator<>(null, v2);
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }

       System.out.println("##########");

       try {
           new ParallelIterator<>(v1, null);
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
   }

}