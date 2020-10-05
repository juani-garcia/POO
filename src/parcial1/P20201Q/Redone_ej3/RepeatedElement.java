package parcial1.P20201Q.Redone_ej3;

public class RepeatedElement extends Element{
    private Element elem;
    private int times;

    public RepeatedElement(Element elem, int times){
        this.elem = elem;
        this.times = times;
    }

    @Override
    public String getContents(){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < times; i++){
            ans.append(elem.toString());
            ans.append("\n");
        }
        return ans.toString();
    }
}
