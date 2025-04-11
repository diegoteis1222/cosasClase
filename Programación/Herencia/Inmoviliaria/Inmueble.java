package Inmoviliaria;

import java.util.HashMap;

public class Inmueble {

    protected HashMap<String, Double> ValorUnitario;

    public void pueblaValores() {

        ValorUnitario = new HashMap<String, Double>();

        this.ValorUnitario.put("Casa rural", 500000d);
        this.ValorUnitario.put("Casa en conjunto cerrado", 2500000d);
        this.ValorUnitario.put("Casa independiente", 3000000d);
        this.ValorUnitario.put("Apartaestudio", 1500000d);
        this.ValorUnitario.put("Apartamento familiar", 2000000d);
        this.ValorUnitario.put("Local comercial", 3000000d);
        this.ValorUnitario.put("Oficina", 3500000d);
        this.ValorUnitario.put("zero", 0d);
    }
    
    protected int idInmo;
    protected int area;
    protected String direccion;
    protected double precioVenta;



    Inmueble(int idInmo, int area, String direccion) {
        this.idInmo = idInmo;
        this.area = area;
        this.direccion = direccion;
        this.precioVenta = 0d;
    }

    void ValorPrecioVenta(String NombreInmueble) {
        this.precioVenta = area * ValorUnitario.get(NombreInmueble);
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("zero");
    }

    @Override
    public String toString() {
        return "Inmueble [idInmo=" + idInmo + ", area=" + area + ", direccion=" + direccion + ", precioVenta="
                + precioVenta + "]";
    }

}
