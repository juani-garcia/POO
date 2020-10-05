package guia.tp3.ej9;

public class Circle extends Ellipse{
    Circle(Point center, double radius){
        super(center, radius, radius);
    }

    @Override
    public String toString(){
        return "Circle [" + center + "," + getMinor() + "]";
    }
}
