package practica7;

/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class Solution implements TP4 {

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
        return new double[0];
    }

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        for (int i = 0; i <coefficients.length ; i++) {

            double valueToDivide= coefficients[i][i];
            if (i!=coefficients.length-1) {
                double valueToMultiply = coefficients[i+1][i];
                independentTerms[i] = independentTerms[i] / valueToDivide;
                independentTerms[i + 1] = independentTerms[i + 1] - independentTerms[i] * valueToMultiply;
                for (int j = 0; j < coefficients.length; j++) {


                    coefficients[i][j] = coefficients[i][j] / valueToDivide;
                    coefficients[i + 1][j] = coefficients[i + 1][j] - coefficients[i][j] * valueToMultiply;
                }
            }
            else {
                independentTerms[i]= independentTerms[i]/valueToDivide;
                coefficients[i][i]= coefficients[i][i]/valueToDivide;
            }

            
        }
        return new double[0];
    }

    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {

        for (int i = 0; i <coefficients.length ; i++) {
            double maxValue=coefficients[i][i];
            for (int j = 0; j <coefficients.length ; j++) {
                if (maxValue<coefficients[i][j]){
                    maxValue=coefficients[i][j];
                }

            }
            for (int k = 0; k <coefficients.length ; k++) {

            }


        }
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
