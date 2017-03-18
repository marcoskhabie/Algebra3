package practica1;

/**
 * Created by marcos on 14/3/17.
 */
//brian.re....
public class Ejercicio2 {



    public static int recursiveFactorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return recursiveFactorial(n - 1) * n;

        }
    }
    public static int iterativeFactorial(int n){

        int result=1 ;

        if(n<2) {

            return 1;
        }

        for(int i=2; i<=n; i++){
            result=result*i;

        }
        return result;
    }


    public static double exponential(int n) {
        double exponent = 0;
        double result = 1;
        if (exponent <= n) {
            result = result + Math.pow(2, exponent + 1);
            exponent++;
        } else {
            return result;
        }
        return exponential(n);
    }





    public static int reciursiveFibbonacci(int n) {
        if (n == 0) {
            return 0;
        }


        if (n == 1) {
            return 1;
        }


        return reciursiveFibbonacci(n - 1) + reciursiveFibbonacci(n - 2);

    }

    static int iterativefibonacci(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }



    public static double mcd(double a, double b){


return 1;
    }


}
