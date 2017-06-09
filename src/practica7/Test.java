package practica7;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Solution tester = new Solution();
        double[][] coefficientes = {{1,2,0},
                                    {8,5,0},
                                    {9,2,7}};
        double[] independentTerms = {2,6,5};

        double[] result = tester.exercise9(coefficientes, independentTerms);
        int a =9;
    }
}
