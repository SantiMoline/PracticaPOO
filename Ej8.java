import java.util.Scanner;

import Ej8.Entities.Cadena;
import Ej8.Services.CadenaService;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadenaService cs = new CadenaService();

        System.out.println("Ingrese una frase: ");
        String input = scan.nextLine();
        Cadena cad = cs.crearCadena(input);

        boolean active = true;
        while (active) {
            mostrarMenu();

            int opc = scan.nextInt();
            scan.nextLine(); //captures the rest of the line after de int.
            switch (opc) {
                case 1:
                    System.out.println("La cantidad de vocales contenidas en la frase es: " + cs.contarVocales(cad));
                    break;
                case 2:
                    System.out.println("La frase invertida es: " + cs.invertirFrase(cad));
                    break;
                case 3:
                    System.out.println("Ingrese el caracter que desea validar si está contenido en la frase: ");
                    String caracter = scan.nextLine();
                    if(cs.contiene(cad, caracter)) {
                        System.out.println("El caracter '" +caracter+ "' se encuentra contenido en la frase: " + cad.getFrase());
                    } else {
                        System.out.println("El caracter '" +caracter+ "' NO se encuentra contenido en la frase: " + cad.getFrase());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el carácter que desea saber cuántas veces se repite: ");
                    caracter = scan.nextLine();
                    System.out.println("El caracter '" + caracter + "'' se repite " + cs.vecesRepetido(cad, caracter) + " veces.");
                    break;
                case 5:
                    System.out.println("Ingrese una nueva frase para comparar su longitud con la original.");
                    String nuevaFrase = scan.nextLine();
                    if (cs.compararLongitud(cad, nuevaFrase)) {
                        System.out.println("Las frases tienen la misma longitud!!");
                    } else {
                        System.out.println("Las frases NO tienen la misma longitud.");
                    }
                    break;
                case 6: 
                    System.out.println("Ingrese una frase para unir a la original: ");
                    nuevaFrase = scan.nextLine();
                    System.out.println("Las frases unidas son las siguientes:\n" + cs.unirFrases(cad, nuevaFrase));
                    break;
                case 7:
                    System.out.println("Ingrese la letra por la cual quiere reemplazar cada 'a' de la frase original.");
                    caracter = scan.nextLine();
                    System.out.println("La frase con las 'a' reemplazadas queda de la siguiente forma:\n" + cs.reemplazar(cad, caracter));
                    break;
                case 8: active = false; break;
                default: 
                    System.out.println("Opción incorrecta. Ingrese la opción nuevamente.");
                    break;
            }
        }
        scan.close();
    }

    public static void mostrarMenu() {
            System.out.println("Bienvenido al gesto de frases FraseAPP.");
            System.out.println("-------------Menú Principal-------------");
            System.out.println("1. Contar vocales.");
            System.out.println("2. Invertir frase.");
            System.out.println("3. Validar si la frase contiene un caracter.");
            System.out.println("4. Contar repeticiones de un caracter en la frase.");
            System.out.println("5. Comparar longitud de una nueva frase con la original.");
            System.out.println("6. Unir a la frase original una nueva frase.");
            System.out.println("7. Reemplazar las 'a' de la frase original por un caracter deseado.");
            System.out.println("8. Salir.");
    }

}
/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud.
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o varias palabras
separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y la longitud de manera automática
según la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite
el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase
ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el
usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro
carácter seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero
si la contiene y falso si no. */