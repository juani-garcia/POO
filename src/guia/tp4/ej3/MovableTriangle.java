package guia.tp4.ej3;

public class MovableTriangle extends Triangle implements MovableFigure{

    public MovableTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public MovablePoint[] getPoints() {
        MovablePoint[] arr = {(MovablePoint)A, (MovablePoint)B, (MovablePoint)C};
        return arr;
    }
}
