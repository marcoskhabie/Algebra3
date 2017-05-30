package practica7;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Solution implements TP4 {

    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

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
                    independentTerms[k ] = independentTerms[k ] - (independentTerms[i] * valueToMultiply);
                    for (int j = i; j < coefficients.length; j++) {



                        coefficients[k][j] = coefficients[k][j] - (coefficients[i][j] * valueToMultiply);
                    }
                }
            }


        return exercise1(coefficients,independentTerms);
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
