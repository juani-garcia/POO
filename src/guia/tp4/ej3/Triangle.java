package guia.tp4.ej3;

public class Triangle extends Figure {
    protected Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public double area() {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-A.distanceTo(B))*(s-B.distanceTo(C))*(s-C.distanceTo(A)));
    }

    @Override
    public double perimeter() {
        return A.distanceTo(B)+B.distanceTo(C)+C.distanceTo(A);
    }

    @Override
    public String toString(){
        return "Triangle["+A+","+B+","+C+"]";
    }
}
