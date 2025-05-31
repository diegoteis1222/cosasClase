public class CasaConjuntoCerrado extends CasaUrbana {

    protected double ValorArea;
    protected double valorAdministracion;
    protected double tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones,
            int numeroBaños, int numeroPisos, double valorArea, double valorAdministracion, double tienePiscina,
            boolean tieneCamposDeportivos) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        ValorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();
        if (tienePiscina == 0) {
            impuesto -= 6000;
        }

        if (!tieneCamposDeportivos) {
            impuesto -= 3000;
        }

        return impuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "CasaConjuntoCerrado [ValorArea=" + ValorArea + ", valorAdministracion="
                + valorAdministracion
                + ", tienePiscina=" + tienePiscina + ", tieneCamposDeportivos=" + tieneCamposDeportivos
                + ", calcularImpuesto()=" + calcularImpuesto() + "]";
    }

}
