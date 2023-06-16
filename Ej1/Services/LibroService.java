package Ej1.Services;
import java.util.Scanner;

import Ej1.Entities.Libro;

public class LibroService {
    public Libro crearLibro() {
        
        Libro l1 = new Libro();
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique el título del libro: ");
        l1.setTitle(scan.nextLine());
        System.out.println("Indique el autor del libro: ");
        l1.setAuthor(scan.nextLine());
        System.out.println("Indique la cantidad de páginas que tiene el libro: ");
        l1.setPages(scan.nextInt());
        System.out.println("Indique el ISBN del libro: ");
        l1.setISBN(scan.nextInt());
        scan.nextLine(); //capta el enter del nextint.

        scan.close();
        return l1;
    }

    public LibroService() {

    }
}
