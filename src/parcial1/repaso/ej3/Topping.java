package parcial1.repaso.ej3;

public enum Topping {
    CEBOLLA(10, "Cebolla"),
    QUESO(20, "Extra Queso"),
    TOMATE(30, "Tomate");

    private double value;
    private String description;

    Topping(int value, String description){
        this.value = value;
        this.description = description;
    }

    public double getValue(){
        return value;
    }

    @Override
    public String toString(){
        return String.format(" con %s", description);
    }
}
