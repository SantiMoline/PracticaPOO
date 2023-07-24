package ActividadExtra3.Services;

import java.util.ArrayList;
import java.util.Scanner;

import ActividadExtra3.Entities.Cliente;

public class ClienteService {
    ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    /**
     * Function name: crearCliente
     * @return      (Cliente)
     * Description: creates an instance of Cliente reading each field value from user input.
     */
    public Cliente crearCliente() {
        System.out.print("Ingrese el nombre del cliente a generar: ");
        String name = scan.nextLine();
        System.out.print("\nIngrese la edad: ");
        int age = scan.nextInt();
        //scan.nextLine(); //Throwaway Scan.
        System.out.print("\nIngrese la altura: ");
        double height = scan.nextDouble();
        //scan.nextLine(); //Throwaway Scan.
        System.out.print("\nIndique el peso de la persona: ");
        double weight = scan.nextDouble();
        scan.nextLine(); //Throwaway scan.
        System.out.print("\nIndique el objetivo del entrenamiento: ");
        String objetive = scan.nextLine();

        return new Cliente(name, age, height, weight, objetive);
    }

    /*
     * Function name: registrarCliente
     * Description: call the create client method and add the recently created client to the 'clientes' arrayList.
     */
    public void registrarCliente() {
        clientes.add(crearCliente());
    }

    /**
     * Function name: obtenerClientes
     * Description: Print a list of registered clients.
     */
    public void obtenerClientes() {
        if(clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Los clientes registrados son los siguientes: ");
            for (Cliente cliente : clientes) {
                System.out.println("---------------------------------------");
                System.out.println(cliente);
            }
        }
    }

    /**
     * Function name: actualizarCliente
     * @param id        (int)
     * @param name      (String)
     * @param edad      (int)
     * @param altura    (double)
     * @param peso      (double)
     * @param objetivo  (String)
     * @return          (boolean)
     * 
     * Description: search for the client with the chosed ID and updates its information with the new one.
     * Return true if the task is completed or false if the ID is non existent. 
     */
    public boolean actualizarCliente(int id, String name, int edad, double altura, double peso, String objetivo) {
        int index = buscarCliente(id);
        if (index >= 0) {
            clientes.get(index).setNombre(name);
            clientes.get(index).setEdad(edad);
            clientes.get(index).setAltura(altura);
            clientes.get(index).setPeso(peso);
            clientes.get(index).setObjetivo(objetivo);
            return true;
        } else {
            System.out.println("El ID ingresado no corresponde con ningún cliente de la base de datos.\nNo se ha podido completar la actualización.");
            return false;
        }
    }

    /**
     * Function name: eliminarCliente
     * @param id    (int)
     * @return      (boolean)
     * Description: Search for the client with the chosen ID.
     * Deletes it and return true. If it couldn't find a cliente with the chosen ID, returns false.
     */
    public boolean eliminarCliente(int id) {
        int index = buscarCliente(id);
        if (index >=0) {
            clientes.remove(index);
            return true;
        } else {
            System.out.println("No existe un cliente con el ID indicado. No se ha podido completar la solicitud.");
            return false;
        }
    }

    /**
     * Function name: buscarCliente
     * @param id    (int)
     * @return      (int)
     * 
     * Description: search the index of the client with the chosed ID. If it does not find it, returns -1.
     */
    private int buscarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) 
                return i;
        }
        return -1;
    }
}

/*registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo):
recibe el identificador de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema. */