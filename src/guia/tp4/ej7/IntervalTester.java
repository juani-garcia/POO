package guia.tp4.ej7;

public class IntervalTester {
    public static void main(String[] args) {
        Interval interval = new Interval(1, 4);
        Interval bigInterval = new Interval(100, 200, 50);
        System.out.println(interval.at(2));
        System.out.println(interval.count(new IntervalCondition() {
            @Override
            public boolean belongs(double value) {
                return value % 4 == 0;
            }}));
        System.out.println(interval.count(value -> value>0));
        System.out.println(interval.includes(2));
        System.out.println(interval.indexOf(2));
        System.out.println(interval.size());
        System.out.println(bigInterval.at(2));
        System.out.println(bigInterval.includes(2));
        System.out.println(bigInterval.indexOf(2));
        System.out.println(bigInterval.size());
        try {
            System.out.println(interval.at(120));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
