import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ActividadExtra2.Services.ServicioAlquiler;
import ActividadExtra2.Services.ServicioPelicula;

public class ActividadExtra2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ServicioPelicula[] peliculasDisponibles = new ServicioPelicula[5];
        ServicioAlquiler[] peliculasAlquiladas = new ServicioAlquiler[3];
        int contPeliculas = 0;
        int contAlquileres = 0;

        boolean activo = true;

        System.out.println("Bienvenido al alquiler de películas, elija la opción que desea realizar:");
        while (activo) {
            mostrarMenu();
            int opcion = scan.nextInt();
            scan.nextLine(); // Throwaway scan.
            while (opcion < 1 || opcion > 7) {
                System.out.println("Opción incorrecta, elija una opción entre 1 y 7");
                opcion = scan.nextInt();
                scan.nextLine(); // Throwaway scan.
            }
            switch (opcion) {
                case 1: {
                    peliculasDisponibles[contPeliculas] = new ServicioPelicula();
                    peliculasDisponibles[contPeliculas].crearPelicula();
                    contPeliculas++;
                    break;
                }
                case 2:
                    System.out.println("\nLas palículas disponibles son: ");
                    imprimirArrayDisponibles(peliculasDisponibles);
                    break;
                case 3: {
                    System.out.println("Elija el número de la película que desea alquilar");
                    imprimirArrayDisponibles(peliculasDisponibles);
                    int numeroPelicula = scan.nextInt() - 1;
                    while (numeroPelicula < 0 || numeroPelicula >= peliculasDisponibles.length) {
                        System.out.println("La opción no corresponde a una película disponible");
                        numeroPelicula = scan.nextInt() - 1;
                    }
                    peliculasAlquiladas[contAlquileres] = new ServicioAlquiler();
                    peliculasAlquiladas[contAlquileres].crearAlquiler(peliculasDisponibles[numeroPelicula].getPelicula());
                    peliculasDisponibles[numeroPelicula] = null;
                    contAlquileres++;
                    break;
                }
                case 4:
                    imprimirArrayAlquiladas(peliculasAlquiladas);
                    break;
                case 5:
                    buscarPelicula(peliculasDisponibles);
                    break;
                case 6:
                    buscarAlquiler(peliculasAlquiladas);
                    break;
                case 7:
                    activo = false;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.print("\n");
        System.out.println("1. Cargar una película");
        System.out.println("2. Ver películas disponibles");
        System.out.println("3. Alquilar película");
        System.out.println("4. Ver películas alquiladas");
        System.out.println("5. Buscar película");
        System.out.println("6. Buscar fecha de alquiler");
        System.out.println("7. Salir");
    }

    public static void imprimirArrayDisponibles(ServicioPelicula[] disponibles) {
        boolean encontrada = false;
        for (int i = 0; i < disponibles.length; i++) {
            if (disponibles[i] != null) { // Para evitar error al querer manipular un elemento en null.
                System.out.println((i + 1) + ": " + disponibles[i].listarPelicula());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No existen películas disponibles");
        }
    }

    public static void imprimirArrayAlquiladas(ServicioAlquiler[] alquiladas) {
        boolean encontrada = false;
        for (ServicioAlquiler alquilada : alquiladas) {
            if (alquilada != null) { // Para evitar error al querer manipular un elemento en null.
                System.out.println(alquilada.listarPeliculaAlquilada());
                System.out.print("\n");
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontraron películas alquiladas");
        }
    }

    public static void buscarPelicula(ServicioPelicula[] disponibles) {
        System.out.println("Desea buscar la película por titulo (T) o género (G)");
        String opcion = scan.nextLine();
        while (!opcion.equalsIgnoreCase("T") && !opcion.equalsIgnoreCase("G")) {
            System.out.println("Opción inválida, por favor elija 'T' o 'G'");
            opcion = scan.nextLine();
        }
        boolean encontrada = false;
        if (opcion.equalsIgnoreCase("T")) {
            System.out.println("Ingrese el título de la película que desea buscar");
            String titulo = scan.nextLine();

            encontrada = buscarPorTitulo(titulo, disponibles);
            if (!encontrada) {
                System.out.println("La película " + titulo + " no se encuentra disponible.");
            }
        } else {
            System.out.println("Ingrese el género de la película que desea buscar");
            String genero = scan.nextLine();
            encontrada = buscarPorGenero(genero, disponibles);
            if (!encontrada) {
                System.out.println("No se encontraron películas del género " + genero + " .");
            }
        }
    }

    public static boolean buscarPorTitulo(String titulo, ServicioPelicula[] disponibles) {
        for (ServicioPelicula pelicula : disponibles) {
            if (pelicula == null) {
                continue;
            } // Para evitar error al querer manipular un elemento en null.
            if (pelicula.buscarPeliculaPorTitulo(titulo)) {
                System.out.println("La película " + titulo + " se encuentra disponible:");
                System.out.println(pelicula.getPelicula());
                return true;
            }
        }
        return false;
    }

    public static boolean buscarPorGenero(String genero, ServicioPelicula[] disponibles) {
        boolean encontrada = false;
        for (ServicioPelicula disponible : disponibles) {
            if (disponible == null) {
                continue;
            } // Para evitar error al querer manipular un elemento en null.
            if (disponible.buscarPeliculaPorGenero(genero)) {
                if (!encontrada) {
                    System.out.println("Las siguientes películas del género " + genero + " se encuentran disponibles:");
                    encontrada = true;
                }
                System.out.println("\n" + disponible.getPelicula());
            }
        }
        return encontrada;
    }

    public static void buscarAlquiler(ServicioAlquiler[] alquiladas) {
        System.out.println("Por favor ingrese la fecha del alquiler que desea buscar");

        String date = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        // Genero la posibilidad de leer el formato de la fecha en String y convertirlo
        // correctamente al formato de LocalDate.
        // Tuve que usar 'uuuu' en lugar de 'YYYY' porque sino se rompía.
        LocalDate fecha = LocalDate.parse(date, formatter); // Transformo el String date a LocalDate.
        boolean encontrado = false;

        for (ServicioAlquiler alquiler : alquiladas) {
            if (alquiler == null) {
                continue;
            } // Para evitar error al querer manipular un elemento en null.
            if (alquiler.buscarAlquilerPorFecha(fecha)) {
                if (!encontrado) {
                    System.out.println("Se encontraron los siguientes alquileres en la fecha ingresada:");
                    encontrado = true;
                }
                System.out.println(alquiler.listarPeliculaAlquilada());
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron alquileres activos en la fecha ingresada.");
        }
    }
}