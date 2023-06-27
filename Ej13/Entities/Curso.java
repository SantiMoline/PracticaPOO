package Ej13.Entities;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    //Empty Constructor.
    public Curso() {

    }


    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = Arrays.copyOf(alumnos, alumnos.length); 
        //En el atributo guardo una COPIA del array recibido, para que no quede apuntando al mismo array que se pasa desd el main.
        //De no guardar la copia, luego al modificar en el main el contenido del array pasado como argumento, también se estaría modificando este atributo.
    }

    //Getters & Setters.
    public String getNombreCurso() {
        return this.nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return this.cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return this.cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return this.precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = Arrays.copyOf(alumnos, alumnos.length);
    }

    //toString.
    @Override
    public String toString() {
        return
            "Nombre del Curso: " + getNombreCurso() +
            "\nCantidad de horas por dia: " + getCantidadHorasPorDia() +
            "\nCantidad de dias por semana: " + getCantidadDiasPorSemana() +
            "\nTurno: " + getTurno() +
            "\nPrecio por hora: " + getPrecioPorHora() +
            "\nAlumnos: " + Arrays.toString(getAlumnos());
    }
}
/*
 * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco),
donde se alojarán los nombres de cada alumno. 
 */