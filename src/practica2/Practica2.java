package practica2;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 2.
 */
public class Practica2 implements Practice2{

    /**
     * Calculate te summation of i from m to n.
     * m must be smaller or equal to n.
     * @param m start of the summation
     * @param n end of the summation
     * @return
     */
    @Override
    public long exercise8(int m, int n) {
        if(m > n){
            throw new IllegalArgumentException();
        }
        int result = 0;

        for(int i = m; i<= n; i++){
            result += i;
        }
        return result;
    }

    /**
     * Calculate the double summation of j from m to n, and k from r to s
     * of i * k .
     *
     *
     * @param m start of the summation of j
     * @param n end of the summation of j
     * @param r start of the summation of k
     * @param s end of the summation of k
     * @return
     */
    @Override
    public long exercise9(int m, int n, int r, int s) {
        long result = 0;
        for (int j = m; j <= n; j++) {
            for (int k = r; k <= s; k++) {
                result += (j * k);
            }
        }
        return result;
    }

    /**
     * Calculates the summation of i * 2^i from 1 to n
     * @param n end of the summation
     * @return
     */
    @Override
    public long exercise10(int n) {
        long result=0;
        for(int i = 1; i <= n; i++){
            result += n* (long)Math.pow(2,n);
        }
        return result;
    }

    /**
     * Calculate the summation of i * x^i from 0 to n given a value of x
     * @param n
     * @param x
     * @return
     */
    @Override
    public double exercise11Sumation(int n, int x) {
        double result = 0;

        for(int i = 0; i<= n; i++){
            result += i * (Math.pow(x, i));
        }

        return result;
    }

    /**
     * Resolves the series of i * x^i from 0 to n given a value of x using
     * a specific formula
     * @param n
     * @param x
     * @return
     */
    @Override
    public double exercise11Formula(int n, int x) {
        return ((n*Math.pow(x, n+2) - (n+1)*Math.pow(x, n+1) + x)/Math.pow(x-1,2));
    }
}
