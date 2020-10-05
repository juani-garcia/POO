package parcial1.repaso.ej3;


public class PizzaTester {

  public static void main(String[] args) {
     // Pizza a la parrilla con Tomate
     Pizza pizza1 = new Pizza(Coccion.valueOf("PARRILLA"), new Topping[] {Topping.valueOf("TOMATE")});
     // Pizza a la parrilla con Tomate con Cebolla con Extra queso
     Pizza pizza2 = new Pizza(Coccion.valueOf("PARRILLA"), Topping.values());
     // Pizza al horno con Cebolla con Extra queso
     Pizza pizza3 = new Pizza(Coccion.valueOf("HORNO"), new Topping[] {Topping.valueOf("CEBOLLA"), Topping.valueOf("QUESO")});
     System.out.println(pizza1);
     System.out.println(pizza2);
     System.out.println(pizza3);
  }

}
