package practica6;

/**
 * @author Agustin Bettati
 * @version 1.0
 */
public class aux {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6,},{7,8,9}};
        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println(ejercicio1.sumOfDiagonal(matriz));
        System.out.println(ejercicio1.sumOfDiagonalFlor(matriz));
    }


}
