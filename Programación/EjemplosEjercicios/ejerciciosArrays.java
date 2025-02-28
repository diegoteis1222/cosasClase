package GitArchivos.Programación.EjemplosEjercicios;

import java.util.*;

// Genera un array de un numero randon de elementos entre 10 y 20, despues llena el array con numeros aleatorios entre 0 y 100
// Muestra el array, lo ordena, lo suma y calcula la media y por ultimo muestra el maximo y el minimo
class ejer2 {
    public static void main(String[] args) {

        Random rand = new Random();

        Integer tamaño = rand.nextInt(10, 20); // El tamaño es un numero random entre 10 y 20

        System.out.println("tamaño lista: " + tamaño); // Muestra el tamaño de la lista

        ArrayList<Integer> numeros = new ArrayList<>(); // Crea un arraylist

        for (int i = 0; i < tamaño; i++) { // mientras i sea menor que el tamaño de la lista
            Integer num = rand.nextInt(100); // num es un numero random entre 0 y 100
            System.out.println("generado: " + num); // muestra el numero generado
            numeros.add(num); // añade num a la lista
        }

        System.out.println(numeros);

        Collections.sort(numeros); // ordena la lista

        System.out.println(numeros);

        System.out.println("El maximo es: " + Collections.max(numeros)); // muestra el maximo de la lista
        System.out.println("El minimo es: " + Collections.min(numeros)); // muestra el minimo de la lista

        int suma = 0;
        int largo = numeros.size();

        for (Integer num : numeros) { // por cada numero en la lista
            suma += num; // Va sumando cada numero de la lista
        }

        System.out.println("suma: " + suma); // muestra la suma de todos los numeros de la lista
        System.out.println("largo: " + largo); // muestra el largo de la lista

        System.out.println("La media es: " + (float) suma / largo); // calcula y muestra la media

        IntSummaryStatistics stats = numeros.stream() // Esto es una especie de filtro
                .mapToInt(num -> num) // convierte los Integer a int
                .summaryStatistics(); // Sirve para las siguientes estadisticas

        // Al usar summaryStatistics() se puede usar todos los metodos siguientes
        System.out.println(stats);
        System.out.println("La suma es: " + stats.getSum());
        System.out.println("La media es: " + stats.getAverage());
        System.out.println("El maximo es: " + stats.getMax());
        System.out.println("El minimo es:  " + stats.getMin());

        int Suma = numeros.stream().mapToInt(num -> num).sum();
        System.out.println("Suma: " + Suma);

        double Promedio = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);

    }
}

// Pide 10 numeros y los guarda en un array
// Muestra el array y dice cual es el mayor y cual el menor
class ejer3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10]; // Crea un array de 10 posiciones
        int maximo = 0, minimo = 100; // Variables para calcular maximo y minimo

        // bucle para pedir y llenar array con numeros
        for (int i = 0; i < array.length; i++) {
            System.out.print("Dame un numero para la posicion " + i + " : ");
            array[i] = sc.nextInt();
        }

        // bucle para identificar el mayor y el menor
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) { // si el numero en la posicion i es mayor que el maximo
                maximo = array[i]; // convierte el numero(i) en el maximo
            }
            if (array[i] < minimo) { // si el numero en la posicion i es menor que el minimo
                minimo = array[i]; // convierte el numero(i) en el minimo
            }
        }

        // bucle para mostrar el array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maximo) { // si el numero en la posicion i es igual al maximo lo muestra con maximo al
                                      // lado
                System.out.println(array[i] + " maximo ");
            } else if (array[i] == minimo) { // si el numero en la posicion i es igual al minimo lo muestra con minimo
                                             // al lado
                System.out.println(array[i] + " minimo ");
            } else
                System.out.println(array[i]);
        }

        sc.close();

    }
}

