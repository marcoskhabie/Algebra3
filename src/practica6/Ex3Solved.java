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
        double[][] matrixA = {  {1,0,0},
                                {2,3,0},
                                {4,4,4}};

        double[][] matrixB = {  {1,5,6},
                                {0,3,1},
                                {0,0,5}};

        Ex3Solved solver = new Ex3Solved();
        Calc.printMatrix(solver.exerciseE(matrixA,matrixB,new Calc()));
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
        int i= 0;
        double[][] result= new double[matrixA.length][matrixA.length];
        while (i<matrixA.length){
            for (int j = i; j <matrixA.length ; j++) {
                for (int k = 0; k+j < matrixA.length&& matrixB[i][k]!=0 ; k++) {
                    while (matrixA[k][i]==0){
                        k++;
                    }
                    result[j][i]= calculator.sum(result[j][i],calculator.multiplication(matrixA[k][i],matrixB[j][k]));
                }
            }
            i++;
        }
        return result;
    }

    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
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
