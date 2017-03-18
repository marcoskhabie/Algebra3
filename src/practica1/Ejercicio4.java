package practica1;

/**
 * Created by agustin on 14/3/17.
 */
public class Ejercicio4 <T extends Comparable<T>>{

    public boolean capicua(T[] array){
        int n = array.length;

        for (int i = 0, j = n-1; i< j; i++, j--){
            if(array[i].compareTo(array[j]) != 0){
                return false;
            }
        }
        return true;
    }
}
