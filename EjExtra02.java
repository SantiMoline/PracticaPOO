import EjerciciosExtra.Extra02.Entities.Puntos;
import EjerciciosExtra.Extra02.Services.PuntosService;

public class EjExtra02 {
    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        
        System.out.println("-----Bienvenidos a la calculadora de distancia entre puntos-----");
        Puntos puntos = ps.crearPuntos();
        System.out.println("Los puntos ingresados tienen las siguientes coordenadas: ");
        System.out.println(puntos);
        System.out.println("La distancia entre ellos es de: " + ps.calcularDistancia(puntos));
    }
}
/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2,
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y
los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los
dos puntos que existen en la clase Puntos. */