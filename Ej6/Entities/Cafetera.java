package Ej6.Entities;

public class Cafetera {
    private double cantidadActual;
    private double capacidadMaxima;

    //Empty constructor
    public Cafetera() {

    }

    //Constructor
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //Getters
    public double getCantidadActual() {
        return cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    //Setters
    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
