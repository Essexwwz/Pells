public class Pell {
    public Pell() {

    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        if(n ==0) return 0;
        if(n ==1) return 1;
        long n1 = 0; long n2 = 1;
        long n3 = 0;
        for(int i = 2; i<= n; i++){
            n3 = 2*n2 + n1;
            n1 = n2; n2 = n3;
        }
        return n3;
    }

}
