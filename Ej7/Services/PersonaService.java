package Ej7.Services;

import java.util.Scanner;

import Ej7.Entities.Persona;

public class PersonaService {
    
    Scanner scan = new Scanner(System.in);
    public Persona crearPersona() {
        System.out.print("\nIndique el nombre de la persona: ");
        String nombre = scan.nextLine();
        System.out.print("\nIngrese el sexo de la persona (H, M, O): ");
        String sexo = scan.nextLine();
        
        while (!validarSexo(sexo)) {
            System.out.print("\nSexo incorrecto. Ingrese 'H', 'M' u 'O'");
            sexo = scan.nextLine();
        }
        System.out.print("\nIngrese la edad de la persona: ");
        int edad = scan.nextInt();
        System.out.print("\nIngrese la altura de la persona: ");
        double altura = scan.nextDouble();
        System.out.print("\nIngrese el peso de la persona: ");
        double peso = scan.nextDouble();
        scan.nextLine();
        return new Persona(nombre, sexo, edad, peso, altura);
    }

    private boolean validarSexo(String sexo) {
        return (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O"));
    }

    /**
     * 
     * @param persona   (Persona)
     * @return          (int)
     * Function returns -1 if the person is too skinny, 0 if its ok, and 1 if it has overweight.
     */
    public int calularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
}