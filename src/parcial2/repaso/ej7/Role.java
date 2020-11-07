package parcial2.repaso.ej7;

public enum Role {
    ESTUDIANTE(2),
    AYUDANTE(10),
    JTP(11),
    RESPONSABLE(12);

    private final int days;

    Role(int days){
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
