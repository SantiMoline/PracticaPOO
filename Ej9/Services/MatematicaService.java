package Ej9.Services;

import java.util.Scanner;

import Ej9.Entities.Matematica;

public class MatematicaService {
    Scanner scan = new Scanner(System.in);

    public Matematica crearMatematica() {
        double n1, n2;
        System.out.print("Ingrese el primer número: ");
        n1 = scan.nextDouble();
        System.out.print("\nIngrese el segundo número: ");
        n2 = scan.nextDouble();
        
        return new Matematica(n1,n2);
    }

    public Matematica crearMatematica(double n1, double n2) {
        return new Matematica(n1, n2);
    }

    public double devolverMayor(Matematica matematica) {
        return Math.max(matematica.getNum1(), matematica.getNum2());
    }

    public double devolverMenor(Matematica matematica) {
        return Math.min(matematica.getNum1(), matematica.getNum2());
    }

    public double calcularPotencia(Matematica matematica) {
        return Math.pow(Math.round(devolverMayor(matematica)), Math.round(devolverMenor(matematica)));
    }

    public double calcularRaiz(Matematica matematica) {
        return Math.sqrt(Math.abs(devolverMenor(matematica)));
    }
}
/*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz
cuadrada se debe obtener el valor absoluto del número. */