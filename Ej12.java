import java.util.Scanner;

import Ej12.Entities.Persona;
import Ej12.Services.PersonaService;

public class Ej12 {
    public static void main(String[] args) {
        System.out.println("-----Bienvenido al Registro de las Personas-----");
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();

        System.out.println("Los datos de la persona ingresada son los siguientes: ");
        ps.mostrarPersona(p1);
        System.out.println("Ingrese una edad ");
        Scanner scan = new Scanner(System.in);
        int edad = scan.nextInt();

        if (ps.menorQue(p1, edad)) {
            System.out.println("La persona es MENOR que la edad indicada");
        } else {
            System.out.println("La persona es MAYOR que la edad indicada.");
        }

        System.out.println("La persona detallada tiene " + ps.calcularEdad(p1) + " años de edad.");        
        scan.close();
    }
}
/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
 * constructor parametrizado, get y set. Y los siguientes métodos:
-Agregar un método de creación del objeto que respete la siguiente firma: crearPersona().
Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear,
recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
-Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta que para conocer la edad
de la persona también se debe conocer la fecha actual.
-Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor
tenga menor edad que la persona que se recibe como parámetro, o false en caso contrario.
-Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
 */