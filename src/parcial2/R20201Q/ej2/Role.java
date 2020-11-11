package parcial2.R20201Q.ej2;

public enum Role {
    PART_TIME(8, 12),
    FULL_TIME(8, 16),
    ON_CALL(0, 24);

    private int minHour, maxHour;

    Role(int minHour, int maxHour) {
        this.minHour = minHour;
        this.maxHour = maxHour;
    }

    boolean canBook(int hour){
        return hour >= minHour && hour < maxHour;
    }

}
