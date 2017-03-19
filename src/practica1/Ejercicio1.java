package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println(iterativeSummationF(4));
        System.out.println(recursiveSummationF(4));

    }

    /**
     * represents the summation of i from 0 to n
     * @param n number where the summation will end
     * @return
     */
    public static int iterativeSummationA(int n){
        int result = 0;
        for(int i = 1; i < n+1; i++){
            result += i;
        }
        return result;
    }

    public static int recursiveSummationA(int n){
        return recursiveSummationA(n, 0, 1);
    }

    private static int recursiveSummationA(int n,int partialResult, int index){
        if(index > n){
            return partialResult;
        }
        return recursiveSummationA(n,partialResult + index, index + 1);
    }

    /**
     * represents the summation of i^2 from 1 to n
     * @param n number where the summation will end
     * @return
     */
    public static double iterativeSummationB(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += i*i;
        }

        return result;
    }

    public static int recursiveSummationB(int n){
        return recursiveSummationB(n, 0, 1);
    }

    private static int recursiveSummationB(int n,int partialResult, int index){
        if(index > n){
            return partialResult;
        }
        return recursiveSummationB(n,partialResult + (index*index), index + 1);
    }


    /**
     * represents the summation of p^i from 0 to n
     * @param p a constant number
     * @param n number where the summation will end
     * @return
     */
    public static double iterativeSummationC(int p, int n){
        double result = 0;
        for (int i = 0; i < n+1; i++){
            int addition = 1;
            for(int j =0; j < i;j++){
                addition = addition*p;
            }
            result += addition;
        }
        return result;
    }

    public static int recursiveSummationC(int p,int n){
        return recursiveSummationC(p,n, 0, 0);
    }

    private static int recursiveSummationC(int p,int n,int partialResult, int index){
        if(index > n){
            return partialResult;
        }
        int addition = 1;
        for(int j =0; j < index;j++){
            addition = addition*p;
        }
        int newResult = partialResult + addition;
        return recursiveSummationC(p,n, newResult, index + 1);
    }

    /**
     * represents the summation of (2 * i) - 1 from 1 to n
     * @param n number where the summation will end
     * @return
     */
    public static double iterativeSummationD(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += (2 * i) -1;
        }
        return result;
    }


    public static int recursiveSummationD(int n){
        return recursiveSummationD(n, 0, 1);
    }

    private static int recursiveSummationD(int n,int partialResult, int index){
        if(index >= n+1){
            return partialResult;
        }
        int addition = (2*index) -1;

        int newResult = partialResult + addition;
        return recursiveSummationD(n, newResult, index + 1);
    }

    /**
     * represents the summation of i * (i + 1) from 1 to n
     * @param n number where the summation will end
     * @return
     */
    public static double iterativeSummationE(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += (1+ i)* i;
        }
        return result;
    }

    public static int recursiveSummationE(int n){
        return recursiveSummationE(n, 0, 1);
    }

    private static int recursiveSummationE(int n,int partialResult, int index){
        if(index >= n+1){
            return partialResult;
        }
        int addition = (1+ index)* index;

        int newResult = partialResult + addition;
        return recursiveSummationE(n, newResult, index + 1);
    }

    /**
     * represents the summation of i^3 from 1 to n
     * @param n number where the summation will end
     * @return
     */
    public static double iterativeSummationF(int n){
        double result = 0;
        for (int i = 1; i < n+1; i++){
            result += (i*i*i);
        }
        return result;
    }

    public static int recursiveSummationF(int n){
        return recursiveSummationF(n, 0, 1);
    }

    private static int recursiveSummationF(int n,int partialResult, int index){
        if(index > n){
            return partialResult;
        }
        return recursiveSummationF(n,partialResult + (index*index*index), index + 1);
    }

}
