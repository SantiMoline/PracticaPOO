package EjerciciosPOO.Ej6.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej6.Entities.Cafetera;

public class CafeteraService {
    Scanner scan = new Scanner(System.in);
    private Cafetera cafetera = new Cafetera();

    public void crearCafetera() {
        System.out.println("Qué capacidad quiere que tenga la cafetera?");
        cafetera.setCapacidadMaxima(scan.nextDouble());
    }

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(double cant) {
        if (cafetera.getCantidadActual() < cant) {
            System.out.println("La cantidad actual de café en la máquina no alcanza para llenar la taza.");
            System.out.println("Se sirvieron " + cafetera.getCantidadActual() + " ml de café en la taza.");
            vaciarCafetera();
        } else {
            System.out.println("Se llenó la taza de café.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - cant);
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(double cant) {
        if (cafetera.getCantidadActual() + cant > cafetera.getCapacidadMaxima()) {
            System.out.println("La cantidad de café a agregar excede la capacidad máxima de la cafetera.");
            System.out.println("Se llena la cafetera y se ignora el resto.");
            llenarCafetera();
        } else {
            System.out.println("Se procede a agregar la cantidad de café indicado.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cant);
            System.out.println("Café agregado. Ahora la cafetera cuanta con " + cafetera.getCantidadActual() + " ml de café.");
        }
    }

    public double getCantidadActual() {
        return cafetera.getCantidadActual();
    }
}
/*
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero.
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
