package parcial1.P20201Q.ej3;

public class TextElement extends Element{
    String text;

    public TextElement(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getContents() {
        return text;
    }
}
