package Ej5.Entities;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldo;


    //Empty constructor
    public Cuenta() {

    }

    //Constructor
    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    //Getters.
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni (long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return 
            "Numero de cuenta: " + getNumeroCuenta() +
            "\nDNI: " + getDni() +
            "\nSaldo: $" + getSaldo();
    }
}
/*ealizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero),
el DNI del cliente (entero largo) y el saldo actual (entero). */