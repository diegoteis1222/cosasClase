public class CasaIndependiente extends CasaUrbana {

    protected double ValorArea;

    public CasaIndependiente(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones,
            int numeroBaños, int numeroPisos, double valorArea) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        ValorArea = valorArea;
    }

    @Override
    public String toString() {
        return super.toString() + "CasaIndependiente [ValorArea=" + ValorArea + "]";
    }
}