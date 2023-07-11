package ExtrasPOO.Extra06.Services;

import java.util.Arrays;
import java.util.Scanner;

import ExtrasPOO.Extra06.Entities.Ahorcado;

public class AhorcadoService {
    
    Scanner scan = new Scanner(System.in);
    private Ahorcado ahorcado = new Ahorcado();

    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar: ");
        String word = scan.nextLine();
        System.out.println("Cuantas oportunidades para adivinar habrá disponibles?");
        int chances = scan.nextInt();
        scan.nextLine(); //Throwaway scan.

        ahorcado = new Ahorcado(word.toLowerCase(),chances);
    }

    public int longitud() {
        return ahorcado.getPalabra().length;
    }

    public boolean buscar(String letter) {
        if (Arrays.toString(ahorcado.getPalabra()).contains(letter)) {
            System.out.println("La letra '" + letter + "' se encuentra en la palabra a adivinar!!! =)");
            return true;
        } else {
            System.out.println("La letra '" + letter + "' no se encuentra en la palabra. =(");
            return false;
        }
    }

    public boolean encontradas(String letter) {
        if (buscar(letter)) {
            ahorcado.setCantEncontradas(ahorcado.getCantEncontradas()+repeticiones(letter));
            System.out.println("Número de letras (encontradas, faltantes): (" +ahorcado.getCantEncontradas() + ", " + letrasFaltantes() + ")");
            return true;
        } else {
            ahorcado.setCantJugadasMax(ahorcado.getCantJugadasMax()-1);
            System.out.println("Número de letras (encontradas, faltantes): (" +ahorcado.getCantEncontradas() + ", " + letrasFaltantes() + ")");
            return false;
        }
    }

    public int repeticiones(String letter) {
        int rep = 0;
        for (int i = 0; i < longitud(); i++) {
            if (ahorcado.getPalabra()[i].equalsIgnoreCase(letter)) {
                rep++;
            }
        }
        return rep;
    }

    public int letrasFaltantes() {
        return longitud() - ahorcado.getCantEncontradas();
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + ahorcado.getCantJugadasMax());
    }

    public void juego() {
        crearJuego();
        while (ahorcado.getCantJugadasMax() > 0 && letrasFaltantes() > 0 ){
            System.out.print("Ingrese una letra: ");
            String letter = readLetter();
            
            ahorcado.setUsedLetters(ahorcado.getUsedLetters() + " - " + letter);
            System.out.println("\nLongitud de la palabra: " + longitud());
            encontradas(letter);
            intentos();
            System.out.println("--------------------------------------------------");
        }
        if (ahorcado.getCantJugadasMax() == 0 ) {
            System.out.println("Game Over =(");
        } else {
            System.out.println("You Rock! Winning was eeeeeeeasy.");
        }
        System.out.println("La palabra a adivinar era: " + ahorcado.toString());
        System.out.println("Las letras utilizadas fueron: " + ahorcado.getUsedLetters());
    }

    private String readLetter() {
        String letter = scan.nextLine().toLowerCase();
        while (ahorcado.getUsedLetters().contains(letter)) {
            System.out.print("La letra ya fue utilizada. Ingrese una nueva letra: ");
            letter = scan.nextLine().toLowerCase();
        }
        return letter;
    }

}
/* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario,
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra,
quedando cada letra de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y
cuantas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se llamará en el main. */