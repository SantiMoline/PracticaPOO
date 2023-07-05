package EjerciciosPOO.Ej14.Services;

import java.util.Scanner;

import EjerciciosPOO.Ej14.Entities.Movil;

public class MovilService {
    Scanner scan = new Scanner(System.in);
    private Movil movil = new Movil();
    
    private int[] ingresarCodigo() {
        int[] codigo = new int[7];
        System.out.print("\nIngrese el código de 7 dígitos correspondiente al celular: ");
        String code = scan.nextLine();
        while (code.length() != 7) {
            System.out.print("\nEl código debe tener 7 dígitos de longitud. Ingréselo nuevamente: ");
            code = scan.nextLine();
        }
        //Recorro el string y convierto cada caracter en int.
        for ( int i = 0; i < codigo.length; i++) {
            codigo[i] = Integer.parseInt(code.substring(i, i+1));
        }
        return codigo;
    }

    public void cargarCelular() {
        System.out.println("Ingrese la información del celular a cargar: ");
        System.out.print("\nMarca: ");
        String marca = scan.nextLine();
        System.out.print("\nModelo: ");
        String modelo = scan.nextLine();
        System.out.print("\nPrecio: ");
        double precio = scan.nextDouble();
        System.out.print("Memoria RAM: ");
        int memoriaRam = scan.nextInt();
        System.out.print("Almacenamiento: ");
        int almacenamiento = scan.nextInt();
        scan.nextLine(); //Throaway after scan.nextInt()
        int[] code = ingresarCodigo();

        movil = new Movil(marca, precio, modelo, memoriaRam, almacenamiento, code);
    }

    public Movil getMovil(){
        return this.movil;
    }
}
/*- Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y
poder cargarlo en nuestro programa.
- Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular.
Para ello, puede utilizarse un bucle repetitivo */