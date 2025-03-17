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

    public static float[] mergeSort(float[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int medio = arr.length / 2; // Punto medio
        float[] arr1 = new float[medio];
        float[] arr2 = new float[arr.length - medio];

        for (int i = 0; i < medio; i++) {
            arr1[i] = arr[i];
        }
        for (int i = medio; i < arr.length; i++) {
            arr2[i - medio] = arr[i];
        }

        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);

        float[] resultado = new float[arr.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            resultado[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            resultado[k++] = arr2[j++];
        }

        return resultado;
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

        for (float num : datos) {
            if (num >= 0) {
                positivos.add(num);
            } else {
                negativos.add(num);
            }
        }

        // Mostrar positivos y negativos
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        // Separar positivos en pares e impares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (float num : positivos) {
            int numEntero = (int) num;
            if (numEntero % 2 == 0) {
                pares.add(numEntero);
            } else {
                impares.add(numEntero);
            }
        }

        // Mostrar positivos y negativos
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }

}
