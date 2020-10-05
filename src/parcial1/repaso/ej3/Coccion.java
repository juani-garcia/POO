package parcial1.repaso.ej3;

public enum Coccion {
    HORNO(100, " al horno"),
    PARRILLA(150, " a la parrilla");

    private double value;
    private String description;

    public double getValue(){
        return value;
    }

    Coccion (int value, String description){
        this. value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
