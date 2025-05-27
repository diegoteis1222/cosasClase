import java.io.File;
import java.io.IOException;

public class LeeerDirecCreado {

    public static void main(String[] args) {

        File directorio = new File(
                "C:\\Users\\Diego\\IdeaProjects\\clase\\src\\GitArchivos\\Programación\\Ventanas");
        String[] archivos = directorio.list();

        for (int i = 0; i < archivos.length; i++) {
            System.out.println("Archivo: " + archivos[i]);
        }

        String rutaBase = "C:\\Users\\Diego\\IdeaProjects\\clase\\src\\GitArchivos\\Programación\\Ventanas";

        File carpeta = new File(rutaBase, "miCarpeta");

        if (!carpeta.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado en: " + directorio.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear el directorio");
                return;
            }

        } else {
            System.out.println("El directorio ya existe");
        }

        File fichero = new File(rutaBase, "cosa.txt");

        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado correctamente: " + fichero.getAbsolutePath());
            } else {
                System.out.println("El fichero ya existe");
            }
        } catch (IOException e) {
            System.err.println("Error al crear el fichero: " + e.getMessage());
        }

        System.out.println("Contenido del directorio: " + carpeta.getAbsolutePath() + " :" );
        File[] listaArchivos = carpeta.listFiles();
        if (listaArchivos != null) {
            for (File archivo : listaArchivos) {
                System.out.println(archivo.getName());
            }
        }
    }
}
