package parcial1.P20201Q.Redone_ej3;

public class StackedElement extends Element{
    Element above, below;

    public StackedElement(Element above, Element below){
        this.above = above;
        this.below = below;
    }

    @Override
    public String getContents() {
        return String.format("%s\n%s", above, below);
    }
}
