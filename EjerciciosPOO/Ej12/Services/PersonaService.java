package EjerciciosPOO.Ej12.Services;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import EjerciciosPOO.Ej12.Entities.Persona;

public class PersonaService {
    Scanner scan = new Scanner(System.in);
    private Persona persona = new Persona();

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona: ");
        String name = scan.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la misma (d/MM/YYYY): ");
        String date = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu"); 
        //Genero la posibilidad de leer el formato de la fecha en String y convertirlo correctamente al formato de LocalDate.
        //Tuve que usar 'uuuu' en lugar de 'YYYY' porque sino se rompía.

        LocalDate birthDate = LocalDate.parse(date,formatter); //Transformo el String date a LocalDate.
        
        this.persona = new Persona(name,birthDate);
    }

    public int calcularEdad() {
        return (int) ChronoUnit.YEARS.between(persona.getBirhDate(), LocalDate.now(ZoneId.systemDefault()));
    }

    public boolean menorQue(int edad) {
        return calcularEdad() < edad;
    }

    public void mostrarPersona() {
        
        System.out.println(persona);
    }
}
