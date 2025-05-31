public class Apartaestudio extends Apartamento {

    private double ValorArea;

    public Apartaestudio(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones,
            int numeroBaños, double valorArea) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        ValorArea = valorArea;
    }

    @Override
    public String toString() {
        return super.toString() + "Apartaestudio [ValorArea=" + ValorArea + "]";
    }

}