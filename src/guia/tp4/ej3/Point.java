package guia.tp4.ej3;

public class Point{
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point other){
        return (Math.sqrt(Math.pow((x-other.x),2)+Math.pow((y-other.y),2)));
    }

    @Override
    public String toString(){
        return "{"+x+","+y+"}";
    }

}
