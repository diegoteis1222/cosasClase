package Examen;

import java.util.Scanner;

public class Ejer5A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una cadena: ");
        String cadena1 = sc.nextLine();

        System.out.println("Dame otra cadena: ");
        String cadena2 = sc.nextLine();

        // Convierte las cadenas en arrays de bytes
        byte[] byteArray1 = cadena1.getBytes(); 
        byte[] byteArray2 = cadena2.getBytes();

        //esta linea es sacada de la IA
        int posiciones = Math.max(byteArray1.length, byteArray2.length); // obtiene la cantidad de posiciones en ambos arrays

        // crear stringbuilder
        StringBuilder intercalado = new StringBuilder();

        // Intercala los bytes de los arrays
        for (int i = 0; i < posiciones; i++) { // mientras i no sea mayor que posiciones
            if (i < byteArray1.length) { // si i es menor que la cantidad de datos 1 en el primer array
                intercalado.append((char) byteArray1[i]); // le añade ese valor casteado a char
            }
            if (i < byteArray2.length) { // si i es menor que la cantidad de datos 2 en el primer array
                intercalado.append((char) byteArray2[i]); // le añade ese valor casteado a char
            }
        }
    
        String resultado = intercalado.toString();
        System.out.println(resultado);
        sc.close();
    }
}
