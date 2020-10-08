package taller.taller8.ej1;

public class Citizen {
    private String fn, ln;
    private int id;

    public Citizen(int id, String fn, String ln) {
        this.fn = fn;
        this.ln = ln;
        this.id = id;
    }

    @Override
    public String toString() {
        return fn + " " + ln;
    }

    public String getFn() {
        return fn;
    }

    public String getLn() {
        return ln;
    }

    public int getId() {
        return id;
    }
}
