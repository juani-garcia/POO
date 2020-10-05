package parcial1.R20201Q.ej3;

public class SquareElement extends RectangularElement {
    public SquareElement(int dim){
        super(dim, dim);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
