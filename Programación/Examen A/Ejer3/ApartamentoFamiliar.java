public class ApartamentoFamiliar extends Apartamento {

    protected double ValorArea;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones,
            int numeroBaños, double valorArea, int valorAdministracion) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        ValorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();
        return impuesto + 3 * valorAdministracion;
    }

    @Override
    public String toString() {
        return super.toString() + "ApartamentoFamiliar [ValorArea=" + ValorArea + ", valorAdministracion="
                + valorAdministracion
                + ", calcularImpuesto()=" + calcularImpuesto() + "]";
    }

}
