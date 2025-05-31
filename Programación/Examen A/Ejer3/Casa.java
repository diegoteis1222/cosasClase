public class Casa extends InmuebleVivienda implements Impuesto {

    protected int numeroPisos;

    public Casa(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public double calcularImpuesto() {
        double valorImpuesto = precioVenta * 0.02;
        double extra = 700 * numeroHabitaciones + 300 * numeroBaños;
        return valorImpuesto + extra;
    }

    @Override
    public String toString() {
        return super.toString() + "Casa [numeroPisos=" + numeroPisos + ", calcularImpuesto()=" + calcularImpuesto()
                + "]";
    }

}