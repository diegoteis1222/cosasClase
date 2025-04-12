package Inmoviliaria;

public class CasaRural extends Casa{

    // protected static double valorArea = 1500000;
    protected int distanciaCap;
    protected int altitud;

    CasaRural(int idInmo, int area, String direccion, int nHab, int nBan, int nPis, int dis, int alt) {
        super(idInmo, area, direccion, nHab, nBan, nPis);
        //TODO Auto-generated constructor stub
        this.distanciaCap = dis;
        this.altitud = alt;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCasaRural [distanciaCap=" + distanciaCap + ", altitud=" + altitud + "]";
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("Casa rural"); //Tiene que buscar la casa rural
    }
    
}
