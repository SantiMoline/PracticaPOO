package EjerciciosPOO.Ej1.Services;
import java.util.Scanner;

import EjerciciosPOO.Ej1.Entities.Libro;

public class LibroService {

    private Libro libro = new Libro();

    public void crearLibro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique el título del libro: ");
        libro.setTitle(scan.nextLine());
        System.out.println("Indique el autor del libro: ");
        libro.setAuthor(scan.nextLine());
        System.out.println("Indique la cantidad de páginas que tiene el libro: ");
        libro.setPages(scan.nextInt());
        System.out.println("Indique el ISBN del libro: ");
        libro.setISBN(scan.nextInt());
        scan.nextLine(); //capta el enter del nextint.

        scan.close();
    }

    //Empty constructor.
    public LibroService() {

    }

    //toString
    @Override
    public String toString() {
        return this.libro.toString();
    }

}
