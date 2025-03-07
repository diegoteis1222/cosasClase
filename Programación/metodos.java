package GitArchivos.Programación;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class metodos {

    // Inversor de numeros
    public static int inversor(int n) {

        // Variables
        int mov = 0;

        while (n > 0) {
            int num = n % 10; // Saca el resto que es el numero a usar
            mov = mov * 10 + num; // Mueve a la izquierda el numero y le suma el resto
            n = n / 10; // Elimina el primer numero por la izquierda
        }
        return mov;
    } // Fin metodo

    // Conversor de decimal a binario
    public static int MBinario(int n) {

        // Variables
        int r;
        int bin = 0; // almacen
        int mov = 1; // Movimiento

        // Inicio bucle
        while (n > 0) {

            r = n % 2; // Saca el 0 o 1
            bin += r * mov; // Agrega el resto al número final
            mov *= 10; // Mueve los numeros uno a la derecha al multiplicarlo por 10

            // Testeo: System.out.println("resto: " + r);

            n = n / 2; // Divide el numero
        }
        return bin;
    } // Fin metodo

    // Comprobador de numeros primos
    public static boolean primo(int n) {

        // Variables
        boolean primo = true;
        int i = 2;

        // Inicio bucle
        while (i < n && primo) { // Si i es menor que n y que primo

            if (n % i == 0) { // Si el resto de n entre i es igual a 0
                primo = false; // Convierte primo a false
            }
            i++; // Le suma 1 a i
        }
        return primo;
    } // Fin metodo

    // Contador de digitos
    public static int ContadorD(int n) {

        // Variables
        int d = 0;

        // Inicio bucle
        do {
            n = n / 10; // elimina un numero por bucle
            d++; // suma un numero a d por bucle
        } while (n > 0); // se ejecuta hasta que n sea 0
        return d;
    }// Fin metodo

    // Obtener el factorial de un numero
    public static int factorialfor(int num) {

        // variables
        int fac = 1;

        // bucle
        for (int i = num; i >= 1; i--) { // i es igual a num, y si i es mayor o igual a 1 le resta uno a cada vuelta
            fac = fac * i; // para obtener el fac lo multiplica por i y lo guarda en fac en cada ronda

        } // Fin de bucle
        return fac;
    }// Fin metodo

    public static int factorialwhile(int num) {

        // variables
        int fac = 1;

        while (num > 1) { // mientras num sea mayor a 1 sigue
            fac = fac * num; // multiplica fac por el numero en cada vuelta
            num--; // resta uno a num en cada vuelta
        }
        return fac;
    }// Fin metodo

    public static int factorialrecursivo(int num) {

        if (num == 1)
            return 1;
        else
            return num * factorialrecursivo(num - 1);
        // esta mierda es jodida de explicar, no creo ser capaz
        // Mejor preguntar a pepe que lo explique otra vez o explicarlo en persona
    }// Fin metodo

    // Potencia de dos numero
    public static int potenciawhile(int base, int exp) {

        // Variables
        int res = 1, i = 0;

        // Bucle
        while (i < exp) { // mientras i sea menor que exp
            res *= base; // multiplica res por base y lo guarda en el propio res
            i++; // cada pasada suma 1 a i
        } // Fin bucle
        return res;

    }// Fin metodo

    public static int potenciafor(int base, int exp) {

        // Variables
        int res = 1;

        for (int i = 0; i < exp; i++) { // mientras que este sea menor que exp sigue, le suma 1 en cada ciclo
            res *= base; // Multiplica el resto por la base y lo guarda en res

        }

        return res;
    }// Fin metodo

    public static int potenciarecur(int base, int exp) {

        if (exp == 0)
            return 1;
        else
            return base * potenciarecur(base, exp - 1);

    }// Fin metodo

    // Maximo comun divisor
    public static int MCD(int a, int b) {

        int r = a % b; // Le da a R el resto de a entre b
        // Esto debe hacerse una vez para darle a r un valor

        while (r != 0) { // Mientras r no sea 0 se ejecuta

            // reasigna los valores
            a = b;
            b = r;

            // r es el resto de a entre b
            r = a % b;

        }
        return b;
    }// Fin metodo

    // Minimo comun multiplo
    public static int MCM(int a, int b) {

        int p = a * b; // p es la multiplicacion de ambos

        return p / MCD(a, b); // divide p entre el minumo comun multiplo (metodo de arriba)
    }// Fin metodo

    // Sumar los 100 primeros numeros optimizado
    public static int calcularsumaxnumerosoptimizado(int max) {
        return max * (max + 1) / 2;
    }// Fin metodo

    // Sumar los 100 primeros numeros sin optimizar
    public static int calcularsumaynumeros(int max) {
        int total = 0;
        for (int i = 0; i <= max; i++) {
            total += i;
        }
        return total;
    }// Fin metodo

    // Juntar dos numeros en uno solo
    // Uso de StringBuilder
    public static int juntaNum(int num1, int num2) {

        StringBuilder builder = new StringBuilder(String.valueOf(num1)); // Convierte num1 en texto
        String fusion = builder.append(num2).toString(); // crea un string y le da el valor del Stringbuilder
        // anterior mas el añadido de num2 que tambien convierte a texto
        return Integer.parseInt(fusion); // Devuelve el string convirtiendolo en Integer
    }// Fin metodo

    // Devuelve la palabra dada dandole la vuelva a partir de su ultima letra
    // Uso de StringBuilder, .reverse y .delete
    public static void normalYReverso(String palabra) {

        StringBuilder reverso = new StringBuilder(palabra); // convierte en stringbuilder la palabra

        reverso.reverse(); // le da la vuelta a la palabra
        reverso = reverso.delete(0, 1); // borra el primer caracter de la palabra
        // 0 es donde empieza a borrar y 1 donde termina de borrar

        System.out.println(palabra + reverso); // para usar esto llamar al metodo solo, sin un Syso

    }// Fin metodo

    // Calcular el número de mayúsculas en un String
    // Uso de toCharArray
    public static int calculaMayus(String cad) {
        int contar = 0;

        char[] letras = cad.toCharArray(); // convierte la cadena en un array de caracteres

        for (Character c : letras) { // por cada letra en la cadena
            if (c >= 65 && c <= 90) // En ASCII A--> 65 y Z --> 90
                contar++; // Aumenta 1 en cada pasada
        }
        return contar;
    }// Fin metodo

    // Cuenta cuantas veces una letra aparece en una cadena
    // Uso de charAt
    public static int cuentaLetra(String cad, char letra) {

        int contar = 0;

        for (int i = 0; i < cad.length(); i++) { // mientras i sea menor que la longitud de la cadena
            if (cad.charAt(i) == letra) { // si la letra en la posicion i de la cadena es igual a la letra que le
                                          // pasamos
                contar++; // suma 1 a contar
            }
        }
        return contar;
    }

    // Elimina los espacios de una cadena
    // Uso de replace
    public static void sinEspacios(String cad) {
        System.out.println("La cadena es: " + cad.replace(" ", ""));
    }

    // Da la vuelta a una cadena sin usar StringBuilder
    // Uso de charAt
    public static String invertirCadena(String cadena) {
        String reves = "";
        for (int k = cadena.length() - 1; k >= 0; k--) {
            reves += cadena.charAt(k);
        } // FIN FOR
        return reves;
    }// METODO invertirCadena

    // Da la vuelta a una cadena usando StringBuilder
    // Uso de StringBuilder, reverse y toString
    public static String invertirString(String cadena) {
        StringBuilder stringBuilder = new StringBuilder(cadena);
        return stringBuilder.reverse().toString();
        // .reverse() da la vuelta al string
        // .toString() lo convierte en string
    }

} // Fin del class

