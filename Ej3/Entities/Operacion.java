package Ej3.Entities;

public class Operacion {

    private double num1, num2;
    
    //Empty Constructor
    public Operacion () {

    }

    //Constructor
    public Operacion (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}

