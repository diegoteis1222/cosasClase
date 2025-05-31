public class Oficina extends Local {

    protected double ValorArea;
    protected boolean esGobierno;

    public Oficina(int identificarInmobiliario, int area, String direccion, Tipo tipoLocal, double valorArea,
            boolean esGobierno) {
        super(identificarInmobiliario, area, direccion, tipoLocal);
        ValorArea = valorArea;
        this.esGobierno = esGobierno;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();

        if (!esGobierno) {
            impuesto -= 3000;
        }
        return impuesto;
    }

    @Override
    public String toString() {
        return "Oficina [ValorArea=" + ValorArea + ", esGobierno=" + esGobierno + ", calcularImpuesto()="
                + calcularImpuesto() + "]";
    }

}
