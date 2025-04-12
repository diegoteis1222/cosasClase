package Inmoviliaria;

public class Oficina extends Local{

protected boolean esOficial;

    Oficina(int idInmo, int area, String direccion, tipo tipolocal, boolean oficial) {
        super(idInmo, area, direccion, tipolocal);
        //TODO Auto-generated constructor stub
        this.esOficial = oficial;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nOficina [esOficial=" + esOficial + "]";
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("Oficina");
    }
    
}
