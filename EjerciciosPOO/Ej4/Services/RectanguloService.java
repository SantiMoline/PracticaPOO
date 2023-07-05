package EjerciciosPOO.Ej4.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej4.Entities.Rectangulo;

public class RectanguloService {
    Scanner scan = new Scanner(System.in);
    private Rectangulo rect = new Rectangulo();  
    
    public void crearRectangulo() {
        double base, altura;
        
        System.out.println("Ingrese la medida de la base del rectángulo a crear: ");
        base = scan.nextDouble();
        System.out.println("Ingrese la medida de la altura del rectángulo a crear: ");
        altura = scan.nextDouble();

        rect = new Rectangulo(base, altura);
    }

    public double calcularPerimetro() {
        return (rect.getBase() * 2 + rect.getAltura() * 2);
    }

    public double calcularArea() {
        return (rect.getAltura() * rect.getBase());
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if(i == 0 || i == rect.getAltura() - 1 || j == 0 || j == rect.getBase() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
