package Inmoviliaria;

public class CasaUrbana extends Casa {

    CasaUrbana(int idInmo, int area, String direccion, int nHab, int nBan, int nPis) {
        super(idInmo, area, direccion, nHab, nBan, nPis);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + "\nCasaUrbana []";
    }
}
