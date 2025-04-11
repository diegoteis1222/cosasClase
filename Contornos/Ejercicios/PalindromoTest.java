package Tarea;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromoTest {
    @Test
    void testEsPalindromo() {
        Palindromo p = new Palindromo();
        boolean prueba = p.esPalindromo("reconocer");
        assertTrue(prueba);
    }
    @Test
    void testEsPalindromoFalse() {
        Palindromo p = new Palindromo();
        boolean prueba = p.esPalindromo("paco");
        assertFalse(prueba);
    }
    @Test
    void testEsPalindromoNull() {
        Palindromo p = new Palindromo();
        boolean prueba = p.esPalindromo(null);
        assertFalse(prueba);
    }
}
