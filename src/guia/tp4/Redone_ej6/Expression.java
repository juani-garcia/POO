package guia.tp4.Redone_ej6;

public interface Expression {
    boolean evaluate();

    default Expression not(){
        return new NotExpression(this);
    }

    default Expression and(Expression o) {
        return new AndExpression(this, o);
    }

    default Expression or(Expression o) {
        return new OrExpression(this, o);
    }
}
