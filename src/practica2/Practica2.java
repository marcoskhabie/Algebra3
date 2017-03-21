package practica2;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 2.
 */
public class Practica2 implements Practice2{

    public static void main(String[] args) {

    }

    @Override
    public long exercise8(int m, int n) {
        return 0;
    }

    @Override
    public long exercise9(int m, int n, int r, int s) {
        long result = 0;
        for (int j = m; j <= n; j++) {
            for (int k = r; j <= s; k++) {
                result = result + (j * k);
            }
        }
        return result;
    }

    @Override
    public long exercise10(int n) {
        int index=n;
        long result=0;
        while(n>0){
            result=result+n* (long)Math.pow(2,n);
            index--;
        }
        return result;
    }

    @Override
    public double exercise11Sumation(int n, int x) {
        double result = 0;

        for(int i = 0; i<= n; i++){
            result += i * (Math.pow(x, i));
        }

        return result;
    }

    @Override
    public double exercise11Formula(int n, int x) {
        return ((n*Math.pow(x, n+2) - (n+1)*Math.pow(x, n+1) + x)/Math.pow(x-1,2));
    }
}
