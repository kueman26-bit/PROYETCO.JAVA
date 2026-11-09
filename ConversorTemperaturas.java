import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- CONVERSIÓN DE TEMPERATURAS ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese grados Celsius: ");
                double c = entrada.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println("Resultado: " + f + " °F");
            } else if (opcion == 2) {
                System.out.print("Ingrese grados Fahrenheit: ");
                double f = entrada.nextDouble();
                double c = (f - 32) * 5 / 9;
                System.out.println("Resultado: " + c + " °C");
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción incorrecta.");
            }
            System.out.println();
        } while (opcion != 3);
    }
}
