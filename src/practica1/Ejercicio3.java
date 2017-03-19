package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
public class Ejercicio3 {

    /**
     * Given a integer, the operation returns the amount of 0 in the number
     * @param num
     * @return
     */
    public static int iterativeAmountOfCeros(int num){
        int amount = 0;

        while(num > 0) {
            if(num % 10 == 0)
                amount++;
            num /= 10;
        }

        return amount;
    }

    public static int recursiveAmountOfCeros(int num){
        return recursiveAmountOfCeros(num, 0);
    }
    private static int recursiveAmountOfCeros(int num, int amount){
        if(num <= 0){
            return amount;
        }

        if(num % 10 == 0)
            amount++;

        num /= 10;

        return recursiveAmountOfCeros(num, amount);
    }



}
