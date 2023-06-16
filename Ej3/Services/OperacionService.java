package Ej3.Services;

import java.util.Scanner;
import Ej3.Entities.Operacion;

public class OperacionService {
    Scanner scan = new Scanner(System.in);

    public Operacion crearOperacion() {
        double n1, n2;
        
        System.out.println("Ingrese el primer número a utilizar en la operación: ");
        n1 = scan.nextDouble();
        System.out.println("Ingrese el segundo número a utilizar en la operación: ");
        n2 = scan.nextDouble();

        return new Operacion(n1, n2);
    }

    public double sumar(Operacion op) {
        return (op.getNum1() + op.getNum2());
    }

    public double restar(Operacion op) {
        return (op.getNum1() - op.getNum2());
    }

    public double multiplicar(Operacion op) {
        return (op.getNum1() * op.getNum2());
    }

    public double dividir(Operacion op) {
        if (op.getNum2() == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return (op.getNum1() / op.getNum2());
        }
    }
}
