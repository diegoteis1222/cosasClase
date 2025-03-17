package Examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ejer1B {

    static double[] datos;

    public static void generaArray(int posiciones) {
        datos = new double[posiciones];
        Random random = new Random();

        for (int i = 0; i < datos.length; i++) {
            datos[i] = -200 + random.nextDouble(400);
        }
    }

    public static void quickSort(double[] datos2, int inicio, int fin) {

        if (inicio >= fin) {
            return;
        }

        int pivote = (int) datos2[inicio];
        int izquierda = inicio + 1;
        int derecha = fin;

        while (izquierda <= derecha) {
            while (izquierda <= fin && datos2[izquierda] < pivote) {
                izquierda++;
            }

            while (derecha > inicio && datos2[derecha] >= pivote) {
                derecha--;
            }

            if (izquierda < derecha) {
                intercambiar(datos2, izquierda, derecha);
            }
        }

        if (derecha > inicio) {
            intercambiar(datos2, inicio, derecha);
        }

        quickSort(datos2, inicio, derecha - 1);
        quickSort(datos2, derecha + 1, fin);
    }

    public static void intercambiar(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {

        generaArray(60);

        System.out.println("Array antes de ordenar: ");
        System.out.println(Arrays.toString(datos));

        quickSort(datos, 0, datos.length - 1);

        System.out.println("Array ordenado: ");
        System.out.println(Arrays.toString(datos));

        ArrayList<Double> positivos = new ArrayList<>();
        ArrayList<Double> negativos = new ArrayList<>();

        for (double num : datos) {

            if (num > -1) {
                positivos.add(num);
            } else {
                negativos.add(num);
            }
        }
        System.out.println("positivos: ");
        System.out.println(positivos);
        System.out.println("negativos: ");
        System.out.println(negativos);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (double num : negativos) {
            int numEntero = (int) num;
            if (numEntero % 2 == 0) {
                pares.add(numEntero);
            } else {
                impares.add(numEntero);
            }
        }

        System.out.println("pares: ");
        System.out.println(pares);
        System.out.println("impares: ");
        System.out.println(impares);

    }
}
