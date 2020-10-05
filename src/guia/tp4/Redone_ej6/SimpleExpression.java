package guia.tp4.Redone_ej6;

public class SimpleExpression implements Expression{
    private boolean value;

    public SimpleExpression(boolean value){
        this.value = value;
    }

    public void setValue(boolean value){
        this.value = value;
    }

    public boolean evaluate(){
        return value;
    }
}
