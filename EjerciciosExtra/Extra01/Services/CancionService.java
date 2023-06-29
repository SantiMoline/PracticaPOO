package EjerciciosExtra.Extra01.Services;

import java.util.Scanner;

import EjerciciosExtra.Extra01.Entities.Cancion;

public class CancionService {
    
    Scanner scan = new Scanner(System.in);

    public Cancion crearCancion() {
        System.out.print("Ingrese el título de la canción a registrar: ");
        String titulo = scan.nextLine();
        System.out.print("\nIngrese el nombre del autor: ");
        String autor = scan.nextLine();

        return new Cancion(titulo, autor);
    }
}
