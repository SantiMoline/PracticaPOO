package Ej2.Services;

import java.util.Scanner;
import Ej2.Entities.Circunferencia;

public class CircunferenciaService {
    Scanner scan = new Scanner(System.in);



    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia a generar: ");
        return(new Circunferencia(scan.nextDouble()));
    }

    public double calcularPerimetro(Circunferencia c1) {
        return (2 * Math.PI * c1.getRadious());
    }

    public double calcularArea(Circunferencia c1) {
        return (Math.PI * Math.pow(c1.getRadious(),2));
    }


}
