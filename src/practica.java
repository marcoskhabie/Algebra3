import practica1.Ejercicio1;
import practica6.Calc;
import practica6.Ex1Solved;

/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class practica {

    public static void main(String[] args) {
        double[][] upper = {{1,2,8},
                            {0,5,0},
                            {0,0,7}};
        double[][] lower = {{1,0,0},
                            {2,5,0},
                            {6,3,7}};

        double[][] matrixA = {{1,2,4},{3,2,4},{2,3,3}};
        double[][] matrixB = {{4,3,2},{4,4,3},{2,1,3}};

        double[][] hessenberg = {   {1,3,4,2},
                                    {2,5,0,4},
                                    {0,3,7,2},
                                    {0,0,7,2}};
        double[] indep = {1,2,3,4};

        double[][] result = productOfMatrix(upper,lower);

        Ex1Solved ex1Solved = new Ex1Solved();
        double[][] resultado = ex1Solved.exerciseF(matrixA, matrixB, new Calc());

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }

        int a = 1;


    }

    public static double[][] productOfMatrix(double[][] matrixA, double[][] matrixB){
        double[][] result = new double[matrixA.length][matrixB[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                int initIndex = 0;
                int endIndex = matrixA.length - 1;

                int value = 0;
                for (int k = initIndex; k <= endIndex; k++) {
                    value += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = value;
            }
        }
        return result;
    }

    public static double[] gaussForHessenbergmatrix(double[][] matrix, double[] independentTerms){

        for (int i = 0; i <matrix.length ; i++) {
            double valueToDivide = matrix[i][i];
            independentTerms[i] = independentTerms[i] / valueToDivide;
            for (int j = i; j < matrix.length; j++) {
                matrix[i][j]=matrix[i][j]/valueToDivide;
            }

            int k = i+1;
            if(k < matrix.length) {
                double valueToMultiply = matrix[k][i];
                independentTerms[k] = independentTerms[k] - (independentTerms[i] * valueToMultiply);
                for (int j = i; j < matrix.length; j++) {
                    matrix[k][j] = matrix[k][j] - (matrix[i][j] * valueToMultiply);
                }
            }

        }
        double[] result = new double[matrix.length];

        for (int i = matrix.length -1; i >= 0 ; i--) {
            result[i] = independentTerms[i];
            double summation = 0;
            for (int j = i+1; j < matrix.length; j++) {
                summation += matrix[i][j] * result[j];
            }
            result[i] -= summation;
        }
        return result;
    }
}
