package guia.tp4.ej2;

public class CompositeFunction implements Function{
    Function f, g;

    CompositeFunction(Function f, Function g){
        this.f = f;
        this.g = g;
    }

    @Override
    public double evaluate(double x) {
        return g.evaluate(f.evaluate(x));
    }
}
