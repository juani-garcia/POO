package guia.tp6.ej5;
import java.util.ArrayList;

public class CompositeFunction implements Function {
    ArrayList<Function> functions;

    public CompositeFunction(){
        this.functions = new ArrayList<>();
    }

    public void addFunction(Function f){
        functions.add(f);
    }

    @Override
    public double evaluate(double x){
        if(functions.isEmpty())
            throw new IllegalStateException();
        double ans = x;
        for(Function f : functions){
            ans = f.evaluate(ans);
        }
        return ans;
    }
}
