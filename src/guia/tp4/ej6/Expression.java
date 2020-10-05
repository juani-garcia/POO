package guia.tp4.ej6;

public interface Expression {
    boolean evaluate();

    default Expression not(){
        return new NotExpression(this);
    }

    default Expression or(Expression e){
        return new OrExpression(this, e);
    }

    default Expression and(Expression e){
        return new AndExpression(this,e);
    }
}
