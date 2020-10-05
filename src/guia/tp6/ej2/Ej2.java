package guia.tp6.ej2;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

   public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(6);
       list.add(8);
       list.add(10);
       list.add(3);
       list.add(5);
       list.add(7);
       /*
       * Falla pues se intenta modificar los elementos de la lista
       * al recorrerla, pudiendo causar problemas para iterar.
       * La solucion correcta es utilizar el metodo de instancia
       * removeIf
       for (Integer i : list) {
           if (i % 2 == 0) {
               list.remove(i);
           }
       } */
       list.removeIf(o -> o % 2 == 0);
       System.out.println(list);
   }

}
