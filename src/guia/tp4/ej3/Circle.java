package guia.tp4.ej3;

public class Circle extends Ellipse {
    Circle(Point center, double radius){
        super(center, radius, radius);
    }

    @Override
    public String toString(){
        return "Circle [" + center + "," + getMinor() + "]";
    }
}
