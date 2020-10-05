package guia.tp3.ej6;

public class Complex {
    private double re;
    private double im;

    Complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    Complex(Number re){
        this.re = re.doubleValue();
        this.im = 0;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    Complex plus(Complex c){
        return new Complex(re + c.re, im + c.im);
    }

    Complex plus(Number n){
        return new Complex(re + n.doubleValue(), im);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;
        Complex c = (Complex) o;
        return Double.compare(c.re, this.re) == 0 && Double.compare(c.im, this.im) == 0;
    }

    @Override
    public String toString(){
        return re+"+"+im+"i";
    }
}
