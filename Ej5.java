import java.util.Scanner;

import EjerciciosPOO.Ej5.Services.CuentaService;

public class Ej5 {
    public static void main(String[] args) {
        boolean activo = true;
        int opc;
        double monto;
        Scanner scan = new Scanner(System.in);
        CuentaService cs = new CuentaService();
        cs.crearCuenta();

        while (activo) {
            imprimirMenu();
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Cuánto desea ingresar?");
                    monto = scan.nextDouble();
                    while (monto <= 0) {
                        System.out.println(
                                "El monto a ingresar debe ser mayor a 0. Indique nuevamente el monto a depositar: ");
                        monto = scan.nextDouble();
                    }
                    cs.ingresar(monto);
                    System.out.println("Operación realizada con éxito.");
                    break;
                case 2:
                    System.out.println("Cuánto dinero desea extraer?");
                    monto = scan.nextDouble();
                    monto = cs.retirar(monto);
                    System.out.println("El monto extraído fue de: $" + monto);
                    break;
                case 3:
                    monto = cs.extraccionRapida();
                    System.out.println("Se realizó la extración de: $" + monto);
                    break;
                case 4:
                    System.out.println("El saldo disponible en su cuenta es: $" + cs.consultarSaldo());
                    break;
                case 5:
                    System.out.println("Los datos de su cuenta son:\n");
                    System.out.println(cs.consultarDatos());
                    break;
                case 6:
                    System.out.println("Nos vemos pronto!");
                    activo = false;
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
                    break;
            }
        }
        scan.close();
    }

    public static void imprimirMenu() {
        System.out.println("Bienvenido al gestor de cuentas TuBanco: ");
        System.out.println("--------Menú Principal--------");
        System.out.println("1. Realizar depósito.");
        System.out.println("2. Extraer dinero.");
        System.out.println("3. Extracción rápida de dinero (20% del saldo actual).");
        System.out.println("4. Consultar saldo disponible.");
        System.out.println("5. Consultar datos de la cuenta.");
        System.out.println("6. Salir.");
    }
}

/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero),
 * el DNI del cliente (entero largo) y el saldo actual (entero). Las operaciones
 * asociadas a dicha clase son:
 * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés.
 * b) Agregar los métodos getters y setters correspondientes
 * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual.
 * e) Método retirar(double retiro): el método recibe una cantidad de dinero a
 * retirar y se la restará al saldo actual.
 * Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo
 * actual en 0.
 * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
 * Validar que el usuario no saque más del 20%.
 * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la
 * cuenta.
 * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */