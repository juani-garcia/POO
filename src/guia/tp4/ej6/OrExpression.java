package guia.tp4.ej6;

public class OrExpression extends ExpressionType{

    public OrExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    @Override
    public boolean evaluate(){
        return exp1.evaluate() || exp2.evaluate();
    }
}
