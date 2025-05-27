import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerPidiendoNombre {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String nombreArchivo;
        FileInputStream archivo;
        InputStreamReader conversor;
        BufferedReader filtro;
        String linea;

        System.out.println("Dame el nombre del archivo");
        nombreArchivo = sc.nextLine();

        try {
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            linea = filtro.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = filtro.readLine();
            }

            filtro.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
            sc.close();
        }
    }
}