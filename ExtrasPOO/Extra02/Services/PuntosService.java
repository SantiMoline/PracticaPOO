package ExtrasPOO.Extra02.Services;

import java.util.Scanner;

import ExtrasPOO.Extra02.Entities.Puntos;

public class PuntosService {
    Scanner scan = new Scanner(System.in);
    private Puntos puntos = new Puntos();

    public void crearPuntos() {
        System.out.println("Ingrese las coordenadas de los dos puntos.");
        System.out.print("\nValor 'x' del punto 1: ");
        double x1 = scan.nextDouble();
        System.out.print("Valor 'y' del punto 1: ");
        double y1 = scan.nextDouble();
        System.out.print("\nValor 'x' del punto 2: ");
        double x2 = scan.nextDouble();
        System.out.print("Valor 'y' del punto 2: ");
        double y2 = scan.nextDouble();

        this.puntos = new Puntos(x1, y1, x2, y2);
    }

    public double calcularDistancia() {
        return Math.sqrt(Math.pow(puntos.getX1() - puntos.getX2(),2) + Math.pow(puntos.getY1() - puntos.getY2(),2));
    }

    //Getter
    public Puntos getPuntos() {
        return this.puntos;
    }
}
