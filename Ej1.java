

import Ej1.Entities.Libro;
import Ej1.Services.LibroService;

public class Ej1 {
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        Libro l1 = ls.crearLibro();

        System.out.println("El libro creado es el siguiente:");
        System.out.println(l1.toString());
    }
}
