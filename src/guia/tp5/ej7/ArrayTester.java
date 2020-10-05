package guia.tp5.ej7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTester {

   public static void main(String[] args) {
       Integer[] intArray = new Integer[]{7, 3, 1, 5, 9};
       System.out.println(Arrays.toString(intArray));
       Arrays.sort(intArray);
       System.out.println(Arrays.toString(intArray));
       Pair < String , String > stringPair1 = new Pair <>( "hola" , "mundo" );
       Pair < String , String > stringPair2 = new Pair <>( "hola" , "adiós" );
       Pair < String , String > stringPair3 = new Pair <>( "buenos" , "días" );
       Pair<String, String> pairArray [] = new Pair []{ stringPair1 , stringPair2 , stringPair3 };
       Arrays.sort(pairArray);
       System.out.println( Arrays . toString ( pairArray ));
       Arrays.sort(intArray, (o1, o2) -> -o1.compareTo(o2));
       System.out.println(Arrays.toString(intArray));
       Arrays.sort(pairArray, (o1, o2) -> o2.compareTo(o1));
       System.out.println(Arrays.toString(pairArray));
   }
}
