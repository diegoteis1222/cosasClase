package Inmoviliaria;

public class Apartamento extends Vivienda{

    Apartamento(int idInmo, int area, String direccion, int nHab, int nBan) {
        super(idInmo, area, direccion, nHab, nBan);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + "\nApartamento []";
    }
    
}
