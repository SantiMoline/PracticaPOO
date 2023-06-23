import java.util.Arrays;

public class Ej10 {
    public static void main(String[] args) {
        double[] arr1 = new double[50];
        double[] arr2 = new double[20];

        // Arrays.fill(arr1,Math.random()*10); --> No sirve porque calcula el random 1 sola vez y lo copia en todos los elementos.
        inicializarArrayRandom(arr1);
        System.out.println("El arreglo 1 se generó con los siguientes valores: ");
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);

        arr2 = Arrays.copyOfRange(arr1, 0, 19);
        Arrays.fill(arr2,10,19,0.5);
        System.out.println("El arreglo 1 quedó ordenado de la siguiente manera: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("El arreglo 2 quedó cargado con los siguientes valores: ");
        System.out.println(Arrays.toString(arr2));
    }

    public static void inicializarArrayRandom(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 10);//Para que haya solo dos decimales.
        }
    }
}
/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales,
y el segundo B, un arreglo de 20 números, también reales.
El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes:
el ordenado de 50 elementos y el combinado de 20.
 */