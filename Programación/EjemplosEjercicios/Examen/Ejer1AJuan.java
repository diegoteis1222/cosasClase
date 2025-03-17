package Examen;

import java.util.Arrays;

public class Ejer1AJuan {

	static int POS = 50;

	public static float[] mergeSort(float[] arr)

	{

		if (arr.length > 1) {

			int elementsInA1 = arr.length / 2;

			int elementsInA2 = arr.length - elementsInA1;

			float[] arr1 = new float[elementsInA1];
			float[] arr2 = new float[elementsInA2];

			for (int i = 0; i < elementsInA1; i++)
				arr1[i] = (int) arr[i];

			for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
				arr2[i - elementsInA1] = (int) arr[i];

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
		int cuentaNeg = 0;
		int cuentaPositivos = 0;
		float[] arr = new float[POS];

		// generar Array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (-100 + Math.random() * 202);
		}

		System.out.println(Arrays.toString(arr));

		mergeSort(arr);

		System.out.println(Arrays.toString(arr));

		// contamos negativos y postivos
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				cuentaPositivos++;
			} else {
				cuentaNeg++;
			}
		}

		float[] positivos = new float[cuentaPositivos];
		float[] negativos = new float[cuentaNeg];
		int pos = 0;
		int nega = 0;

		// metemos los negativos en el array de negativos y viceversa
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				positivos[pos] = arr[i];
				pos++;
			} else {
				negativos[nega] = arr[i];
				nega++;
			}

		}

		System.out.println("POSITIVOS");
		System.out.println(Arrays.toString(positivos));
		System.out.println("\nNEGATIVOS");
		System.out.println(Arrays.toString(negativos));

		int cuentaPares = 0;
		int cuentaImpares = 0;

		for (int j = 0; j < positivos.length; j++) {
			if (positivos[j] % 2 == 0) {
				cuentaPares++;
			} else {
				cuentaImpares++;
			}
		}

		float[] pares = new float[cuentaPares];
		float[] impares = new float[cuentaImpares];
		int par = 0;
		int impar = 0;

		// reparte
		for (int j = 0; j < positivos.length; j++) {
			if (positivos[j] % 2 == 0) {
				pares[par] = positivos[j];
				par++;
			} else {
				impares[impar] = positivos[j];
				impar++;
			}
		}

		System.out.println("\npares son: " + Arrays.toString(pares));
		System.out.println("\nimpares son: " + Arrays.toString(impares));
	}
}
