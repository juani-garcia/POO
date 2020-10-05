package parcial1.repaso.ej3;

public class Pizza {
    private Coccion coccion;
    private Topping[] toppings;

    public Pizza(Coccion coccion, Topping[] toppings) {
        this.coccion = coccion;
        this.toppings = toppings;
    }

    @Override
    public String toString(){
        StringBuilder ans = new StringBuilder(String.format("Pizza%s", coccion.toString()));
        double cost = coccion.getValue();
        for(Topping topping : toppings){
            ans.append(topping);
            cost += topping.getValue();
        }
        ans.append(": $");
        ans.append(cost);
        return ans.toString();
    }
}
