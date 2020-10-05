package taller.taller5.ej1;

public class PhoneNumber implements Comparable<PhoneNumber>{
    private int areaCode, prefix, lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int cmp = Integer.compare(areaCode, o.areaCode);
        if(cmp == 0){
            cmp = Integer.compare(prefix, o.prefix);
            if(cmp == 0){
                cmp = Integer.compare(o.lineNumber, lineNumber);
            }
        }
        return cmp;
    }
}
