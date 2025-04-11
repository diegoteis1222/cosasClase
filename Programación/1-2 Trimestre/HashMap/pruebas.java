package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pruebas {

    public static void main(String[] args) {
        // Crear un arreglo de ejemplo
        int[] array = new int[100];

        Random random = new Random();

        Map<Integer, Integer> frecuencia = new HashMap<>();

        // Llenar el vector con números aleatorios entre 30 y 90
        for (int i = 0; i < array.length; i++) {
            array[i] = 30 + random.nextInt(61);
        }

        System.out.println("Arreglo original:");
        imprimirArray(array);

        // Ordenar el arreglo usando Selection Sort
        selectionSort(array);

        System.out.println("\nArreglo ordenado:");
        imprimirArray(array);

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Numero array: " + entry.getKey() + " veces: " + entry.getValue());
        }


    }

    // Método para implementar el algoritmo Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Recorrer todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en la sublista desordenada
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            // Intercambiar el elemento más pequeño con el primer elemento de la sublista desordenada
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    // Método para imprimir un arreglo
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
