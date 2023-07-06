package ActividadExtra2.Services;

import ActividadExtra2.Entities.Alquiler;
import ActividadExtra2.Entities.Pelicula;

import java.time.LocalDate;
import java.util.Scanner;


public class ServicioAlquiler {

    private Alquiler alquiler = new Alquiler();
    Scanner scan = new Scanner(System.in);
    public void crearAlquiler(Pelicula pelicula) {



        this.alquiler.setPelicula(pelicula);
        this.alquiler.setFechaInicio(LocalDate.now());

        System.out.println("Indique cuantos días desea alquilar la película");
        int dias = scan.nextInt();
        scan.nextLine(); //Throaway scan.

        this.alquiler.setFechaFin(this.alquiler.getFechaInicio().plusDays(dias));
        // Calendar c = Calendar.getInstance();
        // c.setTime(this.alquiler.getFechaInicio());
        // c.add(Calendar.DATE, dias);
        // this.alquiler.setFechaFin(c.getTime());

        if (dias <= 3) {
            this.alquiler.setPrecio(10);
        } else {
            this.alquiler.setPrecio(10 * (Math.pow((1 + (double) 10 / 100), (dias - 3))));
        }
    }

    public Pelicula listarPeliculaAlquilada() {
        return this.alquiler.getPelicula();
    }

    public boolean buscarAlquilerPorFecha(LocalDate fecha) {
        return !fecha.isBefore(this.alquiler.getFechaInicio()) && !fecha.isAfter(this.alquiler.getFechaFin());
    }
}
