import java.util.Scanner;

public class SistemaEncuesta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadPersonas = 0;
        int sumaEdades = 0;
        int edadMayor = Integer.MIN_VALUE; // Inicializa con el valor más bajo posible
        int edadMenor = Integer.MAX_VALUE; // Inicializa con el valor más alto posible
        int mayoresDeEdad = 0;
        char continuar;

        do {
            System.out.print("Ingrese la edad de la persona: ");
            int edad = entrada.nextInt();

            // Validar que la edad sea un número lógico
            if (edad >= 0) {
                cantidadPersonas++;
                sumaEdades += edad;

                // Determinar edad mayor y menor
                if (edad > edadMayor) {
                    edadMayor = edad;
                }
                if (edad < edadMenor) {
                    edadMenor = edad;
                }

                // Contar mayores de edad (18 o más)
                if (edad >= 18) {
                    mayoresDeEdad++;
                }
            } else {
                System.out.println("Edad no válida.");
            }

            System.out.print("¿Desea registrar otra persona? (s/n): ");
            continuar = entrada.next().toLowerCase().charAt(0);
            System.out.println();

        } while (continuar == 's');

        // Resultados finales
        if (cantidadPersonas > 0) {
            double promedioEdad = (double) sumaEdades / cantidadPersonas;

            System.out.println("--- Resultados de la Encuesta ---");
            System.out.println("Cantidad de personas encuestadas: " + cantidadPersonas);
            System.out.println("Promedio de edad: " + promedioEdad);
            System.out.println("Edad mayor: " + edadMayor);
            System.out.println("Edad menor: " + edadMenor);
            System.out.println("Cantidad de mayores de edad (18 o más): " + mayoresDeEdad);
        } else {
            System.out.println("No se registraron datos en la encuesta.");
        }
    }
}