class arrays {

    // Necesario para algunos de los siguientes metodos
    static int datos[];

    // Implementación del algoritmo MergeSort
    public static float[] mergeSort(float[] arr) {
        if (arr.length <= 1) { // Si el array tiene un solo elemento devuelve el array ya que no hay nada que ordenar
            return arr;
        }

        int medio = arr.length / 2; // Calcula el punto medio del array
        float[] arr1 = new float[medio]; // Crea un array de la mitad del tamaño del array original
        float[] arr2 = new float[arr.length - medio]; // Otra forma de crear un array de la mitad del tamaño del array original

        for (int i = 0; i < medio; i++) { // Llena el primer array con la primera mitad del array original
            arr1[i] = arr[i];
        }
        for (int i = medio; i < arr.length; i++) { // Llena el segundo array con la segunda mitad del array original
            arr2[i - medio] = arr[i];
        }

        // recursividad
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);

        float[] resultado = new float[arr.length]; // Crea un array del tamaño del array original

        // Variables
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) { // Mientras i sea menor que la longitud del primer array y j sea menor que la longitud del segundo array
            if (arr1[i] < arr2[j]) { // Si el valor en la posición i del primer array es menor que el valor en la posición j del segundo array
                resultado[k++] = arr1[i++];  // El valor en la posición k del array resultado es el valor en la posición i del primer array y aumenta i y k en 1
            } else {
                resultado[k++] = arr2[j++]; // El valor en la posición k del array resultado es el valor en la posición j del segundo array y aumenta j y k en 1
            }
        }

        while (i < arr1.length) { // Mientras i sea menor que la longitud del primer array
            resultado[k++] = arr1[i++];  // El valor en la posición k del array resultado es el valor en la posición i del primer array y aumenta i y k en 1
        }
        while (j < arr2.length) { // Mientras j sea menor que la longitud del segundo array
            resultado[k++] = arr2[j++]; // El valor en la posición k del array resultado es el valor en la posición j del segundo array y aumenta j y k en 1
        }

        return resultado; // Devuelve el array ordenado
    }

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
                intercambiar(array, izquierda, derecha);
            }
        }

        // Colocar el pivote en su posición correcta
        if (derecha > inicio) {
            intercambiar(array, inicio, derecha);
        }

        // Llamadas recursivas para los subarrays izquierdo y derecho
        quickSort(array, inicio, derecha - 1); // Subarray izquierdo
        quickSort(array, derecha + 1, fin); // Subarray derecho
    }// Fin metodo

    // Implementacion del algoritmo Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Recorrer entero el array
        for (int i = 0; i < n - 1; i++) { // mientras i sea menor que la cantidad de datos del array - 1
            int minIdx = i; // le da a la variable el valor de i en cada pasada de bucle
            for (int j = i + 1; j < n; j++) { // mientras j(que es igual a i + 1) sea menor que n
                if (array[j] < array[minIdx]) { // Si la posicion del array j es menor que la pocion del array i
                    minIdx = j; // hace que la variable se vuelva el valor de j en esa pasada
                }
            }

            // Intercambiar el elemento más pequeño con el primer elemento de la sublista
            // desordenada
            int temp = array[minIdx]; // la variable es el valor j del bucle anterior
            array[minIdx] = array[i]; // intercambia la j con la i
            array[i] = temp; // vuelve la posicion i en una variable temporal
        }
    }// Fin metodo

    // Generar Array
    public static void generaArray(int posiciones) {
        datos = new int[posiciones]; // ontener el numero de datos que tendrá el array
        Random random = new Random();

        for (int i = 0; i < datos.length; i++) { // mientras i sea menor que la cantidad de datos en el array
            datos[i] = random.nextInt(10); // se da dato al azar hasta maximo de 10
        } // Fin for i
    }// Fin metodo

    // Mover de primero a ultimo en Array
    public static void primeroAultimo() {
        int primero = datos[0]; // le da a la variable el valor del primer elemento del array

        for (int i = 0; i < datos.length - 1; i++) { // mientras i sea menor que el largo del array menos 1
            datos[i] = datos[i + 1]; // le da al valor de datos en posicion y la de su posicion siguiente
            // esto mueve todos los valores del array a la izquierda
        }
        datos[datos.length - 1] = primero; // Coloca el primer elemento en la última posición
    }// Fin metodo

    // Mover de ultimo a primero en Array
    public static void ultimoAprimero() {
        int ultimo = datos[datos.length - 1]; // le da a la variable el valor del largo del array menos 1 (el ultimo
                                              // valor)

        for (int i = datos.length - 1; i > 0; i--) { // i es el largo del array - 1 y mientras i sea mayor que 0
                                                     // continua
            datos[i] = datos[i - 1]; // le da al valor del array en i el valor del array en i - 1
            // esto mueve todos los valores del array a la derecha
        }
        datos[0] = ultimo; // le da al primer valor del array el valor que guardamos en la variale ultimo
    }// Fin metodo

    // Mover el array entero a la derecha
    public static int[] rotaDerecha(int[] datos) {
        // Funciona exactamente igual que el ultimoAprimero pero con un return al final
        int ultimo = datos[datos.length - 1];
        for (int i = datos.length - 1; i > 0; i--) {
            datos[i] = datos[i - 1]; //
        }
        datos[0] = ultimo;
        return datos;
    }// Fin metodo

    // Intercambiar dos elementos en el array
    public static void intercambiar(int[] array, int i, int j) {
        int temp = array[i]; // le da a la variable temporal el valor del array en i
        array[i] = array[j]; // le da al valor del array en i el valor del array en j
        array[j] = temp; // le da al valor del array j el valor de temp que es el valor de i
        // esto intercambia el valor de i y j
    }// Fin metodo

    // Reorganiza arrays usando filtros con lambda
    public static int[] reorganizarParesImpares(int[] array) {

        int[] pares = Arrays.stream(array) // crea un array de pares y el .stream hace que se lea de forma secuencial
                .filter(num -> num % 2 == 0) // filtra los numeros añadiendolos si la resta de su division entre 2 es 0
                .toArray();

        int[] impares = Arrays.stream(array)
                .filter(num -> num % 2 != 0) // filtra los numeros añadiendolos si la resta de su division entre 2 no es
                                             // 0
                .toArray();

        int[] resultado = new int[array.length]; // crea un nuevo array del tamaño del array original
        System.arraycopy(pares, 0, resultado, 0, pares.length);
        // el primer lugar (pares) es donde se copia, despues la posicion que se copia
        // el tercer lugar (resaultado) es donde se pega, despues la posicion donde se
        // pega
        // lo ultimo es la cantidad de elementos a copiar
        System.arraycopy(impares, 0, resultado, pares.length, impares.length); // mismo que arriba pero con impares

        return resultado;
    }// Fin metodo

    // convierte numeros en palabras con un Map y .valueOf
    public static String convierteEnPalabras(int n) {

        // Mapa de las equivalencias
        Map<Character, String> equivale = new HashMap<>();

        // Mapa de equivalencias de los numeros a textos
        equivale.put('0', "cero");
        equivale.put('1', "uno");
        equivale.put('2', "dos");
        equivale.put('3', "tres");
        equivale.put('4', "cuatro");
        equivale.put('5', "cinco");
        equivale.put('6', "seis");
        equivale.put('7', "siete");
        equivale.put('8', "ocho");
        equivale.put('9', "nueve");

        // Tanto el mapa como las equivalencias deberian estar fuera del metodo

        String converso = ""; // crea el string
        String numero = String.valueOf(n); // String.valueOf convierte un numero en texto
        for (int i = 0; i < numero.length(); i++) { // mientras i sea mayor que lo largo que sea el numero que le
                                                    // pasamos
            converso += " " + equivale.get(numero.charAt(i));
            // equivale.get(numero.charAt(i)) busca la palabra que corresponde a ese dígito.
        }

        return converso;
    }// Fin metodo

    // Da la vuelta a aun array con un bucle for
    public static void voltearArray() {

        int[] pako = new int[10]; // esto deberia estar fuera del metodo

        int[] doble = new int[pako.length]; // crea un array con la longitud del original
        for (int j = doble.length - 1, k = 0; j >= 0; j--, k++) {
            // mientras la j (que es el largo del array - 1) sea mayor o igual a 0
            // en cada pasada sube el valor de k y baja el de j
            doble[k] = pako[j];
            // Vuelve el valor que hay en k en el array secundario el de j de array
            // principal
        }
        pako = doble;
    }// Fin metodo

    // Comprueba si un numero es capicua con StringBuilder y .reverse
    public static boolean capicua(int n) {

        StringBuilder builder = new StringBuilder(String.valueOf(n)); // Convierte n en un stringbuilder
        String inv = builder.reverse().toString(); // crea un string nuevo que es el anterior stringbuilder n pero dado
                                                   // la vuelta
        int rever = Integer.parseInt(inv); // convierte el string dado la vuelta en un int

        // Si el numero original es igual al numero dado la vuelta devuelve true
        if (n == rever) {
            return true;
        } else {
            return false;
        }
    } // Fin metodo

    // convierte un decimal a binaria con StringBuilder y .insert
    public static StringBuilder decimalAbinario(int num) {
        StringBuilder binario = new StringBuilder(); // crea un nuevo stringbuilder

        if (num == 0) {
            binario.append("0"); // si el numero es igual a 0 añade un 0
        } else {
            while (num > 0) { // mientras el numero sea mayor a 0
                binario.insert(0, num % 2); // insert añade al string caracteres
                // Offset es la posicion de izquierda a derecha, siendo 0 el primer caracter a
                // la izquierda
                // i es lo que quieres añadir que en este caso es el resto de dividir el numero
                // entre 2
                num /= 2;
                // en cada bucle num pasa a ser num divido entre dos
            }
        }
        return binario;
    } // Fin metodo

}
