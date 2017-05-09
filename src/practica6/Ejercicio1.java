package practica6;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{2,3},{5,4},{8,2}};

        printMatrix(productoOfMatrix(matrix1, matrix2));
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

    public static int sumOfDiagonal(int[][] squareMatrix){
        int sum = 0;
        for (int i = 0; i < squareMatrix.length; i++) {
            sum += squareMatrix[i][i];
        }
        return sum;
    }

    public static int sumOfSecondaryDiagonal(int[][] squareMatrix){
        int sum = 0;
        for (int i = 0; i < squareMatrix.length; i++) {

            sum += squareMatrix[i][(squareMatrix.length-1)  - i];
        }
        return sum;
    }

    public static int[] sumOfEachRow(int[][] matrix){
        int array[] = new int[matrix.length];

        for (int i = 0; i < array.length; i++) {
            int[] row = matrix[i];
            int sum = 0;
            for (int j = 0; j < row.length; j++) {
                sum += matrix[i][j];
            }
            array[i] = sum;
        }

        return array;
    }

    public static int[] productOfMatrixAndVector(int[][] matrix, int[] vector){
        int[] result = new int[matrix.length];

        for (int i = 0; i < result.length; i++) {
            int value = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                value += vector[j]* matrix[i][j];
            }
            result[i] = value;
        }
        return result;
    }

    public static int[][] sumOfTwoMatrixs(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] productoOfMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1[0].length != matrix2.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                int value = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    value += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = value;
            }
        }
        return result;
    }



}
