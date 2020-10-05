package guia.tp4.Redone_ej6;

public class AndExpression implements Expression{
    Expression exp1, exp2;

    public AndExpression(Expression exp1, Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean evaluate() {
        return exp1.evaluate() && exp2.evaluate();
    }
}
