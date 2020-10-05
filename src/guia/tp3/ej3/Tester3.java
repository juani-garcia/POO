package guia.tp3.ej3;

public class Tester3 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 1);
        Point p2 = new Point(2, 1);
        System.out.println(p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY()));
    }
}
