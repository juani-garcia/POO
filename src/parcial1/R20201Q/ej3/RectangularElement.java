package parcial1.R20201Q.ej3;

public class RectangularElement extends PrintableElement{
    private int width;
    private int height;

    public RectangularElement(int height, int width){
        this.width = width;
        this.height = height;

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

}

