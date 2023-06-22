package Ej8.Services;

import java.util.Scanner;

import Ej8.Entities.Cadena;

public class CadenaService {
    Scanner scan = new Scanner(System.in);
    
    public Cadena crearCadena(String frase) {
        return new Cadena(frase);
    }

    public int contarVocales(Cadena cadena) {
        int contadorVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letter = String.valueOf(cadena.getFrase().charAt(i));
            
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||letter.equalsIgnoreCase("i") ||letter.equalsIgnoreCase("o") ||letter.equalsIgnoreCase("u")) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    public String invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(cadena.getFrase().substring(i, i+1));
        }
        return fraseInvertida;
    }

    public int vecesRepetido(Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean compararLongitud(Cadena cadena, String frase) {
        return cadena.getLongitud() == frase.length();
    }

    public String unirFrases(Cadena cadena, String frase) {
        return cadena.getFrase().concat(frase);
    }

    public String reemplazar(Cadena cadena, String letra) {
        String result = cadena.getFrase().replaceAll("a", letra);
        return result.replaceAll("A", letra);
    }

    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().contains(letra);
    }
}
/*Deberá además implementar los siguientes métodos:




h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero
si la contiene y falso si no. */