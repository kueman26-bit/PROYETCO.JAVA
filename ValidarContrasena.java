import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contrasenaCorrecta = "Java2026";
        String intento;

        do {
            System.out.print("Ingrese contraseña: ");
            intento = entrada.nextLine();

            if (!intento.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña incorrecta\n");
            }
        } while (!intento.equals(contrasenaCorrecta));

        System.out.println("Acceso permitido");
    }
}
