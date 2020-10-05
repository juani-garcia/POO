package parcial1.R20201Q.ej3;

public abstract class PrintableElement {
    private static final String CHAR = "#";
    public abstract int getHeight();
    public abstract int getWidth();

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        int height = getHeight(), width = getWidth();
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                s.append(CHAR);
            }
            s.append("\n");
        }
        return s.toString();
    }

}
