package practica7;

/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Solution tester = new Solution();
        double[][] coefficientes = {{1,4,5},
                                    {0,1,7},
                                    {0,0,1}};
        double[] independentTerms = {3,4,5};
        double[] result = tester.exercise1(coefficientes, independentTerms);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
