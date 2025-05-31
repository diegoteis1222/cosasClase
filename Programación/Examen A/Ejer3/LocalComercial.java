public class LocalComercial extends Local {

    protected double ValorArea;
    protected String centroComercial;

    public LocalComercial(int identificarInmobiliario, int area, String direccion, Tipo tipoLocal, double valorArea,
            String centroComercial) {
        super(identificarInmobiliario, area, direccion, tipoLocal);
        ValorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return super.toString() + "LocalComercial [ValorArea=" + ValorArea + ", centroComercial=" + centroComercial + "]";
    }

}
