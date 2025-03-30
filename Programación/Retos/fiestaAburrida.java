package Retos;

import java.io.IOException;
import java.util.Scanner;

public class fiestaAburrida {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        String[] juntas = new String[numero];

        sc.nextLine();

        for (int h = 0; h < numero; h++) {

            String nombre = sc.nextLine();

            juntas = nombre.split(" ");

            String salida = ("Hola, " + juntas[1] + ".");
            System.out.println(salida);
        }
        sc.close();

    }
}
