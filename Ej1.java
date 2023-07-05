import EjerciciosPOO.Ej1.Services.LibroService;

public class Ej1 {
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        ls.crearLibro();
        System.out.println("El libro creado es el siguiente:");
        System.out.println(ls.toString());
    }
}
