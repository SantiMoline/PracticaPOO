package EjerciciosPOO.Ej13.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej13.Entities.Curso;

public class CursoService {
    Scanner scan = new Scanner(System.in);
    private Curso curso = new Curso();


    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i+1) + ":");
            alumnos[i] = scan.nextLine();
            System.out.print("\n");
        }
        return alumnos; 
    }

    public void crearCurso() {
        System.out.println("Ingrese el nombre del curso: ");
        String name = scan.nextLine();
        System.out.println("Indique la cantidad de veces por semana que se dicta el curso: ");
        int cantidadDiasPorSemana = scan.nextInt();
        System.out.println("Indique la duración en horas de cada clase: ");
        int cantidadHorasPorDia = scan.nextInt();
        scan.nextLine(); //Throaway scan after scan.NextInt
        String turno = cargarTurno();
        System.out.println("Indique el precio por hora: ");
        double precio = scan.nextDouble();
        scan.nextLine();
        System.out.println("Proceda a ingresar los nombres de los alumnos inscriptos: ");
        String[] alumnos = cargarAlumnos();

        curso = new Curso(name, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precio, alumnos);
    }

    private String cargarTurno() {
        System.out.println("Indique el turno en el que se dictan las clases (1 = Mañana / 2 = Tarde)");
        int turno = scan.nextInt();
        while (turno != 1 && turno != 2) {
            System.out.println("La opción ingresada es incorrecta. Intente nuevamente...");
            System.out.println("Indique el turno en el que se dictan las clases (1 = Mañana / 2 = Tarde)");
            turno = scan.nextInt();
        }

        return turno == 1 ? "Mañana" : "Tarde";
    }

    public double calcularGananciaSemanal() {
        return curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
    }

    public Curso getCurso() {
        return curso;
    }
}
/*método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que
se ingrese el nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y
la cantidad de días a la semana que se repite el encuentro. */