package EjerciciosPOO.Ej2.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej2.Entities.Circunferencia;

public class CircunferenciaService {


    Scanner scan = new Scanner(System.in);
    private Circunferencia circunferencia = new Circunferencia();


    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia a generar: ");
        circunferencia.setRadious(scan.nextDouble());
    }

    public double calcularPerimetro() {
        return (2 * Math.PI * circunferencia.getRadious());
    }

    public double calcularArea() {
        return (Math.PI * Math.pow(circunferencia.getRadious(),2));
    }
    
}
