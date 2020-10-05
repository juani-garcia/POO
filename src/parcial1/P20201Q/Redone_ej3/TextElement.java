package parcial1.P20201Q.Redone_ej3;

public class TextElement extends Element{
    private String text;

    public TextElement(String text){
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }

    @Override
    public String getContents(){
        return text;
    }
}
