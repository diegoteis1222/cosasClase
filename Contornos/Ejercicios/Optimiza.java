package Tarea;

class Duplicados {
    public static boolean hayDuplicados(int[] numeros) {
        // creado cantidad para no calcular tantas veces numeros.lenght
        int cantidad = numeros.length;

        for (int i = 0; i < cantidad; i++) {
            for (int j = i + 1; j < cantidad; j++) {
                if (numeros[i] == numeros[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

class DivisionPorDos {
    public static int dividirPorDos(int numero) {
        return numero >> 1; // usado byteshifting o como se escriba
    }
}

class Concatenador {
    public static String unir(String[] palabras) {

        String resultado = "";
        // creado cantidad para no calcular tantas veces numeros.lenght
        int cantidad = palabras.length;

        for (int i = 0; i < cantidad; i++) {
            resultado += palabras[i];
        }

        return resultado;
    }
}
