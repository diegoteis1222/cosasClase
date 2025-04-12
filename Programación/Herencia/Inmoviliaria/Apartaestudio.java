package Inmoviliaria;

public class Apartaestudio extends Apartamento{



    Apartaestudio(int idInmo, int area, String direccion, int nHab, int nBan) {
        super(idInmo, area, direccion, nHab, nBan);
        //TODO Auto-generated constructor stub
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("Apartaestudio");
    }

    
}
