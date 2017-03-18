package practica1;

/**
 * Created by agustin on 14/3/17.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println(iterativeAmountOfCeros(12020));
        System.out.println(recursiveAmountOfCeros(12020));
    }

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
