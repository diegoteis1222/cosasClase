package Retos;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame palabras: ");
        String palabras = sc.nextLine();

        palabras.split(palabras);

        String[] separadas = palabras.split(" ");
        String[] lista = new String[separadas.length];

        System.out.println(Arrays.toString(separadas));

        for (int h = 0; separadas.length > h; h++) {

            System.out.println(separadas[h].toString());

            String palabra = separadas[h];
            lista[h] = palabra;
        }

        System.out.println(Arrays.toString(lista));

        for (int h = 0; lista.length > h; h++) {

            String palabra = lista[h].substring(h);



        }

        sc.close();

    }

}
