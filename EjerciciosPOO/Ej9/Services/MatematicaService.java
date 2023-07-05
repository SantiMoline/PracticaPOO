package EjerciciosPOO.Ej9.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej9.Entities.Matematica;

public class MatematicaService {
    Scanner scan = new Scanner(System.in);
    private Matematica matematica = new Matematica();

    public void crearMatematica() {
        System.out.print("Ingrese el primer número: ");
        matematica.setNum1(scan.nextDouble());
        System.out.print("\nIngrese el segundo número: ");
        matematica.setNum2(scan.nextDouble());
    }

    public void crearMatematica(double n1, double n2) {
        matematica = new Matematica(n1, n2);
    }

    public double devolverMayor() {
        return Math.max(matematica.getNum1(), matematica.getNum2());
    }

    public double devolverMenor() {
        return Math.min(matematica.getNum1(), matematica.getNum2());
    }

    public double calcularPotencia() {
        return Math.pow(Math.round(devolverMayor()), Math.round(devolverMenor()));
    }

    public double calcularRaiz() {
        return Math.sqrt(Math.abs(devolverMenor()));
    }
}