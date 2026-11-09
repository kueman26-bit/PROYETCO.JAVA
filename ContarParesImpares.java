import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int numero;

        do {
            numero = entrada.nextInt();

            // El cero no se cuenta como par ni impar ya que sirve para salir
            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (numero != 0);

        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
