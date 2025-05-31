public class Local extends inmueble implements Impuesto {

    protected Tipo tipoLocal;

    public Local(int identificarInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificarInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public double calcularImpuesto() {
        return precioVenta * 0.06;
    }

    @Override
    public String toString() {
        return "Local [tipoLocal=" + tipoLocal + ", calcularImpuesto()=" + calcularImpuesto() + "]";
    }

}