package guia.tp3.ej3;

public class Tester6 {
    public static void main(String[] args) {
        Point[] points = new Point[10];
        for (Point point : points) {
            System.out.println(point.getX() + ", " + point.getY());
        } // Null pointer: points[i] no esta inicializado

    }
}
