package EjerciciosPOO.Ej12.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String name;
    private LocalDate birhDate;

    //Empty constructor
    public Persona() {

    }

    //Constructor.
    public Persona(String name, LocalDate birthDate) {
        this.name = name;
        this.birhDate = birthDate;
    }

    //Getters & Setters.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirhDate() {
        return this.birhDate;
    }

    public void setBirhDate(LocalDate birhDate) {
        this.birhDate = birhDate;
    }

    //toString
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/YYYY");
        return
            "Nombre: " + getName() + 
            "\nFecha de nacimiento: " + formatter.format(birhDate);
    }


}

