import java.util.Scanner;

import EjerciciosPOO.Ej6.Services.CafeteraService;

public class Ej6 {
    public static void main(String[] args) {
        CafeteraService cs = new CafeteraService();
        cs.crearCafetera();
        boolean activo = true;
        int opc;
        Scanner scan = new Scanner(System.in);

         while (activo) {
            imprimirMenu();
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Cafetera llenada con éxito.");
                    cs.llenarCafetera();
                    System.out.println("La cafetera ahora tiene " + cs.getCantidadActual() + " ml de café.");
                    break;
                case 2:
                    System.out.println("Indique la capacidad en ml de la taza a servir.");
                    cs.servirTaza(scan.nextDouble());
                    break;
                case 3:
                    cs.vaciarCafetera();
                    System.out.println("Cafetera vaciada con éxito.");
                    break;
                case 4:
                    System.out.println("Indique la cantidad de café a agregar: ");
                    cs.agregarCafe(scan.nextDouble());
                    break;
                case 5:
                    System.out.println("A seguir trabajando. Nos vemos luego!");
                    activo = false;
                    break;
                default: 
                    System.out.println("Opción incorrecta. Intente nuevamente.");
                    break;
            }
        }
        scan.close();
    }

    public static void imprimirMenu() {
        System.out.println("Bienvenido a Coffe Machine App: ");
        System.out.println("--------Menú Principal--------");
        System.out.println("1. Llenar cafetera.");
        System.out.println("2. Servir taza de café.");
        System.out.println("3. Vaciar cafetera.");
        System.out.println("4. Agregar café.");
        System.out.println("5. Salir.");
    }
}
/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Implemente, al menos, los siguientes métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual 
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/