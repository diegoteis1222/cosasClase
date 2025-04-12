package Inmoviliaria;

public class Casa extends Vivienda{

    protected int nPisos;

    Casa(int idInmo, int area, String direccion, int nHab, int nBan,int nPis) {
        super(idInmo, area, direccion, nHab, nBan);
        this.nPisos = nPis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCasa [nPisos=" + nPisos + "]";
    }

    

}
