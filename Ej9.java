import Ej9.Entities.Matematica;
import Ej9.Services.MatematicaService;

public class Ej9 {
    public static void main(String[] args) {
        MatematicaService ms = new MatematicaService();
        //Se instancia el objeto pasando dos números random 0-9.
        Matematica math1 = ms.crearMatematica(Math.random()*10, Math.random()*10);

        System.out.println("El mayor número guardado en el objeto es: " + ms.devolverMayor(math1));
        System.out.println("El menor número guardado en el objeto es: " + ms.devolverMenor(math1));
        System.out.println("El resultado de "+ ms.devolverMayor(math1) + " elevado a " + ms.devolverMenor(math1) +" es: " + ms.calcularPotencia(math1));
        System.out.println("La raíz cuadrada de " + ms.devolverMenor(math1) + " es: " + ms.calcularRaiz(math1));
    }
}
/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán
diferentes operaciones matemáticas. La clase deber tener un constructor vacío, parametrizado y get y set.
En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto
con su respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz
cuadrada se debe obtener el valor absoluto del número. */
