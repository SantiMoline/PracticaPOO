package Ej9.Entities;

public class Matematica {
    private double num1;
    private double num2;

    //Empty constructor
    public Matematica() {

    }

    //Constructor.
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Getters & Setters.
    public double getNum1() {
        return this.num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
