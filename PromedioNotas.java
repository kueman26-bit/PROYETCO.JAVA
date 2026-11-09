import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadNotas = 0;
        double sumaTotal = 0;
        char continuar;

        do {
            System.out.print("Ingrese una nota (0 a 20): ");
            double nota = entrada.nextDouble();

            // Validar que la nota esté en el rango correcto
            if (nota >= 0 && nota <= 20) {
                sumaTotal += nota;
                cantidadNotas++;
            } else {
                System.out.println("Nota inválida. Debe estar entre 0 y 20.");
            }

            System.out.print("¿Desea seguir ingresando más notas? (s/n): ");
            continuar = entrada.next().toLowerCase().charAt(0);
            System.out.println();

        } while (continuar == 's');

        // Mostrar resultados finales si se ingresó al menos una nota
        if (cantidadNotas > 0) {
            double promedio = sumaTotal / cantidadNotas;
            System.out.println("--- Resultados ---");
            System.out.println("Cantidad de notas: " + cantidadNotas);
            System.out.println("Suma total: " + sumaTotal);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }
    }
}
