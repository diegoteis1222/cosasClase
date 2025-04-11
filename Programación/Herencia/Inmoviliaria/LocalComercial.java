package Inmoviliaria;

public class LocalComercial extends Local {

    protected String centroComercial;

    LocalComercial(int idInmo, int area, String direccion, tipo tipolocal, String centro) {
        super(idInmo, area, direccion, tipolocal);
        // TODO Auto-generated constructor stub
        this.centroComercial = centro;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocalComercial [centroComercial=" + centroComercial + "]";
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("Local comercial");
    }
    

}
