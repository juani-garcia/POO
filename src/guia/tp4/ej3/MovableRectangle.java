package guia.tp4.ej3;

public class MovableRectangle extends Rectangle implements MovableFigure{
    public MovableRectangle(Point bottomRight, Point topLeft) {
        super(bottomRight, topLeft);
    }

    @Override
    public MovablePoint[] getPoints() {
        MovablePoint[] arr = {(MovablePoint)topLeft, (MovablePoint)bottomRight};
        return arr;
    }
}
