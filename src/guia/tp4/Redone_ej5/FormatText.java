package guia.tp4.Redone_ej5;

public abstract class FormatText implements HTMLText{
    protected HTMLText text;
    protected String aux;

    public FormatText(HTMLText text, String letter){
        this.text = text;
        this.aux = letter;
    }

    public String source(){
        return String.format("<%s>%s</%s>", aux, text.source(), aux);
    }

    @Override
    public String toString() {
        return source();
    }
}
