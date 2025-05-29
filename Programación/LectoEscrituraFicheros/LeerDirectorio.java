import java.io.File;

public class LeerDirectorio {

    public static void main(String[] args) {

        File directorio = new File("C:\\Users\\Diego\\IdeaProjects\\clase\\src\\GitArchivos\\Programación\\Ventanas\\LectoEscrituraFicheros");
        String[] archivos = directorio.list();

        for (int i = 0; i < archivos.length; i++) {
            System.out.println("Archivo: " + archivos[i]);
        }

    }
}
