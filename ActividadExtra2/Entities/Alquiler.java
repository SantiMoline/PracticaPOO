package ActividadExtra2.Entities;

import java.time.LocalDate;

public class Alquiler {

    private Pelicula pelicula;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula pelicula, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.pelicula = pelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return 
            "\nPelícula: " + pelicula.getTitulo() +
            "\nFecha de inicio: " + fechaInicio +
            "\nFecha de devolución: " + fechaFin +
            "\nPrecio: $" + precio;
    }
}
