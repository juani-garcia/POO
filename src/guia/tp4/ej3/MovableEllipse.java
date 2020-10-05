package guia.tp4.ej3;

public class MovableEllipse extends Ellipse implements MovableFigure{

    public MovableEllipse(Point center, double mayor, double minor) {
        super(center, mayor, minor);
    }

    @Override
    public MovablePoint[] getPoints() {
        MovablePoint[] arr = {(MovablePoint)center};
        return arr;
    }
}
