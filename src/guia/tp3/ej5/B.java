package guia.tp3.ej5;

public class B extends A {
    public void print(Number num) {
        System.out.println(String.format(MESSAGE,"B","Number",num,num.getClass()));
    }
}
