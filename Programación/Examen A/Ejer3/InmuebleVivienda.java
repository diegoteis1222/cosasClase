public class InmuebleVivienda extends inmueble {

    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones,
            int numeroBaños) {
        super(identificarInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    @Override
    public String toString() {
        return super.toString() + "InmuebleVivienda [numeroHabitantes=" + numeroHabitaciones + ", numeroBaños="
                + numeroBaños + "]";
    }

}
