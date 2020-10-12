package guia.tp7.ej8;

import java.util.HashMap;
import java.util.Map;

public class ShopDiscountsProvider {

   private Map<String, Double> discounts = new HashMap<>();

   public void addShop(String shop, double discount) {
       this.discounts.put(shop, discount);
   }

   public double getDiscount(String shop) {
       return discounts.getOrDefault(shop, 0.0);
   }

}