// Genera un array de 20 numeros aleatorios entre 0 y 100
// Calcula el cuadrado y el cubo de cada numero
class ejer4 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vector = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // llena los arrays con numeros aleatorios y calcula el cuadrado y el cubo
        for (int i = 0; i < vector.length; i++) { //mientras i sea menor que el largo del vector
            vector[i] = 0 + random.nextInt(100); 
            cuadrado[i] = (int) Math.pow(vector[i], 2);
            cubo[i] = (int) Math.pow(cuadrado[i], 3);
        }

        // Muestra los resultados (esto fue generado por IA)
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        System.out.println("--------------------------------");

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%-10d %-10d %-10d%n", vector[i], cuadrado[i], cubo[i]);
        }
    }
}

// Genera un array de las posiciones que queramos
// Pasa el array por un metodo que o para el primero a ultima posicion o viceversa
class ejer6 {

    static int datos[];

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

    // Generar Array 
    public static void generaArray(int posiciones) {
        datos = new int[posiciones]; // ontener el numero de datos que tendrá el array
        Random random = new Random();

        for (int i = 0; i < datos.length; i++) { // mientras i sea menor que la cantidad de datos en el array
            datos[i] = random.nextInt(10); // se da dato al azar hasta maximo de 10
        } // Fin for i
    }// Fin metodo

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("De cuantas posiciones quieres el array?: ");
        int posicion = sc.nextInt();

        generaArray(posicion); // Genera el array con la cantidad de posiciones dada

        System.out.println("Que quieres hacer? 1 para ultimoAprimero, otro numero para primeroAultimo: ");
        int opcion = sc.nextInt();

        System.out.println("Sin modificar: " + Arrays.toString(datos));
        //Para escojer metodo
        if (opcion == 1)
            ultimoAprimero();
        else
            primeroAultimo();

        System.out.println("Ya Modificado: " + Arrays.toString(datos));

        sc.close();

    }
}

// En un array de 100 posiciones pide un numero a intercambiar por otro
class ejer7 {

    static int datos[];

    // Generar Array 
    public static void generaArray(int posiciones) {
        datos = new int[posiciones]; // ontener el numero de datos que tendrá el array
        Random random = new Random();

        for (int i = 0; i < datos.length; i++) { // mientras i sea menor que la cantidad de datos en el array
            datos[i] = random.nextInt(10); // se da dato al azar hasta maximo de 10
        } // Fin for i
    }// Fin metodo

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int posicion = 100;

        generaArray(posicion); //genera un array de 100 posiciones
        System.out.println(Arrays.toString(datos));

        //Pide dos numeros
        System.out.print("dime un entero para salir: ");
        int salir = sc.nextInt();
        System.out.print("dime un entero para entrar: ");
        int entrar = sc.nextInt();

        //Busca el numero salir y lo cambia por el numero entrar
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == salir) {
                datos[i] = entrar;
            }
        }

        //Muestra el array y escribe "Entrar" al lado del numero que se ha cambiado pero tambien lo muestra si es el mismo numero que entrar
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == entrar) {
                System.out.println(datos[i] + "\t" + " Entrar");
            } else {
                System.out.println(datos[i]);
            }
        }

        sc.close();
    }
}

// Crea un array de 80 posiciones con numeros aleatorios entre 0 y 9 y comprueba si son pares o impares
// Despues crea dos arrays, uno con los pares y otro con los impares
class ejer9 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] datos = new int[80]; // crea el array primario
        int pares = 0, impares = 0;
        int par = 0, impar = 0;

        // llena el array con numeros aleatorios
        for (int i = 0; i < datos.length; i++) { // mientras i sea menor que el largo del array
            datos[i] = random.nextInt(10); // le da un numero aleatorio datos en la posicion de i
        }

        // muestra en pantalla si es par o impar
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) { // si la division en la posicion i entre 2 es 0
                System.out.println(datos[i] + " es par");
                pares++; // Cuenta los pares
            } else {
                System.out.println(datos[i] + " es impar");
                impares++; // Cuenta los impares
            }
        }
        System.out.println("Hay: " + pares + " nurmeros pares");
        System.out.println("Hay: " + impares + " nurmeros impares");

        //crear los arrays de pares e impares
        int[] arrayPares = new int[pares]; 
        int[] arrayImpares = new int[impares];

        // añade los numeros pares e impares a su array 
        for (int i = 0; i < datos.length; i++) { // mientras i sea menor que el largo del array
            if (datos[i] % 2 == 0) { // si la division en la posicion i entre 2 es 0
                arrayPares[par] = datos[i]; // añade el numero en la posicion i al array de pares
                par++; // aumenta la posicion en la que se añadirá el siguiente numero
            } else {
                arrayImpares[impar] = datos[i]; // añade el numero en la posicion i al array de impares
                impar++; // aumenta la posicion en la que se añadirá el siguiente numero
            }
        }

        System.out.println(Arrays.toString(arrayPares));
        System.out.println(Arrays.toString(arrayImpares));
    }
}

    // TODO revisar este codigo, no termino de entender algunas cosas
    // Teniendo dos arrays, los une y despues los ordena poniendo los colores primero usando filters
