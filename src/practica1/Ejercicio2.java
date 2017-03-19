package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
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

    public static double iterativeTwoToThePowerOf(int n) {
        int result = 1;
        for(int i = 0; i < n; i++){
            result = result*2;
        }
        return result;
    }

    public static int recursiveTwoToThePowerOf(int n){
        return recursiveTwoToThePowerOf(n, 1, 0);
    }

    private static int recursiveTwoToThePowerOf(int n,int partialResult, int index){
        if((index+1) > n){
            return partialResult;
        }
        return recursiveTwoToThePowerOf(n, partialResult*2, index + 1);
    }

    public static int recursiveFibbonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursiveFibbonacci(n - 1) + recursiveFibbonacci(n - 2);
    }

    static int iterativeFibonacci(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    static int recursiveMCD(int a, int b) {
        if(b==0)
            return a;
        else
                return recursiveMCD(b, a % b);
}

    static int iterativeMCD(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
