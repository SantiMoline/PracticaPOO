package ExtrasPOO.Extra03.Entities;

public class Raices {
    private double a;
    private double b;
    private double c;

    //Empty Constructor.
    public Raices() {
    
    }
    
    //Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Getters & Setters.
    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "La ecuación de segundo grado introducida quedaría de la siguiente forma: " + 
        "\n" + a + "x^2 + " + b + "x + " + c;
    }

}
