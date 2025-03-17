package Examen;

import java.util.ArrayList;

public class ProductoTest {

    public static void main(String[] args) {

        // crea un arraylist
        ArrayList<Producto> carrito = new ArrayList<Producto>();

        // variables
        double totalPrecio = 0.0;
        double total = 0.0;

        // recorremos un numero random de 1 a 8
        for (int i = 1; i < (int) (1 + Math.random() * 6); i++) { // mientras i sea menor que un numero aleatorio del 1
                                                                  // al 6
            carrito.add(new Producto("Producto" + i, i, i)); // a;ade el producto al arraylist con los valores i
        }

        System.out.println("************Cantidad***Precio***Total");

        // ver lista
        for (Producto producto : carrito) { // por cada producto en carrito
            total = producto.getPrecio() * producto.getCantidad(); // obtiene el total multiplicando el precio por la
                                                                   // cantidad
            System.out.print(producto);
            System.out.print("\t" + String.format("%.2f", total) + "\n"); // el string format trunca el float a dos
                                                                          // decimales

            totalPrecio += total;
        }
        double iva = totalPrecio / 10;

        double finPrecio = iva + totalPrecio;

        totalPrecio = Math.floor(totalPrecio * 100) / 100; // trunca el float a dos decimales

        System.out.println("\n\n\t\tPrecio\t\t" + String.format("%.2f", totalPrecio));
        System.out.println("\n\t\tiva 10%\t\t" + String.format("%.2f", iva));
        System.out.println("\n\t\tTotal\t\t" + String.format("%.2f", finPrecio));

    }

}
