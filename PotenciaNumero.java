import java.util.Scanner;

public class PotenciaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Base: ");
        int base = entrada.nextInt();
        System.out.print("Exponente: ");
        int exponente = entrada.nextInt();

        long resultado = 1;
        int i = 0;

        // Únicamente usando un ciclo do-while
        if (exponente >= 0) {
            if (exponente > 0) {
                do {
                    resultado *= base;
                    i++;
                } while (i < exponente);
            }
            System.out.println("\nResultado: " + resultado);
        } else {
            System.out.println("El exponente debe ser positivo.");
        }
    }
}
