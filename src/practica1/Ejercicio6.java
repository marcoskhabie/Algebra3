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

    public static void main(String[] args) {

        System.out.println(primeFactors(50));

        System.out.println(recursiveAmtOfPrimeFactors(50));
    }

    /**
     * Verifies if a positive Integer Number is a Prime Number.
     * @param number
     * @return
     */
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

    /**
     * Given an integer it looks for the nearest (higher or equal) prime number.
     * @param n
     * @return
     */

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

    /**
     * Given an integer it verifies which are its prime factors.
     * @param number
     * @return
     */
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


    /**
     * Given an integer it verifies which are its prime factors.
     * @param number
     * @return
     */
    public static List<Integer> recursivePrimeFactors(int number){
        List<Integer> primeFactor = new ArrayList<>();
        recursivePrimeFactors(number, number -1, primeFactor);
        return primeFactor;

    }

    private static void recursivePrimeFactors(int number, int counter, List<Integer> factors){
        int n = number;
        if(counter < 2){
            return;
        }
        while (n % counter == 0) {
            factors.add(counter);
            n /= counter;
        }
        recursivePrimeFactors(number, counter - 1, factors);
    }

    /**
     * Given an integer it verifies the amount of prime factors it has.
     * @param number
     * @return
     */
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

    /**
     * Given an integer it verifies the amount of prime factors it has.
     * @param number
     * @return
     */
    public static int recursiveAmtOfPrimeFactors(int number) {
        return recursiveAmtOfPrimeFactors(number, 2);
    }

    private static int recursiveAmtOfPrimeFactors(int number, int counter){
        int n = number;
        int result = 0;
        if(counter > n){
            return 0;
        }
        while (n % counter == 0) {
            result++;
            n /= counter;
        }

        return result + recursiveAmtOfPrimeFactors(n, counter +1);
    }




}
