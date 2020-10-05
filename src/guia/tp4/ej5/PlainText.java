package guia.tp4.ej5;

public class PlainText implements HTMLText{
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String source() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
