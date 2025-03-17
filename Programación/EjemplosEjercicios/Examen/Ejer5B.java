package Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable
        int cont = 0;

        // Obtencion de la cadena
        System.out.println("Dame una cadena: ");
        String cadena = sc.nextLine();

        // Convertir la cadena en array y separar sus palabras
        String array[] = cadena.split(" ");

        // Nuevo array para invertir posiciones
        String invertido[] = new String[array.length];

        // Invertir el orden del array
        for (int i = array.length - 1; i >= 0; i--) { // recorre el array de fin a principio
            invertido[cont] = array[i]; // le va dando al nuevo array los valores del viejo de forma inversa
            cont++;
        }

        // Mostrar resultado
        System.out.println("Cadena invertida: ");
        System.out.println(Arrays.toString(invertido));

        // Crear StringBuilder
        StringBuilder reverso = new StringBuilder();

        // Añadir al StringBuilder cada palbra y un espacio
        for (String palabra : array) {
            reverso.append(palabra + " ");
        }

        // Dar la vuelva a las palabras
        reverso.reverse();

        // Mostrar el resultado
        System.out.println("Cadena invertida y palabras invertidas: ");
        System.out.println(reverso);

        sc.close();
    }

}
