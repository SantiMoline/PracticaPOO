package EjerciciosPOO.Ej8.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej8.Entities.Cadena;

public class CadenaService {
    Scanner scan = new Scanner(System.in);
    private Cadena cadena = new Cadena();
    
    public void crearCadena(String frase) {
        cadena.setFrase(frase);
    }

    public int contarVocales() {
        int contadorVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letter = String.valueOf(cadena.getFrase().charAt(i));
            
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||letter.equalsIgnoreCase("i") ||letter.equalsIgnoreCase("o") ||letter.equalsIgnoreCase("u")) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    public String invertirFrase() {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(cadena.getFrase().substring(i, i+1));
        }
        return fraseInvertida;
    }

    public int vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean compararLongitud(String frase) {
        return cadena.getLongitud() == frase.length();
    }

    public String unirFrases(String frase) {
        return cadena.getFrase().concat(frase);
    }

    public String reemplazar(String letra) {
        String result = cadena.getFrase().replaceAll("a", letra);
        return result.replaceAll("A", letra);
    }

    public boolean contiene(String letra) {
        return cadena.getFrase().contains(letra);
    }

    public String getFrase() {
        return cadena.getFrase();
    }
}