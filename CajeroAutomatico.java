import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 5000.0; // Posee S/ 5000 inicialmente
        int opcion;

        do {
            System.out.println("--- MENÚ CAJERO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: S/ " + saldo);
                    break;
                case 2:
                    System.out.print("Monto a retirar: S/ ");
                    double retiro = entrada.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Retire su dinero.");
                    } else {
                        System.out.println("Monto inválido o saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a depositar: S/ ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso.");
                    } else {
                        System.out.println("Monto inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 4);
    }
}
