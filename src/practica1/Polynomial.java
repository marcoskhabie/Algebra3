package practica1;

import java.util.Arrays;

public class Polynomial {

    private double[] values;
    private int grade;

    public Polynomial(int grade){
        this.grade = grade;
        values = new double[grade + 1];
    }

    public int getGrade() {
        return grade;
    }

    public void setCoef(int coeficient, double value){
        values[coeficient] = value;
    }

    public Polynomial derivar(){
        Polynomial derivado = new Polynomial(grade - 1);
        for(int i = 0; i < grade; i++){
            derivado.setCoef(i, values[i + 1] * (i + 1));
        }
        return derivado;
    }

    public double getValue(int grado){
        return values[grado];
    }

    /**
     * Ejercicio guia 2
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof Polynomial)) // El objeto no es del el mismo o child class
            return false;

        Polynomial aPolynomial = (Polynomial) o;

        return Arrays.equals(this.values, aPolynomial.values);
    }

}