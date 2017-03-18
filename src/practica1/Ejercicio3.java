package practica1;

/**
 * Created by agustin on 14/3/17.
 */
public class Ejercicio3 {


    public static int amountOfCeros(int num){
        int amount = 0;

        while(num > 0) {
            if(num % 10 == 0)
                amount++;
            num /= 10;
        }

        return amount;
    }
}
