package practica6;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Ex1Solved implements Exercise1 {

    @Override
    public double exerciseA(double[][] matrix, Calculator calculator) {
        double result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result = calculator.sum(result,matrix[i][i]);
        }
        return result;
    }

    @Override
    public double exerciseB(double[][] matrix, Calculator calculator) {
        double result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result = calculator.sum(result,matrix[i][(matrix.length-1)  - i] );
        }
        return result;
    }

    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        double[] array = new double[matrix.length];

        for (int i = 0; i < array.length; i++) {
            double[] row = matrix[i];
            double result = 0;
            for (int j = 0; j < row.length; j++) {
                result = calculator.sum(result,matrix[i][j] );
            }
            array[i] = result;
        }
        return array;
    }

    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        double[] result = new double[matrix.length];

        for (int i = 0; i < result.length; i++) {
            double value = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                value = calculator.sum(value,vector[j]* matrix[i][j] );
            }
            result[i] = value;
        }
        return result;
    }

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length != matrixB.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        double[][] result = new double[matrixA.length][matrixB[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                double value = 0;
                for (int k = 0; k < matrixB.length; k++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        double[][] transversal = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transversal[j][i] = matrix[i][j];
            }
        }
        return transversal;
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            String row = "";
            for (int j = 0; j < matrix[0].length; j++) {
                row += matrix[i][j] + " ";
            }
            System.out.println(row);
        }
    }

}
