package parcial2.repaso.ej4;

public class Passenger {
    private String name;
    private int row;
    private PassengerCategory category;

    public Passenger(String name, int row, PassengerCategory category) {
        this.name = name;
        this.row = row;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return name;
    }

    public PassengerCategory getCategory() {
        return category;
    }
}
