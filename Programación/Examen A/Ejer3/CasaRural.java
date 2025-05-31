public class CasaRural extends Casa {

    protected double ValorArea;
    protected int distanciaCabera;
    protected int altitud;

    public CasaRural(int identificarInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos, double valorArea, int distanciaCabera, int altitud) {
        super(identificarInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        ValorArea = valorArea;
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();
        return impuesto + (4 * altitud);
    }

    @Override
    public String toString() {
        return super.toString() + "CasaRural [ValorArea=" + ValorArea + ", distanciaCabera=" + distanciaCabera + ", altitud=" + altitud
                + ", calcularImpuesto()=" + calcularImpuesto() + "]";
    }

    

}
