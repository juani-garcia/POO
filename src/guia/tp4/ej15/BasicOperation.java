package guia.tp4.ej15;

public enum BasicOperation {
    SUM("+"){
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT("-"){
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY("*"){
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/"){
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private String op;

    BasicOperation(String op){
        this.op = op;
    }

    public abstract double apply(double x, double y);


    @Override
    public String toString() {
        return op;
    }
}
