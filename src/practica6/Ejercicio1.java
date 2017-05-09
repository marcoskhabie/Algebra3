package practica6;

/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class Ejercicio1 {

    public int sumOfDiagonal(int[][] squareMatrix){
        int sum = 0;
        for (int i = 0; i < squareMatrix.length; i++) {
            sum += squareMatrix[i][i];
        }
        return sum;
    }

    public int sumOfSecondaryDiagonal(int[][] squareMatrix){
        int sum = 0;
        for (int i = 0; i < squareMatrix.length; i++) {
            sum += squareMatrix[i][i];
        }
        return sum;
    }



}
