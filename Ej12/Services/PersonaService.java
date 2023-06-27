package Ej12.Services;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import Ej12.Entities.Persona;

public class PersonaService {
    Scanner scan = new Scanner(System.in);

    public Persona crearPersona() {
        //Locale.setDefault(Locale.getDefault());
        System.out.println("Ingrese el nombre de la persona: ");
        String name = scan.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la misma (d/MM/YYYY): ");
        String date = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu"); 
        //Genero la posibilidad de leer el formato de la fecha en String y convertirlo correctamente al formato de LocalDate.
        //Tuve que usar 'uuuu' en lugar de 'YYYY' porque sino se rompía.

        LocalDate birthDate = LocalDate.parse(date,formatter); //Transformo el String date a LocalDate.
        return new Persona(name,birthDate);
    }

    public int calcularEdad(Persona persona) {
        return (int) ChronoUnit.YEARS.between(persona.getBirhDate(), LocalDate.now(ZoneId.systemDefault()));
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        
        System.out.println(persona);
    }
}
