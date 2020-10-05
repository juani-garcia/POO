package guia.tp4.ej7;

public class Interval {

    private double start, end, interval;

    public Interval(double start, double end, double interval) {
        if (end < start || interval == 0){
            throw new IllegalArgumentException("Argumentos invalidos!");
        }
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    long count(IntervalCondition b){
        long rsp=0;
        for (long i = 0; i < size(); i++){
            if (b.belongs(at(i))){
                rsp++;
            }
        }
        return rsp;
    }

    public Interval(double start, double end) {
        if (end < start){
            throw new IllegalArgumentException("Argumentos invalidos!");
        }
        this.start = start;
        this.end = end;
    }

    long indexOf(double valor){
        for (long i = 0; i < size(); i++){
            Double eval = start + interval * i;
            if(eval.equals(valor)){
               return i;
            }
        }
        return -1;
    }

    double at(long index){
        double rsp = start + interval*index;
        if (rsp > end){
            throw new IllegalArgumentException("El indice esta fuera del intervalo");
        }
        return rsp;
    }

    public long size(){
        return (long)((end - start)/interval) + 1;
    }


    boolean includes(double valor){
        if(valor >= start && valor <= end)
            return true;
        return false;
    }

}


