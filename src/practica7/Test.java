package practica7;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Solution tester = new Solution();
        double[][] coefficientes = {{1,4,5},
                                    {7,1,7},
                                    {2,0,1}};
        double[] independentTerms = {1,8,3};
        double[] result = tester.exercise5WithoutPivoteo(coefficientes, independentTerms);


        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
