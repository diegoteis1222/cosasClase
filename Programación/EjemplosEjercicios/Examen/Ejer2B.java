package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2B {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame una cadena: ");
        String cadena = sc.nextLine();

        cadena = cadena.toUpperCase();

        byte[] byteArray = cadena.getBytes();

        System.out.println(cadena);
        System.out.println(Arrays.toString(byteArray));

        for (int i = 0; i < byteArray.length; i++) {
            // suma 2 al numero en ascii si no es Y,B, 0 o 1
            if (byteArray[i] != 65 && byteArray[i] != 66 && byteArray[i] != 48 && byteArray[i] != 49) {
                byteArray[i] = (byte) (byteArray[i] - 2);
            }
            // Y -> A
            if (byteArray[i] == 65) {
                byteArray[i] = 89;
            }
            // B -> Z
            if (byteArray[i] == 66) {
                byteArray[i] = 90;
            }
            // 0 -> 8
            if (byteArray[i] == 48) {
                byteArray[i] = 56;
            }
            // 1 -> 9
            if (byteArray[i] == 49) {
                byteArray[i] = 57;
            }
        }


        System.out.println(Arrays.toString(byteArray));

        String cifrado = new String(byteArray); //convierte en letras el array de bytes
        System.out.println(cifrado);

        sc.close();
    }
    
}
