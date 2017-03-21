package practica2;

/**
 * Created by marcos on 21/3/17.
 */
public class Ejercicio9 {
    public static double summation2(int m, int n, int r, int s) {
        double result = 0;
        for (int j = m; j <= n; j++) {
            for (int k = r; j <= s; k++) {
                result = result + (j * k);
            }
        }
        return result;
    }
}
