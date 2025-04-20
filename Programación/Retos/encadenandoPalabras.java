import java.util.Scanner;

public class encadenandoPalabras {

    /**
     * Por algun motivo la web no lo acepta, y no entiendo el porque, usando varios
     * casos de prueba esto funciona correctamente pero la web no me deja de dar el
     * error RTE, lo puedes ver en el png que pasé
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame palabras encadenadas: ");
        String palabras = sc.nextLine();

        String[] separadas = palabras.split(" ");

        boolean encadenadas = true;

        if (separadas.length > 1) {
            for (int i = 0; i < separadas.length - 1; i++) {
                if (separadas[i].length() < 2 || separadas[i + 1].length() < 2) {
                    encadenadas = false;
                    break;
                }

                String palabra1 = separadas[i].substring(separadas[i].length() - 2);
                String palabra2 = separadas[i + 1].substring(0, 2);

                if (!palabra1.equals(palabra2)) {
                    encadenadas = false;
                    break;
                }
            }
        }

        if (encadenadas) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

}