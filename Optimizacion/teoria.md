[Ir a ejemplos](#-Ejemplos-de-complejidad)

## Complejidad algorítmica

![Complejidad](https://europeanvalley.es/wp-content/uploads/2022/12/51957970066_dd5fd167f6_c.jpeg)

La complejidad algorítmica es el estudio de cómo el rendimiento de un algoritmo cambia en función del tamaño de la entrada. Nos ayuda a entender cuán eficiente es un algoritmo en términos de tiempo y espacio.

- Una unica operacion (multiplicacion, suma, resta o division) es O(1)
- Un bucle es minimo complejidad O(n)
- Dos bucles anidados es O(n2)

### Comparación de Complejidades

| Notación      | Ejemplo                                | Descripción                                       |
| ------------- | -------------------------------------- | ------------------------------------------------- |
| O(1)          | Acceder a un índice de un array arr[i] | Tiempo constante                                  |
| O(log n)      | Búsqueda binaria                       | Se reduce el tamaño a la mitad en cada paso       |
| O(n)          | Recorrer un array                      | Tiempo lineal                                     |
| O(n \* log n) |                                        | Tiempo cuasi-lineal                               |
| O(n²)         | Bucle anidado                          | Tiempo cuadrático                                 |
| O(n^a)        | Ej O(n^3) = cúbica                     | Tiempo polinomial a>=2                            |
| O(2ⁿ)         | Fibonacci recursivo                    | Tiempo exponencial (explosion combinatoria)       |
| O(n!)         | Fuerza bruta                           | Tiempo factorial (explosion combinatoria extrema) |

## Complejidad Temporal

    Se refiere a cuánto tiempo tarda un algoritmo en ejecutarse en función de la cantidad de datos.
    Se mide en función del tamaño de la entrada n.

## Complejidad Espacial

    Se refiere a cuánta memoria utiliza un algoritmo.
    Un algoritmo que almacena todos los datos en un array consume más memoria que uno que usa solo unas pocas variables.

## Notacion Asintótica

    Las notaciones asintóticas nos ayudan a describir cómo crece el tiempo de ejecución o el uso de memoria de un algoritmo a medida que aumenta el tamaño de la entrada (n).

    - O(n) Busqueda lineal → Límite superior (el peor caso).
    - Ω(n) notación Ω (Omega) → Límite inferior (el mejor caso).
    - Θ(n) notación Θ (Theta) → Caso ajustado (cuando el peor y el mejor caso son iguales).
  

# Ejemplos de complejidad

## O(1) - Complejidad Constante : Acceder a un índice en un array

```java 
public class ConstantTime {

    public static int getElement(int[] arr, int index) {

        return arr[index];

    }

}
```

## O(log n) - Complejidad Logarítmica : Búsqueda Binaria

```java 
public class BinarySearch {

    public static boolean search(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return true;

            if (arr[mid] < target) left = mid + 1;

            else right = mid - 1;

        }

        return false;

    }

}
}
```

## O(n) - Complejidad Lineal : Recorrer un array

```java 
public class LinearTime {

    public static void printArray(int[] arr) {

        for (int num : arr) {

            System.out.println(num);

        }

    }

}
```

## O(n²) - Complejidad Cuadrática : Comparar todos los pares de un array (bucle anidado)

```java 
public class QuadraticTime {

    public static void printPairs(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.println(arr[i] + ", " + arr[j]);

            }

        }

    }

}
```