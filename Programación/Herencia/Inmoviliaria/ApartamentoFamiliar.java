package Inmoviliaria;

public class ApartamentoFamiliar extends Apartamento {

    protected int valorAdmin;

    ApartamentoFamiliar(int idInmo, int area, String direccion, int nHab, int nBan, int valor) {
        super(idInmo, area, direccion, nHab, nBan);
        // TODO Auto-generated constructor stub
        this.valorAdmin = valor;

    }

    @Override
    public String toString() {
        return super.toString() + "\nApartamentoFamiliar [valorAdmin=" + valorAdmin + "]";
    }

    void calcularPrecioVenta() {
        this.precioVenta = area * ValorUnitario.get("Apartamento familiar");
    }
}
