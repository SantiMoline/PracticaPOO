package ExtrasPOO.Extra01.Services;

import java.util.Scanner;

import ExtrasPOO.Extra01.Entities.Cancion;

public class CancionService {
    
    Scanner scan = new Scanner(System.in);
    private Cancion cancion = new Cancion();

    public void crearCancion() {
        System.out.print("Ingrese el título de la canción a registrar: ");
        cancion.setTitulo(scan.nextLine());
        System.out.print("\nIngrese el nombre del autor: ");
        cancion.setAutor(scan.nextLine());
    }

    public Cancion getCancion() {
        return this.cancion;
    }
}
