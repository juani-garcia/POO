package parcial1.P20201Q.ej3;

public class Repeat extends Element{
    private Element e;
    private int n;

    @Override
    public String getContents() {
        StringBuilder ans = new StringBuilder("");
        for(int i = 1; i < n; i++){
            ans.append(e.getContents());
            ans.append("\n");
        }
        ans.append(e.getContents());
        return ans.toString();
    }

    public Repeat(Element e, int n){
        this.e = e;
        this.n = n;
    }
}
