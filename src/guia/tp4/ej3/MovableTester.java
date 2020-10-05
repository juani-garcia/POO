package guia.tp4.ej3;

public class MovableTester {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(new MovablePoint(0,0), 1);
        System.out.println(circle);
        circle.moveNorthEast(1, 1);
        System.out.println(circle);
        circle.moveSouthWest(1, 1);
        System.out.println(circle);
        circle.moveNorthWest(2,2);
        System.out.println(circle);
        circle.moveSouthEast(1,1
        );
        System.out.println(circle);
    }
}
