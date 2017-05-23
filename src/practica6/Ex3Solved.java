package practica6;

import practica6.Calculator;
import practica6.Exercise3;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Ex3Solved  implements Exercise3{

    public static void main(String[] args) {
        double[][] matrixA = {  {1,3,4},
                                {0,5,6},
                                {0,0,8}};

        double[][] matrixB = {  {10,9,11},
                                {0,8,9},
                                {0,0,10}};

        Ex3Solved solver = new Ex3Solved();
        Calc.printMatrix(solver.exerciseAIII(matrixA,matrixB,new Calc()));
    }

    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        int i= 0;
        double[] result= new double[matrixA.length];
      while (i<matrixA.length){
          for (int j = i; j <matrixA.length ; j++) {
              result[i]= calculator.sum(result[i],calculator.multiplication(matrixA[j][i],vectorX[j]));
          }
          i++;
      }
        return result;
    }

    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        int i= 0;
        double[][] result= new double[matrixA.length][matrixA.length];
        while (i<matrixA.length){
            for (int j = i; j <matrixA.length ; j++) {
                result[i][j]= calculator.sum(matrixA[i][j],matrixB[i][j]);
            }
            i++;
        }
        return result;
    }

    @Override
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length != matrixB.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        double[][] result = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                double value = 0;

                for (int k = i;k <= j; k++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
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
        return new double[0];
    }

    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                double value;
                if(i> 1 && j <2 && !(j == 1 && i ==2))
                    value = 0;
                else{
                    value = calculator.sum(matrixA[i][j],matrixB[i][j]);
                }
                result[i][j] = value;
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
                if(j < 2){
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
            else{
                end = i + 1;
            }
            for (;k <= end; k++) {
                value = calculator.sum(value,
                        calculator.multiplication(matrixA[i][k], vectorX[k]));
            }
            result[i] = value;
        }
        return new double[0];
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                double value = -1;
                if(i> 1){
                    if(j < 2 && !(j == 1 && i == matrixA.length -2))
                        value = 0;
                }
                else
                    if(j > matrixA[0].length - 3 && !((j == matrixA[0].length - 2) && i ==1))
                        value = 0;

                if(value == -1) {
                    value = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
                result[i][j] = value;
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
                    int max = Math.max(i, j);
                    start = max -1;
                }
                int end = matrixA[0].length - 1;
                if(i <= 1 || j <= 1){
                    int min = Math.min(i, j);
                    end = min + 1;
                }
                for (;start <= end; start++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][start], matrixB[start][j]));
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
            if(i > k2A){
                k = i-k2A;
            }
            if(1 + k1A + i < matrixA[0].length -1){
                end = 1 + k1A + i;
            }
            for (;k <= end; k++) {
                value = calculator.sum(value,
                        calculator.multiplication(matrixA[i][k], vectorX[k]));
            }
            result[i] = value;
        }
        return new double[0];
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {

                double value = -1;
                if(i > k2A && i > k2B){
                    if(j < matrixA[0].length -1 -k2A && j < matrixA[0].length -1 -k2B){
                        value = 0;
                    }
                }
                if(j > k1A && j > k1B) {
                    if(i < matrixA.length -1 -k1A && i < matrixA.length -1 -k1B){
                        value = 0;
                    }
                }
                if(value == -1){
                    value = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }

                result[i][j] = value;
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
                if(i > k2A || j > k1B){
                    int max = Math.max(i, j);
                    start = max -1;
                }
                int end = matrixA[0].length - 1;
                if(i <= k2A || j <= k1B){
                    int min = Math.min(i, j);
                    end = min + 1;
                }
                for (;start <= end; start++) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][start], matrixB[start][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length != matrixB.length){
            throw new RuntimeException("Dimension error in product of matrix");
        }

        double[][] result = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                double value = 0;
                int k;
                if(i < j){
                    k = i;
                }
                else {
                    k = j;
                }
                for (;k >= 0; k--) {
                    value = calculator.sum(value,
                            calculator.multiplication(matrixA[i][k], matrixB[k][j]));
                }
                result[i][j] = value;
            }
        }
        return result;
    }

}
