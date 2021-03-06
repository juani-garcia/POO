package parcial2.repaso.ej2;

import java.util.Iterator;

public class ReversedListTester {

   public static void main(String[] args) {
       ReversedList<Integer> list = new ReversedListImpl<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       Iterator<Integer> defaultIterator = list.defaultIterator();
       while(defaultIterator.hasNext()) {
           System.out.print(defaultIterator.next() + " ");
       }
       System.out.println();
       for (Integer integer : list) {
           System.out.print(integer + " ");
       }
   }

}
