package Inmoviliaria;

public class Vivienda extends Inmueble {

    protected int nHabitaciones;
    protected int nBanos;

    Vivienda(int idInmo, int area, String direccion, int nHab, int nBan) {
        super(idInmo, area, direccion);
        this.nHabitaciones = nHab;
        this.nBanos = nBan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVivienda [nHabitaciones=" + nHabitaciones + ", nBanos=" + nBanos + "]";
    }

    
}
