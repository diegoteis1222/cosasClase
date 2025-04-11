package Tarea;

class SumaPares {
    // mejorados los nombres
    public static int SumaP(int[] numeros) {

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                suma += numeros[i];
            }
        }
        return suma;
    }
}

class ContarCaracter {
    // mejorados los nombres y cammbiado Letrabuscar a char
    public static int CantidadCaracteres(String palabra, char letraBuscar) {

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letraBuscar) {
                contador += 1;
            }
        }
        return contador;
    }
}

class Calculadora {
    // entiendo que tengo que convertirlo en un switch, no veo forma de usar herencia
    public static int operar(int a, int b, String operacion) {
        switch (operacion) {
            case "sumar":
                return a + b;
            case "restar":
                return a - b;
            case "multiplicar":
                return a * b;
            case "dividir":
                return a / b;
            default:
                return 0;
        }

    }
}

class Factorial {
    // Mejorados los nombres, solo se me ocurrio acumula para la r
    public static int factorial(int numero) {
        int acumula = 1;
        for (int i = 1; i <= numero; i++) {
            acumula = acumula * i;
        }
        return acumula;
    }
}