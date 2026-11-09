import java.util.Scanner;

public class SumaPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese número: ");
            numero = entrada.nextInt();
            
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("\nSuma total: " + suma);
    }
}
