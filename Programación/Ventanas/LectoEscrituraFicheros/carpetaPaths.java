import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class carpetaPaths {
    public static void main(String[] args) {

        String rutaActual = System.getProperty("user.dir");
        System.out.println("Directorio actual: " + rutaActual);

        Path rutaBase = Paths.get(System.getProperty("user.dir"));

        rutaBase.resolve("miDirectorio");

        Path nuevoDirectorio = rutaBase.resolve("miDirectorio");

        try {
            if (!Files.exists(nuevoDirectorio)) {
                Files.createDirectory(nuevoDirectorio);
                System.out.println("Directorio creado: " + nuevoDirectorio.toAbsolutePath());
            } else {
                System.out.println("El archivo ya existe");
            }
            Path nuevoFichero = nuevoDirectorio.resolve("ejemplo33.txt");
            if (!Files.exists(nuevoFichero)) {
                Files.createFile(nuevoFichero);
                System.out.println("Archivo creado: " + nuevoFichero.toAbsolutePath());
            } else {
                System.out.println("El archivo ya existe");
            }
            System.out.println("Contenido de " + nuevoDirectorio.toAbsolutePath() + " :");
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(nuevoDirectorio)) {
                for (Path entry : stream) {
                    System.out.println(entry.getFileName());
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Dime el contenido de todos mis paquetes: ");
        Path base = Paths.get(
                "C:\\Users\\Diego\\IdeaProjects\\clase\\src\\GitArchivos\\Programación\\Ventanas\\LectoEscrituraFicheros");
        System.out.println("Contenido: " + base.toAbsolutePath() + " :");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(base)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}