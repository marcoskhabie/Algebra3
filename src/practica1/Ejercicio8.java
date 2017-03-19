package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */

public class Ejercicio8 {
    /**
     * Compares the amount of operations for evaluating polynomials between the normal way and using the Horner rule.
     */

    public static void main(String[] args) {
        Polynomial aPolynomial = new Polynomial(4);

        aPolynomial.setCoef(0, 2);
        aPolynomial.setCoef(1, 10);
        aPolynomial.setCoef(2, 4);
        aPolynomial.setCoef(3, 4);
        aPolynomial.setCoef(4, 12);

        System.out.println(amountOfOperationsForNormalWay(aPolynomial, 4));
        System.out.println(amountOfOperationsForHornerRule(aPolynomial, 4));
    }

    /**
     * Evaluates a polynomial in a normal way.
     * @param polynomial
     * @param valorDeX
     * @return
     */
    public static double evaluatesPolynomialInANormalWay(Polynomial polynomial, double valorDeX){
        double result = 0;
        for(int i = 0; i < polynomial.getGrade() + 1; i++){
            result += Math.pow(valorDeX, i) * polynomial.getValue(i);
        }
        return result;
    }

    /**
     *  Implements the Horner Rule.
     * @param polynomial
     * @param valorDeX
     * @return
     */
    public static double iterativeHornerRule(Polynomial polynomial, double valorDeX){
        double result = 0.0;
        for(int i = polynomial.getGrade(); i >= 0; i--) {
            result = result * valorDeX + polynomial.getValue(i);
        }
        return result;
    }

    public static double recursiveHornerRule(Polynomial polynomial, double valorDeX){
        return recursiveHornerRule(polynomial, valorDeX,0, polynomial.getGrade());
    }
    private static double recursiveHornerRule(Polynomial polynomial, double valorDeX, double partialResult, int index){
        if(index < 0){
            return partialResult;
        }
        partialResult = partialResult * valorDeX + polynomial.getValue(index);
        return recursiveHornerRule(polynomial, valorDeX, partialResult, index - 1);
    }

    /**
     *  Count the amount of operations using the normal way of evaluating a polynomial.
     * @param polynomial
     * @param valorDeX
     * @return
     */
    public static double amountOfOperationsForNormalWay(Polynomial polynomial, double valorDeX){
        double result = 0;
        int amountOfOperations = 0;
        for(int i = 0; i < polynomial.getGrade() + 1; i++){
            result += Math.pow(valorDeX, i) * polynomial.getValue(i);
            amountOfOperations += 2 + (i-1);
        }
        return amountOfOperations;
    }

    /**
     * Count the amount of operations using the Horner rule for evaluating a polynomial.
     * @param polynomial
     * @param valorDeX
     * @return
     */
    public static double amountOfOperationsForHornerRule(Polynomial polynomial, double valorDeX){
        double result = 0.0;
        int amountOfOperations = 0;
        for(int i = polynomial.getGrade(); i >= 0; i--) {
            result = result * valorDeX + polynomial.getValue(i);
            amountOfOperations += 2;
        }
        return amountOfOperations;
    }

}
