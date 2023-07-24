package ActividadExtra3.Entities;

import java.util.UUID;

public class Cliente {
    /*int id, String nombre, int edad, double altura, double peso, String objetivo */
    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;

    //Empty constructor.
    public Cliente() {
    }

    //Constructor
    public Cliente(String nombre, int edad, double altura, double peso, String objetivo) {
        this.id = Integer.valueOf(UUID.randomUUID().toString());
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    //Getters & Setters.
    public int getId() {
        return this.id;
    }

    // private void setId(int id) { //Ponemos el método como private. No queremos modificar la ID única desde afuera. 
                                    //Lo dejé comentado para que no me marque el método sin usar en VSCode.
    //     this.id = id;
    // }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    //toString

    @Override
    public String toString() {
        return
            "Client ID: '" + getId() +
            "\nNombre: " + getNombre() +
            "\nEdad: " + getEdad() +
            "\nAltura: " + getAltura() +
            "\nPeso: " + getPeso() +
            "\nObjetivo:" + getObjetivo();
    }

}
