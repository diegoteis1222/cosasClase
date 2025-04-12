package Inmoviliaria;

public class CasaCerrado extends CasaUrbana{

    protected int valorAdmin;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    CasaCerrado(int idInmo, int area, String direccion, int nHab, int nBan, int nPis, int admin, boolean piscina, boolean campos) {
        super(idInmo, area, direccion, nHab, nBan, nPis);
        //TODO Auto-generated constructor stub
        this.valorAdmin = admin;
        this.tienePiscina = piscina;
        this.tieneCamposDeportivos = campos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCasaCerrado [valorAdmin=" + valorAdmin + ", tienePiscina=" + tienePiscina + ", tieneCamposDeportivos="
                + tieneCamposDeportivos + "]";
    }

    void calcularPrecioVenta () {
        this.precioVenta = area * ValorUnitario.get("Casa en conjunto cerrado");
    }
    
}