package practica1;

import java.util.NoSuchElementException;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
public class Ejercicio5 {

    /**
     * Verifies if a number is contained in the array of integers
     * @param array
     * @param number
     * @return
     */
    public static int recursiveBinarySearch(int[] array, int number){
        return recursiveBinarySearch(array, number, 0, array.length - 1);
    }
    private static int recursiveBinarySearch(int[] array, int number, int first, int last){

        if(first > last){
            throw new NoSuchElementException();
        }

        int middleIndex = (first + last) /2;

        if (array[middleIndex] == number)
            return middleIndex;

        if(array[middleIndex] < number){
            return recursiveBinarySearch(array, number, middleIndex +1, last);
        }
        else{
            return recursiveBinarySearch(array, number, first, middleIndex -1 );
        }
    }

    public static boolean iterativeSequentialSearch(int[] array, int number){
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }
}
