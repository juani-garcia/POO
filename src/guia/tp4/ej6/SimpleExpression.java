package guia.tp4.ej6;

public class SimpleExpression implements Expression{
    boolean value;

    public SimpleExpression(boolean value) {
        this.value = value;
    }

    public void setValue(boolean value){this.value = value;}

    @Override
    public boolean evaluate() {
        return this.value;
    }

}
