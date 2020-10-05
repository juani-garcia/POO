package parcial1.P20201Q.Redone_ej3;

public abstract class Element {

    public abstract String getContents();

    @Override
    public String toString() {
    return getContents();
    }

    public Element above(Element other){
        return new StackedElement(this, other);
    }

    public Element below(Element other){
        return new StackedElement(other, this);
    }

    public Element repeat(int times){
        return new RepeatedElement(this, times);
    }
}