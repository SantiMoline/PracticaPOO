package ActividadExtra3.Services;

import java.util.ArrayList;
import java.util.Scanner;

import ActividadExtra3.Entities.Rutina;

public class RutinaService {
    ArrayList<Rutina> rutinas = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    /**
     * Fuction name: crearRutina
     * @return  (Rutina)
     * 
     * Description: creates an instance of Rutina reading every field from user input.
     */
    public Rutina crearRutina() {
        System.out.print("Ingrese el nombre del cliente a generar: ");
        String name = scan.nextLine();
        System.out.print("\nIngrese la duración: ");
        int duration = scan.nextInt();
        scan.nextLine(); //Throwaway scan.
        System.out.print("\nIngrese el nivel de dificultad: ");
        String difficulty = scan.nextLine();
        System.out.print("\nIndique la descripción: ");
        String description = scan.nextLine();

        return new Rutina(name, duration, difficulty, description);
    }

    /**
     * Function name: registrarRutina.
     * @param rutina    (Rutina)
     * 
     * Description: Recieves an instance of Rutina and add to the ArrayList.
     */
    public void registrarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    /**
     * Function name: obtenerRutinas
     * Description: Prints a list of every registered rutine.
     */
    public void obtenerRutinas() {
        for (Rutina rutina : rutinas) {
            System.out.println("---------------------------------------");
            System.out.println(rutina);
        }
    }

    /**
     * Function name: actualizarRutina.
     * @param id                (int)
     * @param name              (String)
     * @param duracion          (int)
     * @param nivelDificultad   (String)
     * @param descripcion       (String)
     * @return                  (boolean)
     * 
     * Description: search for the rutine with the chosed ID and updates its information with the new one.
     * Return true if the task is completed or false if the ID is non existent. 
     */
    public boolean actualizarRutina(int id, String name, int duracion, String nivelDificultad, String descripcion) {
        int index = buscarRutina(id);
        if (index >= 0 ) {
            rutinas.get(index).setNombre(name);
            rutinas.get(index).setDuracion(duracion);
            rutinas.get(index).setNivelDificultad(nivelDificultad);
            rutinas.get(index).setDescripcion(descripcion);
            return true;
        } else {
        System.out.println("No se ha encontrado una rutina con la ID indicada. Error al completar la solicitud.");
        return false;
        }
    }

    /**
     * Function name: eliminarRutina.
     * @param id    (int)
     * @return      (boolean)
     * 
     * Description: Search for the rutine with the chosed ID and deletes it.
     * Return true if the rutine was found and deleted. False if there is no rutine with the provided ID.
     */
    public boolean eliminarRutina(int id) {
        int index = buscarRutina(id);
        if (index >= 0) {
            rutinas.remove(index);
            return true;
        } else {
            System.out.println("No existe una rutina con el ID indicado. Error al procesar la solicitud.");
            return false;
        }
    }

    /**
     * Function name: buscarRutina
     * @param id    (int)
     * @return      (int)
     * 
     * Description: Returns the index of the routine with the chosed ID. Returns -1 if the ID does not exist in the arrayList.
     */
    private int buscarRutina(int id) { //Método private ya que sólo se va a utilizar dentro de la clase.
        for (int i = 0; i < rutinas.size(); i++) {
            if(rutinas.get(i).getId() == id)
                return i;
        }
        return -1;
    }
}
/*crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion):
recibe el identificador de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema. */