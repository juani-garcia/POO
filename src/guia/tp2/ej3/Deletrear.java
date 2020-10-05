package guia.tp2.ej3;

public class Deletrear {

    String spelled;

    Deletrear(String src){ spelled = src.replaceAll("", "-").substring(1, src.length()*2);
    }

    public String getSpelled() {
        return spelled;
    }

    public static void main(String[] args) {
        for(String s : args){
            System.out.println(new Deletrear(s).getSpelled());
        }
    }
}
