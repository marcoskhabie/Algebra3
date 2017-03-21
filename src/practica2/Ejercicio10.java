package practica2;

/**
 * Created by marcos on 21/3/17.
 */
public class Ejercicio10 {

    public static double summationProducts(int n){
        int index=n;
        double result=0;
        while(n>0){
            result=result+n*Math.pow(2,n);
            index--;
        }
        return result;
    }
}
