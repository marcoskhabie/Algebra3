package practica6;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Calc implements Calculator {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
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
    public static void printVector(double[] vector){
        String result="";
        for (int i = 0; i <vector.length ; i++) {

        result+= vector[i]+"   ";

        }
        System.out.println(result);
    }
}
