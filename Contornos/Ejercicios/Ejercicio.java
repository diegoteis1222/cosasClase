/**
* Copyright (c) 2021, Angel. All rights reserved.
* Use is subject to license terms.
*/
package Contornos;

/**
 * Ejercicio para hacer calculos varios
 * 
 * @author Angel
 * @version 1.0
 */
public class Ejercicio {

    /**
     * @param a
     * @param b
     * @return
     */
    public static int sumaDeCuadrados(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < a; i++) {
            resultado += i * i;
        }
        for (int i = 0; i < b; i++) {
            resultado += i * i;
        }
        return resultado;
    }

    /**
     * @param numeros
     */
    public static void getNumerosImpares(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

    /**
     * @param numeros
     * @return
     */
    public static int calculaMedia(float[] numeros) {
        float suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return (int) suma / numeros.length;
    }
    public static void main(String[] args) {
        System.out.println(sumaDeCuadrados(2, 5));


    }
}
