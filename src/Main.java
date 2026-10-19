import java.util.Scanner;

class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de pieza: ");
        String numero = entrada.nextLine();
        System.out.print("Descripción: ");
        String descripcion = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(entrada.nextLine());
        System.out.print("Precio por artículo: ");
        double precio = Double.parseDouble(entrada.nextLine());

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        System.out.println("\n--- Datos de la factura ---");
        System.out.println("Número de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción: " + factura.getDescripcion());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.printf("Precio: $%.2f%n", factura.getPrecio());
        System.out.printf("Monto de la factura: $%.2f%n", factura.obtenerMontoFactura());

        // Demostración de los métodos establecer con valores no válidos
        factura.setCantidad(-5);
        factura.setPrecio(-3.50);
        System.out.println("\nDespués de probar valores negativos:");
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio: " + factura.getPrecio());
        System.out.println("Monto de la factura: " + factura.obtenerMontoFactura());
    }
}
