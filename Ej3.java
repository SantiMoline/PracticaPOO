import Ej3.Entities.Operacion;
import Ej3.Services.OperacionService;

public class Ej3 {
    public static void main(String[] args) {
        OperacionService os = new OperacionService();
        Operacion op = os.crearOperacion();

        System.out.println("El resultado de la suma de los números ingresados es: " + os.sumar(op));
        System.out.println("El resultado de la resta de los números ingresados es: " + os.restar(op));
        System.out.println("El producto de la multiplicación de los números ingresados es: " + os.multiplicar(op));
        System.out.println("El resultado de la división de los números ingresados es: " + os.dividir(op));       
    }
}


/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, 
 * se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar():  Se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */