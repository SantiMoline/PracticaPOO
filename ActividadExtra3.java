import java.util.Scanner;

import ActividadExtra3.Services.ClienteService;
import ActividadExtra3.Services.RutinaService;

public class ActividadExtra3 {
    static Scanner scan = new Scanner(System.in);
    static ClienteService cs = new ClienteService();
    static RutinaService rs = new RutinaService();
    public static void main(String[] args) {
        //Gimnasio.
        

        int opc = 100;
        while (opc != 9) {
            imprimirMenu();
            opc = scan.nextInt();
            switch(opc) {
                case 1:
                    cs.registrarCliente();
                    break;
                case 2:
                    cs.obtenerClientes();
                    break;
                case 3:
                    modificarCliente();
                    break;                    
                case 4:
                    System.out.print("\nIngrese el ID del cliente a eliminar: ");
                    int id = scan.nextInt();
                    scan.nextLine(); //Throwaway scan.
                    cs.eliminarCliente(id);
                    break;
                case 5:
                    rs.registrarRutina(rs.crearRutina());
                    break;
                case 6:
                    rs.obtenerRutinas();
                    break;
                case 7:
                    modificarRutina();
                    break;
                case 8:
                    System.out.print("\nIngrese el ID de la rutina a eliminar: ");
                    int rut = scan.nextInt();
                    scan.nextLine(); //Throwaway scan.
                    rs.eliminarRutina(rut);
                    break;
                case 9:
                    System.out.println("Nos vemos la próxima. Keep training! =)");
                    break;
            }
        }
    }


    public static void imprimirMenu() {
        System.out.println("---------Bienvenidos a GymApp---------");
        System.out.println("1. Regitrar cliente.");
        System.out.println("2. Consultar clientes.");
        System.out.println("3. Actualizar cliente.");
        System.out.println("4. Eliminar cliente.");
        System.out.println("5. Regitrar rutina.");
        System.out.println("6. Consultar rutinas.");
        System.out.println("7. Actualizar rutina.");
        System.out.println("8. Eliminar rutina.");
        System.out.println("9. Salir.");
    }

    public static void modificarCliente() {
        System.out.print("\nIndique el Nº ID del cliente a modificar: ");
        int id = scan.nextInt();
        scan.nextLine(); //Throwaway scan.
        //int id, String name, int edad, double altura, double peso, String objetivo
        System.out.print("\nNombre: ");
        String name = scan.nextLine();
        System.out.print("\nEdad: ");
        int edad = scan.nextInt();
        System.out.print("\nAltura: ");
        double altura = scan.nextDouble();
        System.out.print("\nPeso: ");
        double peso = scan.nextDouble();
        scan.nextLine(); //Throwaway scan
        System.out.print("\nObjetivo: ");
        String objetivo = scan.nextLine();
        cs.actualizarCliente(id, name, edad, altura, peso, objetivo);   
    }


    
    public static void modificarRutina() {
        System.out.print("\nIndique el Nº ID de la rutina a modificar: ");
        int id = scan.nextInt();
        scan.nextLine(); //Throwaway scan.
        System.out.print("Ingrese el nombre de la rutina a generar: ");
        String name = scan.nextLine();
        System.out.print("\nIngrese la duración: ");
        int duration = scan.nextInt();
        scan.nextLine(); //Throwaway scan.
        System.out.print("\nIngrese el nivel de dificultad: ");
        String difficulty = scan.nextLine();
        System.out.print("\nIndique la descripción: ");
        String description = scan.nextLine();

        rs.actualizarRutina(id, name, duration, difficulty, description);
    }
}
