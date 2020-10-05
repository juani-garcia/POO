package guia.tp4.ej15;

public enum ExtendedOperation{
    POWER("^"){
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    MODULO("%"){
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private String op;

    ExtendedOperation(String op){
        this.op = op;
    }

    public abstract double apply(double x, double y);


    @Override
    public String toString() {
        return op;
    }
}
