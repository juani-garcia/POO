package guia.tp5.ej13;

import java.util.Iterator;

public class IntervalTester {

   public static void main(String[] args) {
       Interval interval = new Interval(-1, 1, 0.5);
       for(Double num : interval){
           System.out.println(num);
       }
       System.out.println("-----------");
       Iterator<Double> IntIt = interval.iterator();
       while(IntIt.hasNext())
           System.out.println(IntIt.next());
   }

}
