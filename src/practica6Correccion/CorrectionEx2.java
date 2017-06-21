package practica6Correccion;
import practica6.Calculator;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class CorrectionEx2 implements Exercise2 {
    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        for (int i = 0; i <= matrix.length - 2; i++) {
            for (int j= i+1;j< matrix[i].length;j++){
                if (matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean exerciseB(double[][] squareMatrix, Calculator calculator) {

        for (int i = 0; i < squareMatrix.length; i++) {
            double sumNonDiagonal=0;
            for (int j=0;j< squareMatrix[i].length;j++){
                if (i!=j){
                    sumNonDiagonal = calculator.sum(sumNonDiagonal,Math.abs(squareMatrix[i][j]));
                }
            }
            if (Math.abs(squareMatrix[i][i]) <= sumNonDiagonal){
                return false;
            }

        }
        return true;
    }
}
