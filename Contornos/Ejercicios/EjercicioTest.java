package Contornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EjercicioTest {
    @Test
    void testCalculaMedia() {

    }

    @Test
    void testGetNumerosImpares() {

    }

    @Test
    void testSumaDeCuadrados() {
        Ejercicio ejer = new Ejercicio();
        int r = ejer.sumaDeCuadrados(2, 3);
        assertEquals(6, r);
    }
}
