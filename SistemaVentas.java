import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double montoTotalVendido = 0;
        int cantidadTotalProductos = 0;
        char continuar;

        do {
            System.out.print("Nombre del producto: ");
            entrada.nextLine(); // Limpiar el búfer de entrada si es necesario
            String nombre = entrada.nextLine();

            System.out.print("Precio: ");
            double precio = entrada.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = entrada.nextInt();

            // Cálculos acumulativos
            montoTotalVendido += (precio * cantidad);
            cantidadTotalProductos += cantidad;

            System.out.print("¿Desea seguir registrando ventas? (s/n): ");
            continuar = entrada.next().toLowerCase().charAt(0);
            System.out.println();

        } while (continuar == 's');

        // Mostrar estadísticas finales
        System.out.println("--- Resumen de Ventas ---");
        System.out.println("Monto total vendido: S/ " + montoTotalVendido);
        System.out.println("Cantidad total de productos vendidos: " + cantidadTotalProductos);
        
        if (cantidadTotalProductos > 0) {
            double promedioVenta = montoTotalVendido / cantidadTotalProductos;
            System.out.println("Promedio de venta por producto: S/ " + promedioVenta);
        } else {
            System.out.println("No se registraron productos.");
        }
    }
}
