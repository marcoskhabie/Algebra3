package practica6;

/**
 * @author Agustin Bettati
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
}
