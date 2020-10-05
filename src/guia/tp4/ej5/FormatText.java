package guia.tp4.ej5;

public abstract class FormatText implements HTMLText{
    protected HTMLText text;
    protected String aux;

    public FormatText(HTMLText text, String letra) {
        this.text = text;
        this.aux = letra;
    }

    @Override
    public String source() {
        return String.format("<%s>%s</%s>", aux, text, aux);
    }

    @Override
    public String toString(){
        return source();
    }

}
