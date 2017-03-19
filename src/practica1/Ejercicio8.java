package practica1;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 *
 * Practica numero 1.
 */

public class Ejercicio8 {

    public static void main(String[] args) {
        Polinomio unPolinomio = new Polinomio(4);

        unPolinomio.setCoef(0, 2);
        unPolinomio.setCoef(1, 10);
        unPolinomio.setCoef(2, 4);
        unPolinomio.setCoef(3, 4);
        unPolinomio.setCoef(4, 12);

        System.out.println(cantidadDeOperacionesFormaNormal(unPolinomio, 4));
        System.out.println(cantidadDeOperacionesReglaHorner(unPolinomio, 4));
    }


    public static double evaluarPolinomioDeManeraNormal(Polinomio polinomio, double valorDeX){
        double result = 0;
        for(int i = 0; i < polinomio.getGrado() + 1; i++){
            result += Math.pow(valorDeX, i) * polinomio.getValue(i);
        }
        return result;
    }

    public static double iterativeReglaHorner(Polinomio polinomio, double valorDeX){
        double result = 0.0;
        for(int i = polinomio.getGrado(); i >= 0; i--) {
            result = result * valorDeX + polinomio.getValue(i);
        }
        return result;
    }

    public static double recursiveReglaHorner(Polinomio polinomio, double valorDeX){
        return recursiveReglaHorner(polinomio, valorDeX,0, polinomio.getGrado());
    }
    private static double recursiveReglaHorner(Polinomio polinomio, double valorDeX, double partialResult, int index){
        if(index < 0){
            return partialResult;
        }
        partialResult = partialResult * valorDeX + polinomio.getValue(index);
        return recursiveReglaHorner(polinomio, valorDeX, partialResult, index - 1);
    }

    public static double cantidadDeOperacionesFormaNormal(Polinomio polinomio, double valorDeX){
        double result = 0;
        int cantidadDeOperaciones = 0;
        for(int i = 0; i < polinomio.getGrado() + 1; i++){
            result += Math.pow(valorDeX, i) * polinomio.getValue(i);
            cantidadDeOperaciones += 2 + (i-1);
        }
        return cantidadDeOperaciones;
    }

    public static double cantidadDeOperacionesReglaHorner(Polinomio polinomio, double valorDeX){
        double dbResult = 0.0;
        int cantidadDeOperaciones = 0;
        for(int i = polinomio.getGrado(); i >= 0; i--) {
            dbResult = dbResult * valorDeX + polinomio.getValue(i);
            cantidadDeOperaciones += 2;
        }
        return cantidadDeOperaciones;
    }

}
