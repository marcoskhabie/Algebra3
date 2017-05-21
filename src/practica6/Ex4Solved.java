package practica6;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Ex4Solved implements Exercise4{

    public static void main(String[] args) {
        Ex4Solved test = new Ex4Solved();
        double[] triangularMatrixA = {2,5,6,7,8,7};
        double[] triangularMatrixB = {2,5,6,7,8,7};
        printMatrix(test.summation(triangularMatrixA, triangularMatrixB, new Calc()));
    }

    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        int dimension = getDimensionOfTriangularMatrix(matrixA);
        double[][] result = new double[dimension][dimension];
        int k = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i > j){
                    result[i][j] = 0;
                }
                else{
                    result[i][j] = calculator.sum(matrixA[k], matrixB[k]);
                    k++;
                }
            }
        }
        return result;
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            String row = "";
            for (int j = 0; j < matrix[0].length; j++) {
                row += matrix[i][j] + " ";
            }
            System.out.println(row);
        }
    }

    private int getDimensionOfTriangularMatrix(double[] matrix){
        int n = 0;
        int j = 0;
        for (int i = 0; i < matrix.length; i++) {
            if(n == j){
                j = 0;
                n++;
            }
            else{
                j++;
            }
        }
        return n;
    }
}
