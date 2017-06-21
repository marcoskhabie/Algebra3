/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class ParcialAgustinBettati {

    public static void main(String[] args) {
        double[][] matrix = {   {0.5, 1.5, 0.7},
                                {1,0,2},
                                {2,1.2,-0.3}
                            };
        double[] independentTerms = {-0.3,3,0.5};

        double[] result = gaussGeneratingLowerMatrix(matrix, independentTerms);
        for (int i = 0; i < result.length; i++) {
            System.out.println("x" + (i+1) + ": " + result[i]);
        }
    }

    public static boolean tridiagonalMatrixIsSymmetric(double[][] matrix){

        for (int i = 0; i <= matrix.length - 2; i++) {
            if(matrix[i][i+1] != matrix[i+1][i]){
                return false;
            }
        }
        return true;
    }

    public static double[] gaussGeneratingLowerMatrix(double[][] matrix, double[] independentTerms){

        //modifies matrix to a lower matrix with 1s in the diagonal
        for (int i = matrix.length -1; i >=0 ; i--) {

            double valueToDivide = matrix[i][i];
            independentTerms[i] = independentTerms[i] / valueToDivide;
            for (int j = 0; j <= i; j++) {
                matrix[i][j]=matrix[i][j]/valueToDivide;
            }

            for (int k = 0; k < i; k++) {

                double valueToMultiply = matrix[k][i];
                independentTerms[k] = independentTerms[k] - (independentTerms[i] * valueToMultiply);

                for (int j = 0; j <= i; j++) {
                    matrix[k][j] = matrix[k][j] - (matrix[i][j] * valueToMultiply);
                }
            }
        }

        //finds solution of the system knowing it is a lower matrix with 1s in the diagonal
        double[] result = new double[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            result[i] = independentTerms[i];
            double summation = 0;
            for (int j = 0; j < i; j++) {
                summation += matrix[i][j] * result[j];
            }
            result[i] -= summation;
        }
        return result;
    }

}
