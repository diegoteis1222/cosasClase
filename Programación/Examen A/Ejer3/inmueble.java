import java.io.Serializable;

public class inmueble implements Serializable {

    protected int identificarInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public inmueble(int identificarInmobiliario, int area, String direccion) {
        this.identificarInmobiliario = identificarInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularPrecioventa(double ValorArea) {
        return ValorArea * area;
    }

    @Override
    public String toString() {
        return "inmueble [identificarInmobiliario=" + identificarInmobiliario + ", area=" + area + ", direccion="
                + direccion + ", precioVenta=" + precioVenta + "]";
    }

}