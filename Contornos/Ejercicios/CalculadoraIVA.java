package Tarea;

public class CalculadoraIVA {
    //me cargue el static, si no pita al usar el new CalculadoraIVA
    public double calcularPrecioConIVA(double precioSinIVA, double porcentajeIVA) {
        return precioSinIVA + (precioSinIVA * porcentajeIVA / 100);
    }
}
