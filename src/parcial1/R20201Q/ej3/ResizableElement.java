package parcial1.R20201Q.ej3;

public class ResizableElement extends PrintableElement{
    private PrintableElement elem;
    private int scale;

    public ResizableElement(PrintableElement elem, int scale){
        this.elem = elem;
        this.scale = scale;
    }

    public void resize(int newScale){
        this.scale = newScale;
    }

    @Override
    public int getHeight() {
        return scale * elem.getHeight();
    }

    @Override
    public int getWidth() {
        return scale * elem.getWidth();
    }

}
