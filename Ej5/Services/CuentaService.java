package Ej5.Services;

import java.util.Scanner;

import Ej5.Entities.Cuenta;

public class CuentaService {
    
    Scanner scan = new Scanner(System.in);
    public Cuenta crearCuenta() {
        

        System.out.println("Ingrese el DNI del titular de la nueva cuenta: ");
        long dni = scan.nextLong();
        System.out.println("Ingrese el saldo inicial de la nueva cuenta: ");
        double saldo = scan.nextDouble();
        int numeroCuenta = (int) (Math.random() * 1000 + 1);
        System.out.println("El número de cuenta generado para la nueva cuenta es: " + numeroCuenta);


        return new Cuenta(numeroCuenta, dni, saldo);
    }

    public void ingresar(Cuenta cuenta, double ingreso) {
        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
    }


    public double retirar(Cuenta cuenta, double retiro) {
        if (suficienteSaldo(cuenta, retiro)) {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        } else {
            retiro = cuenta.getSaldo();
            cuenta.setSaldo(0);
        }
        return retiro;
    }

    /**
     * Function name = suficienteSaldo
     * @param cuenta    (Cuenta)
     * @param monto     (double)
     * @return          (boolean)
     * Validates if there is enough money in the account to satisfy a possible extraction.
     */
    public boolean suficienteSaldo(Cuenta cuenta, double monto) {
        return monto <= cuenta.getSaldo();
    }

    public double extraccionRapida(Cuenta cuenta) {
        double maxRetiroRapido = cuenta.getSaldo() * 0.2;
        cuenta.setSaldo(cuenta.getSaldo()*0.8);
        
        return maxRetiroRapido;
    }

    public double consultarSaldo(Cuenta cuenta) {
        return cuenta.getSaldo();
    }

    public String consultarDatos(Cuenta cuenta) {
        return cuenta.toString();
    }

}

/*Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */