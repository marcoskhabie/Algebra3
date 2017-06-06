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
                                    {2,0,0},
                                    {1,2,1}};

        tester.exercise9(coefficientes, null);
        double[][] inversa = tester.exercise8(coefficientes);
        int a =9;
    }
}
