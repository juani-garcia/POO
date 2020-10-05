package guia.tp5.ej5;

import java.util.EmptyStackException;

public class StackTester {

   public static void main(String[] args) {
       Stack<Integer> stack = new ArrayStack<>();
       stack.push(2);
       stack.push(3);
       System.out.println(stack);
       System.out.println(stack.peek()); 
       System.out.println(stack.pop());
       System.out.println(stack.isEmpty());
       System.out.println(stack.pop());
       System.out.println(stack.isEmpty());
       try {
           System.out.println(stack.pop());
       } catch(EmptyStackException e){
           System.out.println("Empty Stack");
       }
   }

}
