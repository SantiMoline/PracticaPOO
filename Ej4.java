import EjerciciosPOO.Ej4.Services.RectanguloService;

public class Ej4 {
    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        rs.crearRectangulo();

        System.out.println("El perímetro del rectángulo generado es: " + rs.calcularPerimetro());
        System.out.println("El área del rectángulo generado es: " + rs.calcularArea());
        System.out.println("El rectángulo generado se ve de la siguiente manera: ");
        rs.dibujarRectangulo();
    }
}

/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */