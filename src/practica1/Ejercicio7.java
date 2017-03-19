package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */

public class Ejercicio7 {
    /**
     * It calculates the MCD of the pair of numbers: "123 and 277", "111 and 201" , and "14039 and 1529".
     */
    public static void main(String[] args) {
        System.out.println("MCD de 123 y 277 es: " + recursiveMCD(123, 277));
        System.out.println("MCD de 111 y 201 es: " + recursiveMCD(111, 201));
        System.out.println("MCD de 14039 y 1529 es: " + recursiveMCD(14039, 1529));
    }

    /**
     * El algoritmo de Euclides empieza dividiendo un número entre otro (obteniendo el
     * resto también,no sólo el cociente), y a partir de ahí, seguimos dividiendo el número
     * más pequeño entre el resto que nos ha salido y continuamos dividiendo por el
     * resto anterior una vez y otra hasta que en ese proceso repetitivo obtengamos
     * un resto que sea 0. El mcd es es resto anterior (que no es cero).
     */
    /**
     * It implements the Euclides Algorithm.
     * @param a
     * @param b
     * @return
     */
    static int recursiveMCD(int a, int b) {
        if(b==0)
            return a;
        else
            return recursiveMCD(b, a % b);
    }

    static int iterativeMCD(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
