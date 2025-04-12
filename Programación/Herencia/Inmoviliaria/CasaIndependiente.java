package Inmoviliaria;

public class CasaIndependiente extends CasaUrbana {

    CasaIndependiente(int idInmo, int area, String direccion, int nHab, int nBan, int nPis) {
        super(idInmo, area, direccion, nHab, nBan, nPis);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + "\nCasaIndependiente []";
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("Casa independiente");
    }


}
