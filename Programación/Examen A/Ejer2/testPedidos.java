import java.io.FileWriter;
import java.io.PrintWriter;

public class testPedidos {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "paco", "pacooooooo", 31);

        Orden cosa = new Orden(1);
        cosa.añadirItem(1, p1);

        System.out.println(cosa.toString());
        System.out.println("Total sin iva: " + cosa.calcularTotalOrden());
        System.out.println("Total con iva: " + cosa.totalIva());

        FileWriter archivo = null;
        PrintWriter impresor = null;

        try {

            System.out.println("Guardando en un arvhico");
            archivo = new FileWriter("pinga.txt");
            impresor = new PrintWriter(archivo);

            impresor.println(cosa.toString());
            impresor.println("Total sin iva: " + cosa.calcularTotalOrden());
            impresor.println("Total con iva: " + cosa.totalIva());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (archivo != null)
                    archivo.close();
                System.out.println("Cerrando archivo");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}