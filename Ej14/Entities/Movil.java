package Ej14.Entities;

import java.util.Arrays;

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    //Empty constructor
    public Movil() {

    }

    //Constructor
    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = Arrays.copyOf(codigo, codigo.length);
        //Para evitar una reference trap y que el atributo apunte a la misma dirección que el arreglo en el main.
    }

    //Getters & Setters.
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return this.memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return this.almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = Arrays.copyOf(codigo, codigo.length);
        //Para evitar una reference trap y que el atributo apunte a la misma dirección que el arreglo en el main.

    }

    //toString
    @Override
    public String toString() {
        return
            "Marca: " + getMarca() + 
            "\nPrecio: " + getPrecio() + 
            "\nModelo: " + getModelo() + 
            "\nMemoriaRam: " + getMemoriaRam() + 
            "\nAlmacenamiento: " + getAlmacenamiento() + 
            "\nCodigo: " + Arrays.toString(getCodigo());
    }
}
/*Crear una entidad Movil con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo.
El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número correspondiente al código.
 */