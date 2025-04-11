package Tarea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraIVATest {
    @Test
    void testCalcularPrecioConIVA() {
        CalculadoraIVA c = new CalculadoraIVA();
        double precio = c.calcularPrecioConIVA(100, 21);
        Assertions.assertEquals(precio, 121.0, 0.1);
    }
    @Test
    void testCalcularPrecioConIVAErroneo() {
        CalculadoraIVA c = new CalculadoraIVA();
        double precio = c.calcularPrecioConIVA(100, 21);
        Assertions.assertNotEquals(precio, 100.0, 0.1);
    }
}
