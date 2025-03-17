package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 10. Realiza un programa que cree un vector de 100 posiciones 
 * con números aleatorios entre 1 y 100. 
 * Una vez creado el vector QUICKSORT el programa deberá ordenar el vector 
 * y mostrar los números entre 1 y 100 que no han sido almacenados.
 */

public class Propuesto10 {

    // Implementación del algoritmo QuickSort
    public static void quickSort(int[] array, int inicio, int fin) {
        if (inicio >= fin) {
            return; // Caso base: si el subarray tiene uno o ningún elemento
        }

        // Elegir el pivote (en este caso, el primer elemento)
        int pivote = array[inicio];
        int izquierda = inicio + 1;
        int derecha = fin;

        // Reorganizar los elementos alrededor del pivote
        while (izquierda <= derecha) {
            // Encontrar un elemento mayor que el pivote desde la izquierda
            while (izquierda <= fin && array[izquierda] < pivote) {
                izquierda++;
            }

            // Encontrar un elemento menor que el pivote desde la derecha
            while (derecha > inicio && array[derecha] >= pivote) {
                derecha--;
            }

            // Intercambiar los elementos si no se han cruzado
            if (izquierda < derecha) {
                swap(array, izquierda, derecha);
            }
        }

        // Colocar el pivote en su posición correcta
        if (derecha > inicio) {
            swap(array, inicio, derecha);
        }

        // Llamadas recursivas para los subarrays izquierdo y derecho
        quickSort(array, inicio, derecha - 1); // Subarray izquierdo
        quickSort(array, derecha + 1, fin); // Subarray derecho
    }

    // Métod para intercambiar dos elementos en el array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[100]; // Crea array de 100 posiciones

        // Lleva el array de datos aleatorios
        for (int j = 0; j < array.length; j++) {
            array[j] = 1 + random.nextInt(100);
        } // fin for

        // Creacion de ArrayList
        ArrayList<Integer> ausentes = new ArrayList<>();

        // Creaccion del HashMap para contar las repeticiones de cada número
        Map<Integer, Integer> frecuencia = new HashMap<>();

        // Recorrer el vector para calcular mayor, menor, suma y frecuencias
        for (int num : array) { // FOR EACH
            // Contar la frecuencia de aparicion de cada número 
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
            // COGE EL VALOR DE DETERMINADO NUMERO Y ADD1
        }

        for (Map.Entry<Integer, Integer> pareja : frecuencia.entrySet()) {
            System.out.println("numero del array: " + pareja.getKey() + " --> veces: " + pareja.getValue());
        }
        
        // FOR PARA VER LOS AUSENTES
        for (int i = 1; i <= 100; i++) {
            if (!frecuencia.containsKey(i))
                ausentes.add(i);// prob

        }
        System.out.println(ausentes);

    }// main

}