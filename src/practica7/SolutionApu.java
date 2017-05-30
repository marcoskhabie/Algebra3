package practica7;

/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class SolutionApu implements TP4{
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

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        return new double[0][];
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }
}
