package parcial1.P20201Q.ej3;

public class Above extends Element{
    private Element e1, e2;

    public Above(Element e1, Element e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public String getContents() {
        return String.format("%s\n%s", e1, e2);
    }
}
