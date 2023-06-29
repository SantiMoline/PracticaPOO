package EjerciciosExtra.Extra02.Services;

import java.util.Scanner;

import EjerciciosExtra.Extra02.Entities.Puntos;

public class PuntosService {
    Scanner scan = new Scanner(System.in);

    public Puntos crearPuntos() {
        System.out.println("Ingrese las coordenadas de los dos puntos.");
        System.out.print("\nValor 'x' del punto 1: ");
        double x1 = scan.nextDouble();
        System.out.print("Valor 'y' del punto 1: ");
        double y1 = scan.nextDouble();
        System.out.print("\nValor 'x' del punto 2: ");
        double x2 = scan.nextDouble();
        System.out.print("Valor 'y' del punto 2: ");
        double y2 = scan.nextDouble();

        return new Puntos(x1, y1, x2, y2);
    }

    public double calcularDistancia(Puntos puntos) {
        return Math.sqrt(Math.pow(puntos.getX1() - puntos.getX2(),2) + Math.pow(puntos.getY1() - puntos.getY2(),2));
    }
}
