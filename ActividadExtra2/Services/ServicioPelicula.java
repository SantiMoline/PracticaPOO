package ActividadExtra2.Services;

import ActividadExtra2.Entities.Pelicula;

import java.util.Scanner;

public class ServicioPelicula {
    Scanner scan = new Scanner(System.in);
    private Pelicula pelicula = new Pelicula();

    public void crearPelicula() {
        System.out.println("Por favor ingrese los datos de la película");

        System.out.print("Título: ");
        this.pelicula.setTitulo(scan.nextLine());

        System.out.print("Genero: ");
        this.pelicula.setGenero(scan.nextLine());

        System.out.print("Año: ");
        this.pelicula.setAnio(Integer.parseInt(scan.nextLine()));

        System.out.print("Duración en minutos: ");
        this.pelicula.setDuracion(Integer.parseInt(scan.nextLine()));
    }

    public String listarPelicula() {
        return this.pelicula.getTitulo();
    }

    public boolean buscarPeliculaPorTitulo(String titulo) {
        if (this.pelicula == null) {
            return false;
        }
        return this.pelicula.getTitulo().equalsIgnoreCase(titulo);
    }

    public boolean buscarPeliculaPorGenero(String genero) {
        if (this.pelicula == null) {
            return false;
        }
        return this.pelicula.getGenero().equalsIgnoreCase(genero);
    }

    public Pelicula getPelicula() {
        return this.pelicula;
    }
}
