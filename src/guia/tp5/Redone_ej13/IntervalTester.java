package guia.tp5.Redone_ej13;

public class IntervalTester {

    public static void main(String[] args) {
        Interval interval = new Interval(-1, 1, 0.5);
        System.out.println(interval);
        System.out.println(interval.size());
        System.out.println(interval.at(3));
        System.out.println(interval.indexOf(0.5));
        System.out.println(interval.includes(0.5));
        System.out.println(interval.equals(new Interval(-1, 1, 0.5)));
        System.out.println(interval.hashCode() == new Interval(-1, 1, 0.5).hashCode());
        System.out.println(interval.count(value -> value > 0));
        System.out.println("######################");
        Interval interval2 = new Interval(0, 3, 0.25);
        for(Double value : interval2){
            System.out.println(value);
        }
    }

}