package practica1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
public class Ejercicio6 {
    /**
     * Verifies if a positive Integer Number is a Prime Number.
     * Given an integer it looks for the nearest (higher or equal) prime number.
     * Given an integer it verifies the amount of prime factors it has.
     * Given an integer it verifies which are its prime factors.
     */
    public static void main(String[] args) {
        System.out.println(primeFactors(33));
    }

    public boolean iterativeIntegerIsPrimeNumber(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean recursiveIntegerIsPrimeNumber(int number){
        return recursiveIntegerIsPrimeNumber(number, 2);
    }

    private boolean recursiveIntegerIsPrimeNumber(int number, int index){
        if(index > Math.sqrt(number)){
            return true;
        }

        if(number % index == 0){
            return false;
        }

        return recursiveIntegerIsPrimeNumber(number, index +1);
    }

    public int iterativeClosestBiggerOrEqualPrimeNumber(int n){
        int i = n;
        while(true){

            if (iterativeIntegerIsPrimeNumber(i)){
                return i;
            }
            i++;
        }
    }

    public int recursiveClosestBiggerOrEqualPrimeNumber(int n){
        if (iterativeIntegerIsPrimeNumber(n)){
            return n;
        }
        return recursiveClosestBiggerOrEqualPrimeNumber(n + 1);
    }

    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static int amountOfPrimeFactors(int number) {
        int n = number;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result++;
                n /= i;
            }
        }
        return result;
    }




}
