package ExtrasPOO.Extra06.Entities;

import java.util.Arrays;

public class Ahorcado {
    private int cantJugadasMax;
    private int cantEncontradas;
    private String[] palabra;
    private String usedLetters;

    //Empty constructor.
    public Ahorcado() {
    }

    //Constructor.
    public Ahorcado(String[] palabra, int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
        this.cantEncontradas = 0;
        this.palabra = Arrays.copyOf(palabra, palabra.length); //To avoid reference trap.
        this.usedLetters = "";
    }

    public Ahorcado(String palabra, int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
        this.cantEncontradas = 0;

        this.palabra = new String[palabra.length()];
        for (int i = 0; i < this.palabra.length; i++) {
            this.palabra[i] = palabra.substring(i, i+1);
        }
        this.usedLetters = "";
    }


    public int getCantJugadasMax() {
        return this.cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

    public int getCantEncontradas() {
        return this.cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public String[] getPalabra() {
        return this.palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = Arrays.copyOf(palabra, palabra.length); //To avoid reference trap.
    }

    public void setPalabra(String palabra) {
        this.palabra = new String[palabra.length()];
        for (int i = 0; i < this.palabra.length; i++) {
            this.palabra[i] = palabra.substring(i, i+1);
        }
    }

    public String getUsedLetters() {
        return this.usedLetters;
    }

    public void setUsedLetters(String usedLetters) {
        this.usedLetters = usedLetters;
    }

    //toSring
    @Override
    public String toString() {
        return Arrays.toString(palabra);
    }
    
}
