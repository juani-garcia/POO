package guia.tp3.ej9;

public class Rectangle extends Figure {
    private Point bottomRight, topLeft;

    public Rectangle(Point bottomRight, Point topLeft) {
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
    }

    public double base(){
        return Math.abs(bottomRight.getX()-topLeft.getX());
    }

    public double height(){
        return Math.abs(bottomRight.getY()-topLeft.getY());
    }

    @Override
    public double perimeter() {
        return 2*base()+2*height();
    }

    @Override
    public double area() {
        return base()*height();
    }

    @Override
    public String toString() {
        return "Rectangle["+bottomRight+","+topLeft+"]";
    }
}
