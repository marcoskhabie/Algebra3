package practica6;

/**
 * @author Marcos Khabie
 * @author Agustin Bettati
 * @version 1.0
 */
public class Ex2Solved implements Exercise2{

    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        boolean result=false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0;j< matrix[i].length;j++){
                if (matrix[i][j]==matrix[j][i]){
                    result=true;
                }
                else result=false;
            }
        }
        return result;

    }

    @Override
    public boolean exerciseB(double[][] squareMatrix, Calculator calculator) {
        boolean result=false;

        for (int i = 0; i < squareMatrix.length; i++) {
            double sumNonDiagonal=0;
            for (int j=0;j< squareMatrix[i].length;j++){
                if (i!=j){
                    sumNonDiagonal=  calculator.sum(sumNonDiagonal,squareMatrix[i][j]);
                }
            }
            if (squareMatrix[i][i]>sumNonDiagonal){
                result=true;
            }
            else result=false;

        }
        return result;

    }
}
