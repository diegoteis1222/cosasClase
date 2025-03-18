package Examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ejer1A {

    final static int posiciones = 50;
    static float[] datos;

    public static void generaArray(float posiciones) {
        datos = new float[(int) posiciones];
        Random random = new Random();

        for (int i = 0; i < datos.length; i++) {
            datos[i] = -100 + random.nextFloat(200);
        }
    }

    public static float[] mergeSort(float[] arr)

    {

        if (arr.length > 1) {

            int elementsInA1 = arr.length / 2;

            int elementsInA2 = arr.length - elementsInA1;

            float[] arr1 = new float[elementsInA1];
            float[] arr2 = new float[elementsInA2];

            for (int i = 0; i < elementsInA1; i++)
                arr1[i] = arr[i];

            for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = arr[i];

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0, j = 0, k = 0;

            while (arr1.length != j && arr2.length != k) {
                if (arr1[j] < arr2[k]) {
                    arr[i] = arr1[j];

                    i++;
                    j++;
                } else {
                    arr[i] = arr2[k];

                    i++;
                    k++;
                }
            }
            while (arr1.length != j) {
                arr[i] = arr1[j];
                i++;
                j++;
            }
            while (arr2.length != k) {
                arr[i] = arr2[k];
                i++;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        generaArray(posiciones);

        // Mostrar por pantalla
        System.out.println(Arrays.toString(datos));

        // Ordenar el array y mostrarlo ordenado
        mergeSort(datos);
        System.out.println(Arrays.toString(datos));

        // Separar positivos y negativos en dos ArrayList
        ArrayList<Float> positivos = new ArrayList<>();
        ArrayList<Float> negativos = new ArrayList<>();

        for (float num : datos) { // por cada dato en el array
            if (num >= 0) { // si el numero es igual o menor que cero
                positivos.add(num); // lo añade a positivos
            } else {
                negativos.add(num); // lo añade a negativos
            }
        }

        // Mostrar positivos y negativos
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        // Separar positivos en pares e impares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (float num : positivos) { // por cada numero en positivos
            int numEntero = (int) num; // castea num de float a int
            if (numEntero % 2 == 0) { // si el resto de la divion del numero entre 2 es 0
                pares.add(numEntero); // lo añade a pares
            } else {
                impares.add(numEntero); // si no lo añade a impares
            }
        }

        // Mostrar positivos y negativos
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }

}
