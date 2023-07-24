package ActividadExtra3.Entities;

import java.util.UUID;

public class Rutina {
    //actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion):
    private int id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    //Empty constructor.
    public Rutina() {
    }

    //Constructor.
    public Rutina(String nombre, int duracion, String nivelDificultad, String descripcion) {
        this.id = Integer.parseInt(UUID.randomUUID().toString());
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    //Getters & Setters.
    public int getId() {
        return this.id;
    }

    // private void setId(int id) { //No queremos que se modifique el ID de rutina desde afuera, por eso es private.
                                    //Lo dejé comentado para que no me marque el método sin usar en VSCode.
        //     this.id = id;
    // }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDificultad() {
        return this.nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //toString
    @Override
    public String toString() {
        return
            "Id: " + getId() +
            "\nNombre: " + getNombre() +
            "\nDuración: " + getDuracion() +
            "\nNivel de dificultad: " + getNivelDificultad() +
            "\nDescripción: " + getDescripcion();
    }

    


}
