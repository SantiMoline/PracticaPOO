import EjerciciosPOO.Ej7.Services.PersonaService;

public class Ej7 {
    public static void main(String[] args) {
        PersonaService[] personas = new PersonaService[4];
        int cantSobrepeso = 0, cantBajoPeso = 0, cantPesoOk = 0, cantMayoresEdad = 0;

        for (int i = 0; i < personas.length; i++) {
            System.out.println("\nGuardando la información de la persona Nº " + (i+1));
            personas[i] = new PersonaService();
            personas[i].crearPersona();
            
            switch (personas[i].calcularIMC()) {
                case -1:
                    System.out.println("\nLa persona está debajo de su peso ideal.");
                    cantBajoPeso++;
                    break;
                case 0:
                    System.out.println("\nLa persona está en su peso ideal.");
                    cantPesoOk++;
                    break;
                case 1:
                    System.out.println("\nLa persona tiene sobrepeso.");
                    cantSobrepeso++;
                    break;
                default: System.out.println("Error calculating IMC."); break;
            }

            if (personas[i].esMayorDeEdad()) {
                cantMayoresEdad++;
            }
        }

        imprimirInformacion(cantBajoPeso,cantPesoOk, cantSobrepeso, cantMayoresEdad);
    }

    public static void imprimirInformacion(int cantBajoPeso, int cantPesoOk, int cantSobrepeso, int cantMayoresEdad) {
        double promBajoPeso = (double) cantBajoPeso * 100 / 4;
        double promPesoOk = (double) cantPesoOk * 100 / 4;
        double promSobrepeso = (double) cantSobrepeso * 100 / 4;
        double promMayoresEdad = (double) cantMayoresEdad * 100 / 4;

        System.out.println("Las personas con sobrepeso representan un " + promSobrepeso + " % del total.");
        System.out.println("Las personas con peso ideal representan un " + promPesoOk + " % del total.");
        System.out.println("Las personas con peso por debajo del ideal representan un " + promBajoPeso + " % del total.");
        System.out.println("Las personas mayores de edad representan un " + promMayoresEdad + " % del total.");
        System.out.println("La personas menores de edad representan un " + (100 - promMayoresEdad) + " % del total.");
    }
}
/*
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro),
 * peso y altura. Si el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después
se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y
la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está
en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa
que la persona tiene sobrepeso, y la función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto
si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, para después en el main,
calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */