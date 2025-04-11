package Contornos.Examen_17M;

import java.util.Arrays;

public class Optimizacion {

    int numeros[] = { -5, 3, 6, 66, 55, 2, -7, 6, 1 };

    /* Este método busca si un numero está en una lista de números */
    // quitado el booleano y devuelto directamente true o false
    boolean busca(int numeroBuscado) {
        for (int n : numeros) {
            if (numeroBuscado == n) {
                return true;
            }
        }
        return false;
    }

    /* Este cuenta cuantos números positivos hay en la lista de numeros */
    // eliminadas operaciones no necesarias
    int cuentaPositivos() {
        int contador = 0;
        for (int n : numeros) {
            if (n >= 0) {
                contador++;
            }
        }
        return contador;
    }

    /*
     * Este método calcula la media de todos los números guardado en la lista de
     * números
     */
    // no veo nada que optimizar
    float calculaMedia() {
        float cont = 0;
        for (double num : numeros) {
            cont += num;

        }
        return cont / numeros.length;
    }

    /*
     * Este método divide cada número de la lista entre la media de todos los
     * numeros
     */
    // creado el float media para que no llame al metodo calcularmedia cada vez
    float[] dividelosPorLaMedia() {
        float media = calculaMedia();
        float nuevosNumeros[] = new float[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            nuevosNumeros[i] = numeros[i] / media;
        }
        return nuevosNumeros;
    }

    /*
     * Este método calcula la mediana de la lista de numeros.
     * Recueda que la mediana representa el valor de la variable de posición central
     * en un conjunto de datos
     */
    // cree intermedio que hace una operacion recurrente para que solo se haga una
    // vez
    double calculaMediana() {

        int[] copiedArray = numeros.clone();
        Arrays.sort(copiedArray);

        int intermedio = (copiedArray[copiedArray.length / 2]);
        int mediana;

        if (copiedArray.length % 2 == 0) { /* Si la longitud es par, se deben promediar los del centro */
            mediana = ((intermedio - 1) + intermedio) / 2;
        } else {
            mediana = intermedio;
        }
        return mediana;
    }

    // Obtiene el numero que mas veces sale
    // Sacado vecesQueSeRepite del bucle for
    // Este ejercicio tiene una complejidad O(n^2)
    int moda() {
        int maximaVecesQueSeRepite = 0;
        int moda = 0;
        int vecesQueSeRepite = 0;
        for (int i = 0; i < numeros.length; i++) {

            vecesQueSeRepite = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j])
                    vecesQueSeRepite++;
            }
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                moda = numeros[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        return moda;
    }

    // creado por chatGPT
    int modaGPT() {
        Arrays.sort(numeros); // Ordenamos el array O(n log n)

        int moda = numeros[0];
        int maxFrecuencia = 1;
        int frecuenciaActual = 1;

        // Recorremos el array ya ordenado para encontrar la moda
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == numeros[i - 1]) {
                frecuenciaActual++; // Mismo número que el anterior, sumamos 1 a la frecuencia
            } else {
                frecuenciaActual = 1; // Reiniciamos el contador si el número cambia
            }

            if (frecuenciaActual > maxFrecuencia) {
                maxFrecuencia = frecuenciaActual;
                moda = numeros[i];
            }
        }

        return moda;
    }

    public static void main(String[] args) {
        new Optimizacion();
    }

    public Optimizacion() {
        System.out.println("Numeros: " + Arrays.toString(numeros));
        System.out.println("Tiene el 5:" + busca(5));
        System.out.println("Tiene el 2:" + busca(2));
        System.out.println("Hay " + cuentaPositivos() + " números positivos");
        System.out.println("La media vale: " + calculaMedia());

        System.out.println("Cada número dividido por la media de todos: " + Arrays.toString(dividelosPorLaMedia()));
        System.out.println("La mediana vale:" + calculaMediana());
        System.out.println("La moda vale:" + moda());
        System.out.println("La moda echa por ChatGPT vale:" + modaGPT());

    }

}
