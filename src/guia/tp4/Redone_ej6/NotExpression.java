package guia.tp4.Redone_ej6;

public class NotExpression implements Expression{
    Expression exp;

    public NotExpression(Expression exp){
        this.exp = exp;
    }

    @Override
    public boolean evaluate() {
        return !exp.evaluate();
    }
}
