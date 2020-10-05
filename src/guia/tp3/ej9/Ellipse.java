package guia.tp3.ej9;

public class Ellipse extends Figure{
    Point center;
    double mayor, minor;

    public Ellipse(Point center, double mayor, double minor) {
        this.center = center;
        this.mayor = mayor;
        this.minor = minor;
    }

    @Override
    public double area() {
        return mayor*minor*Math.PI;
    }

    public double getMayor() {
        return mayor;
    }

    public double getMinor() {
        return minor;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*Math.sqrt((Math.pow(mayor,2)+Math.pow(minor,2))/2);
    }

    public String toString(){
        return "Ellipse["+center+","+mayor+","+minor+"]";
    }
}
