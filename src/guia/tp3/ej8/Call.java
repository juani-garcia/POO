package guia.tp3.ej8;

public class Call {
    private String from , to;
    private int duration;
    private static final double COST_PER_SECOND = 0.01;

    public String getTo() {
        return to;
    }

    Call (String from , String to , int duration ) {
        this . from = from;
        this . to = to;
        this . duration = duration;
    }
    public double getCost () {
        return duration * COST_PER_SECOND;
    }
}