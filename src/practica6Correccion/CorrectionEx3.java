package practica6Correccion;

import practica6.Calc;
import practica6.Calculator;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class CorrectionEx3 implements Exercise3{

    public static void main(String[] args) {
        CorrectionEx3 test = new CorrectionEx3();
        double[][] matA = {     {5,6,0,0},
                                {4,5,2,0},
                                {3,1,1,5},
                                {0,2,4,6}};

        double[][] matB = {     {1,6,7,0},
                                {0,4,6,9},
                                {0,0,5,8},
                                {0,0,0,6}};
        double[][] result = test.exerciseDIII(matA,2,1,matB,0,2, new Calc());

    }


    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {

        double[] result = new double[matrixA.length];

        for (int i = 0; i < matrixA.length; i++) {
            double value = 0;
            int k =0;
            if(i > 1){
                k = i-1;
            }
            for (;k <= matrixA[0].length-1; k++) {
                value = calculator.sum(value,
                        calculator.multiplication(matrixA[i][k], vectorX[k]));
            }
            result[i] = value;
        }
        return result;
    }

    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < result.length; i++) {
            int j = 0;
            if(i > 1){
                j = i-1;
            }
            for (; j < result[0].length; j++) {
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length != matrixB.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        double[][] result = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                double value = 0;

                int k =0;
                if(i > 1){
                    k = i-1;
                }
                int end = matrixA[0].length - 1;
                if(j < matrixA.length - 2){
                    end = j+1;
                }
                for (;k <= end; k++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
    }

    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        double[] result = new double[matrixA.length];

        for (int i = 0; i < matrixA.length; i++) {
            double value = 0;

            int k =0;
            int end = matrixA.length -1;
            if(i > 1){
                k = i-1;
            }

            if(i < matrixA.length -2){
                end = i +1;
            }

            for (;k <= end; k++) {
                value = calculator.sum(value,
                        calculator.multiplication(matrixA[i][k], vectorX[k]));
            }
            result[i] = value;
        }
        return result;
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < result.length; i++) {
            int init = 0;
            int end = result[i].length -1;

            if(i > 1){
                init = i -1;
            }

            if(i < matrixA.length -2){
                end = i + 1;
            }

            for (int j = init; j <= end; j++) {
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);

            }
        }
        return result;
    }

    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length != matrixB.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        double[][] result = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                double value = 0;

                int start =0;
                if(i > 1 || j > 1){
                    start = Math.max(i,j) -1;
                }

                int end = matrixA[0].length - 1;
                if(i < matrixA.length -2 || j < matrixA.length -2){
                    end = Math.min(i,j) +1;
                }

                for (int k = start;k <= end; k++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
    }

    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        double[] result = new double[matrixA.length];

        for (int i = 0; i < matrixA.length; i++) {
            double value = 0;

            int k =0;
            int end = matrixA.length -1;
            if(i > k1A){
                k = i-k1A;
            }

            if(i < matrixA.length -1 - k2A){
                end = i + k2A;
            }

            for (;k <= end; k++) {
                value = calculator.sum(value,
                        calculator.multiplication(matrixA[i][k], vectorX[k]));
            }
            result[i] = value;
        }
        return result;
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < result.length; i++) {
            int init = 0;
            int end = result[i].length -1;

            if(i > k1A && i > k1B){
                int max = Math.max(k1A, k1B);
                init = i-max;
            }
            if(i < matrixA.length -1 - k2A && i < matrixB.length -1 - k2B){
                int max = Math.max(k2A, k2B);
                end = i + max;
            }

            for (int j = init; j <= end; j++) {
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);

            }
        }
        return result;
    }

    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        if(matrixA[0].length != matrixB.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        double[][] result = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                double value = 0;

                int start =0;
                if(i > k1A || j > k2B){
                    int startIndexOfA = i - k1A;
                    int startIndexOfB = j - k2B;
                    if (startIndexOfA < 0){
                        start = startIndexOfB;
                    }
                    else if(startIndexOfB < 0){
                        start = startIndexOfA;
                    }
                    else {
                        start = Math.max(startIndexOfA, startIndexOfB);
                    }
                }

                int end = matrixA[0].length - 1;

                if(i < matrixA[0].length -1 - k2A || j < matrixB.length -1 - k1B){
                    int endOfA = i + k2A;
                    int endOfB = j + k1B;
                    end = Math.min(endOfA, endOfB);
                }

                for (int k = start;k <= end; k++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
    }


    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }
}
