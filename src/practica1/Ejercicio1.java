package practica1;

/**
 * Created by agustin on 13/3/17.
 */
public class Ejercicio1 {

    public static int summationA(int n){
        int result = 0;
        for(int i = 1; i < n+1; i++){
            result += i;
        }
        return result;
    }

    public static double summationB(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += Math.pow(i, 2);
        }

        return result;
    }

    public static double summationC(int p, int n){
        double result = 0;
        for (int i = 0; i < n+1; i++){
            result += Math.pow(p, i);
        }
        return result;
    }

    public static double summationD(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += (2 * i) -1;
        }
        return result;
    }

    public static double summationE(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += (1+ i)* i;
        }
        return result;
    }

    public static double summationF(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += Math.pow(i,3);
        }
        return result;
    }

}
