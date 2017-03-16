package Practica1;

/**
 * Created by marcos on 14/3/17.
 */
//brian.re....
public class Ejercicio2 {



    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return factorial(n - 1) * n;

        }
    }

    public static double sucesionN(int n) {
        double exponente = 0;
        double result = 1;
        if (exponente <= n) {
            result = result + Math.pow(2, exponente + 1);
            exponente++;
        } else {
            return result;
        }
        return sucesionN(n);
    }



    public static int fibbonacci(int n) {
        if (n == 0) {
            return 0;
        }


        if (n == 1) {
            return 1;
        }


        return fibbonacci(n - 1) + fibbonacci(n - 2);

    }

    public static double mcd(double a, double b){
return 1;
    }
}
