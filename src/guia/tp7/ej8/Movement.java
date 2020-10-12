package guia.tp7.ej8;

public class Movement {
    private final MovementType type;
    private final double amount;
    private String shop;

    public Movement(MovementType type, double amount){
        this.type = type;
        this.amount = amount;
        this.shop = "";
    }

    public Movement(MovementType type, double amount, String shop){
        this.type = type;
        this.amount = amount;
        this.shop = " for shop " + shop;
    }

    @Override
    public String toString() {
        return String.format("%s $%.1f%s", type, amount, shop);
    }
}
