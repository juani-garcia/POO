package guia.tp4.ej6;

public abstract class ExpressionType implements Expression{
    Expression exp1;
    Expression exp2;

    public ExpressionType(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
