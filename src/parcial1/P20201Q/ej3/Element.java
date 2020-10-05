package parcial1.P20201Q.ej3;

public abstract class Element {

    public abstract String getContents();

    @Override
    public String toString(){
        return getContents();
    }

    public Element above(Element other){
        return new Above(this, other);
    }

    public Element below(Element other){
        return new Above(other, this);
    }

    public Element repeat(int n){
        return new Repeat(this, n);
    }
}