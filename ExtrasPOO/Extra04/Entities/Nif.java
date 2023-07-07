package ExtrasPOO.Extra04.Entities;

public class Nif {
    private long dni;
    private String letra;

    //Empty constructor.
    public Nif() {

    }

    //Constructor.
    public Nif(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    //Getters & Setters.
    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return this.letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }


    @Override
    public String toString() {
        return
            "\nNIF: " + getDni() + "-" + getLetra();
    }


}
