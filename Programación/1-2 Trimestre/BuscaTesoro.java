

import java.util.Arrays;
import java.util.Scanner;

public class BuscaTesoro {

    // Valores para crear el minijuego
    static final int vacio = 0, mina = 1, tesoro = 2, intento = 3;

    public static void verSolucion(int[][] cuadrante) {
        for (int[] fila : cuadrante) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("-------------------------------------");
    }

    public static void pinta(int[][] cuadrante) {
        System.out.println("  1 2 3 4 \n  -------");
        for (int x = 0; x < 5; x++) {
            System.out.print((x + 1) + "|");
            for (int y = 0; y < 4; y++) {
                if (cuadrante[x][y] == intento) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] cuadrante = new int[5][4];

        // Inicializar la matriz con espacios vacíos
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 4; y++) {
                cuadrante[x][y] = vacio;
            }
        }

        // Colocar mina
        int minaX = (int) (Math.random() * 5);
        int minaY = (int) (Math.random() * 4);
        cuadrante[minaX][minaY] = mina;

        // Colocar tesoro
        int tesoroX, tesoroY;
        do {
            tesoroX = (int) (Math.random() * 5);
            tesoroY = (int) (Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = tesoro;

        // verSolucion(cuadrante); // Descomentar para ver la solución al inicio

        // Juego
        System.out.println("¡Busca el tesoro!");
        boolean salir = false;

        while (!salir) {
            pinta(cuadrante);

            System.out.print("Coordenada x (1-5): ");
            int f = Integer.parseInt(sc.nextLine()) - 1;

            System.out.print("Coordenada y (1-4): ");
            int g = Integer.parseInt(sc.nextLine()) - 1;

            if (f < 0 || f >= 5 || g < 0 || g >= 4) {
                System.out.println("Coordenadas fuera de rango. Intenta de nuevo.");
                continue;
            }

            switch (cuadrante[f][g]) {
                case vacio:
                    cuadrante[f][g] = intento;
                    break;
                case mina:
                    System.out.println("¡Moriste! Fin del juego.");
                    salir = true;
                    break;
                case tesoro:
                    System.out.println("¡Ganaste! Has encontrado el tesoro.");
                    salir = true;
                    break;
                case intento:
                    System.out.println("Ya intentaste en esa posición. Prueba en otra.");
                    break;
            }
        }

        pinta(cuadrante);
        verSolucion(cuadrante); // Muestra la solución al finalizar el juego

        sc.close();
    }
}
