import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = 25; // Definido según el ejemplo
        int intento;
        int intentosRealizados = 0;

        do {
            System.out.print("Adivina el número secreto: ");
            intento = entrada.nextInt();
            intentosRealizados++;

            if (intento > numeroSecreto) {
                System.out.println("Muy alto");
            } else if (intento < numeroSecreto) {
                System.out.println("Muy bajo");
            }
        } while (intento != numeroSecreto);

        System.out.println("¡Correcto!");
        System.out.println("Intentos realizados: " + intentosRealizados);
    }
}