class ejer14 {

    static String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
    static String[] otras = { "Pikachu", "Charmander", "Bulbasur", "Squirtle", "Evolucion", "Entrenador", "Pokebola",
            "peruanos", "canarios" };



    static String randomNumero() {
        int array = (int) (Math.random() * 2); 
        int pos = (int) (Math.random() * 9);
        if (array == 0)
            return otras[pos];
        else
            return colores[pos];
    }

    public static String[] coloresPrimero(String[] array) {
        Object[] cols = Arrays.stream(array)
                .filter(pal -> isIncolores(pal))
                .toArray();

        Object[] pals = Arrays.stream(array)
                .filter(pal -> !isIncolores(pal))
                .toArray();

        String[] res = new String[array.length];
        System.arraycopy(cols, 0, res, 0, cols.length);
        System.arraycopy(pals, 0, res, cols.length, pals.length);

        return res;
    }

    // 
    public static boolean isIncolores(String pal) {

        boolean paco = false; 

        // por cada item en colores
        for (String item : colores) {
            if (item.equals(pal)) { // si el item es igual a pal¿posicion de en el array?
                paco = true;
                break;
            }
        }
        return paco;
    }

    public static void main(String[] args) {

        String[] palabras = new String[8];

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = randomNumero();
        }

        System.out.println(Arrays.toString(palabras));

        System.out.println("Colores primero: ");
        System.out.println(Arrays.toString(coloresPrimero(palabras)));

    }
}


class ejer17 {

    public static final int POS = 10;

    
    public static int[] rotaDerecha(int[] datos) {

        int ultimo = datos[datos.length - 1];
        for (int i = datos.length - 1; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = ultimo;
        return datos;
    }

    public static int[] numeroRotacionesD(int[] datos, int rotacion) {
        for (int i = 0; i < rotacion; i++) {
            rotaDerecha(datos);
        }
        return datos;
    }

    public static int buscaIndiceArray(int[] datos, int numero) {
        int dev = -1;
        for (int i = 0; i < POS; i++) {
            if (datos[i] == numero) {
                dev = i;
                break;
            }
        }
        return dev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] datos = new int[POS]; // Crea un array de 10 posiciones

        // Llena el array con numeros aleatorios
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 1 + rand.nextInt(100);
        }

        System.out.println(Arrays.toString(datos));

        int indice = 0;

        // Pide un numero y lo busca en el array
        do {
            System.out.print("Dame un numero: ");
            int numero = Integer.parseInt(sc.nextLine());
            indice = buscaIndiceArray(datos, numero);
        } while (indice == -1);

        numeroRotacionesD(datos, POS - indice);

        System.out.println(Arrays.toString(datos));

        sc.close();
    }
}

class ejer19 {

    public static final int POS = 12;
    public static final int indice[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

    public static int[] InsertaMueveD(int[] datos, int numero, int indice) {

        for (int i = datos.length - 1; i > indice; i--) {
            datos[i] = datos[i - 1];
        }
        datos[indice] = numero;
        return datos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] datos = new int[POS];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = 1 + rand.nextInt(100);
        }

        System.out.println(Arrays.toString(datos));
        System.out.println(Arrays.toString(indice));

        System.out.println("Numero a insertar: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Indice a insertar: ");
        int indice = Integer.parseInt(sc.nextLine());

        int[] flop = InsertaMueveD(datos, numero, indice);
        System.out.println(Arrays.toString(flop));

    }
}
