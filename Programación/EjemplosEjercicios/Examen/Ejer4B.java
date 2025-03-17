package Examen;

import java.util.ArrayList;

public class Ejer4B {

    public static void main(String[] args) {

        ArrayList<Producto> carrito = new ArrayList<Producto>();

        double totalPrecio = 0.0;
        double total = 0.0;

        // recorremos un numero random de 1 a 8
        for (int i = 1; i < (int) (1 + Math.random() * 6); i++) {
            carrito.add(new Producto("Producto" + i, i, i));
        }

        System.out.println("************Cantidad***Precio***Total");
        // ver lista
        for (Producto producto : carrito) {
            total = producto.getPrecio() * producto.getCantidad();
            System.out.print(producto);
            System.out.print("\t" + String.format("%.2f", total) + "\n");

            totalPrecio += total;
        }
        double iva = totalPrecio / 10;

        double finPrecio = iva + totalPrecio;

        totalPrecio = Math.floor(totalPrecio * 100) / 100;

        System.out.println("\n\n\t\tPrecio\t\t" + String.format("%.2f", totalPrecio));
        System.out.println("\n\t\tiva 10%\t\t" + String.format("%.2f", iva));
        System.out.println("\n\t\tTotal\t\t" + String.format("%.2f", finPrecio));

    }

}
