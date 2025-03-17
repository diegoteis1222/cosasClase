package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pide la cadena
        System.out.print("Dame una cadena: ");
        String cadena = sc.nextLine();

        // pasa la cadena a mayusculas
        cadena = cadena.toUpperCase();

        // comvierte la cadena en un array de bytes
        byte[] byteArray = cadena.getBytes();

        System.out.println(cadena);
        System.out.println(Arrays.toString(byteArray));

        // codificador por medio del valor ascii de cada letra
        for (int i = 0; i < byteArray.length; i++) { // mientras i no sea mayor que el largo del array
            // suma 2 al numero en ascii si no es A, Z, 9 o 8
            if (byteArray[i] != 89 && byteArray[i] != 90 && byteArray[i] != 56 && byteArray[i] != 57) {
                byteArray[i] = (byte) (byteArray[i] + 2);
            }
            // A -> C
            if (byteArray[i] == 89) {
                byteArray[i] = 65;
            }
            // Z -> B
            if (byteArray[i] == 90) {
                byteArray[i] = 66;
            }
            // 8 -> 0
            if (byteArray[i] == 56) {
                byteArray[i] = 48;
            }
            // 9 -> 1
            if (byteArray[i] == 57) {
                byteArray[i] = 49;
            }
        }


        System.out.println(Arrays.toString(byteArray));

        String cifrado = new String(byteArray); //convierte en letras el array de bytes
        System.out.println(cifrado);

        sc.close();
    }

}
