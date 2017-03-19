package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
public class Ejercicio4 <T extends Comparable<T>>{

    /**
     * verifies if an array complies with array[0] == array[n], array[1] == array[n-1], etc.
     * @param array
     * @return
     */
    public boolean iterativeCapicua(T[] array){
        int n = array.length;

        for (int i = 0, j = n-1; i< j; i++, j--){
            if(array[i].compareTo(array[j]) != 0){
                return false;
            }
        }
        return true;
    }

    public boolean recursiveCapicua(T[] array){
        return recursiveCapicua(array, 0, array.length - 1);
    }

    private boolean recursiveCapicua(T[] array, int leftIndex, int rightIndex){
        if(leftIndex >= rightIndex){
            return true;
        }

        if(array[leftIndex] != array[rightIndex]){
            return false;
        }
        return recursiveCapicua(array, leftIndex + 1, rightIndex -1);
    }
}
