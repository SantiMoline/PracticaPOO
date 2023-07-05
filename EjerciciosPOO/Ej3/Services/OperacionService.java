package EjerciciosPOO.Ej3.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej3.Entities.Operacion;

public class OperacionService {
    Scanner scan = new Scanner(System.in);
    private Operacion op = new Operacion();

    public void crearOperacion() {        
        System.out.println("Ingrese el primer número a utilizar en la operación: ");
        op.setNum1(scan.nextDouble());
        System.out.println("Ingrese el segundo número a utilizar en la operación: ");
        op.setNum2(scan.nextDouble());
    }

    public double sumar() {
        return (op.getNum1() + op.getNum2());
    }

    public double restar() {
        return (op.getNum1() - op.getNum2());
    }

    public double multiplicar() {
        return (op.getNum1() * op.getNum2());
    }

    public double dividir() {
        if (op.getNum2() == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return (op.getNum1() / op.getNum2());
        }
    }
}
