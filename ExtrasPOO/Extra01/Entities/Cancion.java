package ExtrasPOO.Extra01.Entities;

public class Cancion {
    private String titulo;
    private String autor;

    //Empty constructor
    public Cancion() {

    }

    //Constructor
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters & Setters.
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //toString
    @Override
    public String toString() {
        return "\nTítulo: " + getTitulo() +
            "\nAutor: " + getAutor();
    }
}
