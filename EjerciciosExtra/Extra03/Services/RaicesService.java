package EjerciciosExtra.Extra03.Services;

import java.util.Scanner;

import EjerciciosExtra.Extra03.Entities.Raices;

public class RaicesService {
    Scanner scan = new Scanner(System.in);

    public Raices crearRaices() {
        System.out.print("Ingrese el valor de 'a': ");
        double a = scan.nextDouble();
        System.out.print("Ingrese el valor de 'b': ");
        double b = scan.nextDouble();
        System.out.print("Ingrese el valor de 'c': ");
        double c = scan.nextDouble();

        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices raices) {
        return Math.pow(raices.getB(),2) - (4 * raices.getA() * raices.getC());
    }

    /**
     * Function name: tieneRaices
     * @param raices    (Raices)
     * @return          (Boolean)
     * Devuelve verdadero si el discriminante es > 0. Esto quiere decir que la ecuación de segundo grado tiene 2 raices.
     */
    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) > 0;
    }

    /**
     * Function name: tieneRaiz
     * @param raices    (Raices)
     * @return          (Boolean)
     * Devuelve verdadero si el discriminante es = 0. Esto quiere decir que la ecuación de segundo grado tiene sólo 1 raíz.
     */
    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    private void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            double raiz1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
            double raiz2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }

    private void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            double raiz1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
            double raiz2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }

    public void calcular(Raices raices) {
        if (tieneRaices(raices)){
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("La ecuación ingresada no tiene raíces posibles.");
        }
    }


}

/* Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje. */