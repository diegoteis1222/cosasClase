import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {

    public static void main(String[] args) {

        FileWriter archivo = null;
        PrintWriter impresor = null;

        try {
            System.out.println("Creando el archivo");
            archivo = new FileWriter("prueba.txt");
            impresor = new PrintWriter(archivo);

            for (int i = 0; i < 10; i++) {
                impresor.println("Linea: " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (archivo != null)
                    archivo.close();
                System.out.println("Cerrando el archivo");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
