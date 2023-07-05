package EjerciciosPOO.Ej4.Entities;

public class Rectangulo {
    private double base, altura;

    //Empty constructor
    public Rectangulo() {

    }

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getters
    public double getAltura() {
        return this.altura;
    }

    public double getBase() {
        return this.base;
    }

    //Setters.
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
