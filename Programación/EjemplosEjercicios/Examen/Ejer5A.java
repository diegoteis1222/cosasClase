package Examen;

import java.util.Scanner;

public class Ejer5A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una cadena: ");
        String cadena1 = sc.nextLine();

        System.out.println("Dame otra cadena: ");
        String cadena2 = sc.nextLine();

        byte[] byteArray1 = cadena1.getBytes();
        byte[] byteArray2 = cadena2.getBytes();

        //esta linea es sacada de la IA
        int posiciones = Math.max(byteArray1.length, byteArray2.length);

        StringBuilder intercalado = new StringBuilder();

        for (int i = 0; i < posiciones; i++) {
            if (i < byteArray1.length) {
                intercalado.append((char) byteArray1[i]);
            }
            if (i < byteArray2.length) {
                intercalado.append((char) byteArray2[i]);
            }
        }
    
        String resultado = intercalado.toString();
        System.out.println(resultado);
        sc.close();
    }
}
