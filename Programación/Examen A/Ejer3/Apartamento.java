public class Apartamento extends InmuebleVivienda implements Impuesto {

    public Apartamento(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones,
            int numeroBaños) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calcularImpuesto() {
        double valorImpuesto = precioVenta * 0.04;
        double extra = 700 * numeroHabitaciones + 300 * numeroBaños;
        return valorImpuesto + extra;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
