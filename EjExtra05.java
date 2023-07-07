import java.util.Scanner;

import ExtrasPOO.Extra05.Servicies.MesesService;

public class EjExtra05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MesesService ms = new MesesService();
        System.out.println("Bienvenido al juego de adivinar meses!");
        System.out.print("\nIngrese cuál cree que es el mes secreto: ");
        String guess = scan.nextLine();
        
        while(!ms.esMesSecreto(guess)) {
            System.out.println("Respuesta incorrecta. Pruebe nuevamente!");
            System.out.print("\nIngrese cuál cree que es el mes secreto: ");
            guess = scan.nextLine();
        }
        System.out.println("Felicitaciones! Ha adivinado. El mes secreto era: " + ms.getMeses());
        scan.close();
    }
}
/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas.
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace,
pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero No ha acertado.
Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado! */