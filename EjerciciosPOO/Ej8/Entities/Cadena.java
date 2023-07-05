package EjerciciosPOO.Ej8.Entities;

public class Cadena {
    private String frase;
    private int longitud;

    //Empty constructor.
    public Cadena() {

    }

    //Constructor.
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    //Getters & Setters.
    public String getFrase() {
        return this.frase;
    }

    //El setFrase debe actualizar también el atributo longitud.
    public void setFrase(String frase) {
        this.frase = frase;
        setLongitud(frase.length());
    }

    public int getLongitud() {
        return this.longitud;
    }

    //SetLongitud no tiene sentido que sea público, ya que siempre tiene que tener un valor acorde a la
    //frase almacenada en el otro atributo.
    private void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
