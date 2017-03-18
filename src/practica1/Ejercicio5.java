package practica1;

import java.util.NoSuchElementException;

/**
 * Created by agustin on 14/3/17.
 */
public class Ejercicio5 {

    public static int binarySearch(int[] array, int number){
        return binarySearch(array, number, 0, array.length - 1);
    }
    private static int binarySearch(int[] array, int number, int first, int last){

        if(first > last){
            throw new NoSuchElementException();
        }

        int middleIndex = (first + last) /2;

        if (array[middleIndex] == number)
            return middleIndex;

        if(array[middleIndex] < number){
            return binarySearch(array, number, middleIndex +1, last);
        }
        else{
            return binarySearch(array, number, first, middleIndex -1 );
        }
    }
}
