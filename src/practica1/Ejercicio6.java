package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
public class Ejercicio6 {

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




    public int closestBiggerOrEqualPrimeNumber(int n){
        int i = n;
        while(true){

            if (integerIsPrimeNumber(i)){
                return i;
            }
            i++;
        }
    }
}
