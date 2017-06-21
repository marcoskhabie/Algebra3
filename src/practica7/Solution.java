package practica7;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Solution implements TP4 {

    /**
     * solves a system of linear equations of upper matrix with 1s in the diagonal.
     * @param coefficients
     * @param independentTerms
     * @return
     */
    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[coefficients.length];

        for (int i = coefficients.length -1; i >= 0 ; i--) {
            result[i] = independentTerms[i];
            double summation = 0;
            for (int j = i+1; j < coefficients.length; j++) {
                summation += coefficients[i][j] * result[j];
            }
            result[i] -= summation;
        }
        return result;

    }

    /**
     * Solves a system of linear equation of a lower matrix
     * @param coefficients
     * @param independentTerms
     * @return
     */
    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[coefficients.length];

        for (int i = 0; i < coefficients.length; i++) {
            result[i] = independentTerms[i];
            double summation = 0;
            for (int j = 0; j < i; j++) {
                summation += coefficients[i][j] * result[j];
            }
            result[i] -= summation;

            result[i] /= coefficients[i][i];
        }
        return result;
    }

    /**
     * Gauss algorithm without changing position of rows.
     * @param coefficients
     * @param independentTerms
     * @return
     */
    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        for (int i = 0; i <coefficients.length ; i++) {
            double valueToDivide = coefficients[i][i];
            independentTerms[i] = independentTerms[i] / valueToDivide;
            for (int j = i; j < coefficients.length; j++) {
                coefficients[i][j]=coefficients[i][j]/valueToDivide;
            }

            for (int k = i+1; k < coefficients.length; k++) {

                double valueToMultiply = coefficients[k][i];
                independentTerms[k] = independentTerms[k] - (independentTerms[i] * valueToMultiply);

                for (int j = i; j < coefficients.length; j++) {
                    coefficients[k][j] = coefficients[k][j] - (coefficients[i][j] * valueToMultiply);
                }
            }
        }
        return exercise1(coefficients,independentTerms);
    }

    /**
     * Gauss algorithm changing position of rows to obtain a more precise result.
     * @param coefficients
     * @param independentTerms
     * @return
     */
    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {

        for (int i = 0; i <coefficients.length ; i++) {

            double maxValue = Math.abs(coefficients[i][i]);
            int indexOfBestPosition = i;
            for (int k = i+ 1; k < coefficients.length; k++) {
                if(Math.abs(coefficients[k][i]) > maxValue){
                    maxValue = Math.abs(coefficients[k][i]);
                    indexOfBestPosition = k;
                }
            }

            //Cambiar de lugar filas
            for (int k = 0; k < coefficients.length; k++) {
                double aux = coefficients[indexOfBestPosition][k];
                coefficients[indexOfBestPosition][k] = coefficients[i][k];
                coefficients[i][k] = aux;
            }
            double aux = independentTerms[indexOfBestPosition];
            independentTerms[indexOfBestPosition] = independentTerms[i];
            independentTerms[i] = aux;

            double valueToDivide = coefficients[i][i];
            independentTerms[i] = independentTerms[i] / valueToDivide;
            for (int j = i; j < coefficients.length; j++) {
                coefficients[i][j]=coefficients[i][j]/valueToDivide;
            }

            for (int k = i+1; k < coefficients.length; k++) {

                double valueToMultiply = coefficients[k][i];
                independentTerms[k] = independentTerms[k] - (independentTerms[i] * valueToMultiply);
                for (int j = i; j < coefficients.length; j++) {
                    coefficients[k][j] = coefficients[k][j] - (coefficients[i][j] * valueToMultiply);
                }
            }
        }
        return exercise1(coefficients,independentTerms);
    }

    /**
     * Gauss algorithm optimized for a Hessenberg matrix.
     * @param coefficients
     * @param independentTerms
     * @param calculator
     * @return
     */
    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        for (int i = 0; i <coefficients.length ; i++) {

            double valueToDivide = coefficients[i][i];
            independentTerms[i] = calculator.division(independentTerms[i], valueToDivide);
            for (int j = i; j < coefficients.length; j++) {
                coefficients[i][j] = calculator.division(coefficients[i][j],valueToDivide);
            }

            int k = i+1;
            if(k < coefficients.length) {
                double valueToMultiply = coefficients[k][i];
                independentTerms[k] =calculator.subtraction(independentTerms[k], calculator.multiplication(independentTerms[i], valueToMultiply));
                for (int j = i; j < coefficients.length; j++) {
                    coefficients[k][j] =calculator.subtraction(coefficients[k][j], calculator.multiplication(coefficients[i][j], valueToMultiply));
                }
            }

        }
        return exercise1(coefficients,independentTerms);
    }

    /**
     * Gauss algorithm optimized for a tri-diagonal and symmetric matrix.
     * @param coefficients
     * @param independentTerms
     * @param calculator
     * @return
     */
    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        for (int i = 0; i <coefficients.length ; i++) {

            double valueToDivide = coefficients[i][i];
            independentTerms[i] = calculator.division(independentTerms[i],valueToDivide);
            for (int j = i; j < coefficients.length && j <= i+1; j++) {
                coefficients[i][j]=calculator.division( coefficients[i][j], valueToDivide );
            }

            int k = i+1;
            if(k < coefficients.length) {

                double valueToMultiply = coefficients[k][i];
                independentTerms[k] = calculator.subtraction( independentTerms[k],calculator.multiplication( independentTerms[i],valueToMultiply));
                for (int j = i; j < coefficients.length && j <= i+1; j++) {
                    coefficients[k][j] = calculator.subtraction(coefficients[k][j],calculator.multiplication(coefficients[i][j], valueToMultiply));
                }
            }
        }
        return exercise1(coefficients,independentTerms);
    }

    /**
     * Gauss-Jordan algorithm to find the inverse of a matrix
     * @param coefficients
     * @return
     */
    @Override
    public double[][] exercise8(double[][] coefficients) {
        double[][] expandedMatrix = new double[coefficients.length][coefficients.length * 2];

        for (int i = 0; i < coefficients.length; i++) {
            for (int j = 0; j < coefficients.length; j++) {
                expandedMatrix[i][j] = coefficients[i][j];
            }
        }
        //adds identify matrix
        for (int i = 0; i < coefficients.length; i++) {
            for (int j = coefficients.length; j < coefficients.length * 2; j++) {
                if(j == i + coefficients.length){
                    expandedMatrix[i][j] = 1;
                }
                else {
                    expandedMatrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i <expandedMatrix.length ; i++) {
            double valueToDivide = expandedMatrix[i][i];
            for (int j = i; j < expandedMatrix.length*2; j++) {
                expandedMatrix[i][j]=expandedMatrix[i][j]/valueToDivide;
            }

            for (int k = 0; k < expandedMatrix.length; k++) {

                if(k != i) {
                    double valueToMultiply = expandedMatrix[k][i];
                    for (int j = i; j < expandedMatrix.length*2; j++) {
                        expandedMatrix[k][j] = expandedMatrix[k][j] - (expandedMatrix[i][j] * valueToMultiply);
                    }
                }
            }
        }

        //return right part of expanded matrix
        double[][] result = new double[expandedMatrix.length][expandedMatrix.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = expandedMatrix[i][j + coefficients.length];
            }
        }
        return result;


    }

    /**
     * Solves a system of linear equations implementing LU factorization.
     * @param coefficients
     * @param independentTerms
     * @return
     */
    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        double[][] lower = new double[coefficients.length][coefficients.length];
        double[][] upper = new double[coefficients.length][coefficients.length];

        //fill diagonal of 1s in lower matrix
        for (int i = 0; i < lower.length; i++) {
            lower[i][i] = 1;
        }

        //Algoritmo Doolitle
        for (int k = 0; k < coefficients.length; k++) {
            for (int j = k; j < coefficients.length; j++) {
                upper[k][j] = coefficients[k][j];
                double summation = 0;
                for (int p = 0; p < k; p++) {
                    summation += lower[k][p]*upper[p][j];
                }
                upper[k][j] -= summation;
            }

            for (int i = 0; i < coefficients.length; i++) {
                lower[i][k] = coefficients[i][k];

                double summation = 0;
                for (int p = 0; p < k; p++) {
                    summation += lower[i][p]*upper[p][k];
                }
                lower[i][k] -= summation;
                lower[i][k] /= upper[k][k];
            }
        }

        // tengo LU x = b
        //si U x = z, primero busco L z = b
        double[] z = exercise2(lower,independentTerms);

        //ahora que tengo z, despejo x apartir de U x = z

        return upperMatrixSolver(upper, z);
    }

    private double[] upperMatrixSolver(double[][] coefficients, double[] independentTerms) {
        double[] result = new double[coefficients.length];

        for (int i = coefficients.length -1; i >= 0 ; i--) {
            result[i] = independentTerms[i];
            double summation = 0;
            for (int j = i+1; j < coefficients.length; j++) {
                summation += coefficients[i][j] * result[j];
            }
            result[i] -= summation;
            result[i] /= coefficients[i][i];
        }
        return result;
    }

}
