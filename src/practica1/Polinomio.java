package practica1;

import java.util.Arrays;

public class Polinomio{

    private double[] valores;
    private int grado;

    public Polinomio(int grado){
        this.grado = grado;
        valores = new double[grado + 1];
    }

    public int getGrado() {
        return grado;
    }

    public void setCoef(int coeficiente, double valor){
        valores[coeficiente] = valor;
    }

    public Polinomio derivar(){
        Polinomio derivado = new Polinomio(grado - 1);
        for(int i = 0; i < grado; i++){
            derivado.setCoef(i, valores[i + 1] * (i + 1));
        }
        return derivado;
    }

    public double getValue(int grado){
        return valores[grado];
    }

    /**
     * Ejercicio guia 2
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof Polinomio)) // El objeto no es del el mismo o child class
            return false;

        Polinomio aPolinomio = (Polinomio) o;

        return Arrays.equals(this.valores, aPolinomio.valores);
    }

}