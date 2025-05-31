import java.util.Random;

public class LineaPedido {

    Random r = new Random();
    private int identificador;
    private int cantidad;
    private Producto producto;

    public LineaPedido(int identificador, Producto producto) {
        this.identificador = identificador;
        this.cantidad = r.nextInt(6) + 1;
        this.producto = producto;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "LineaPedido [identificador=" + identificador + ", cantidad=" + cantidad + ", producto=" + producto
                + "]";
    }

    public int calcularSubtotalLineaPedido() {
        return cantidad * producto.getPrecio();
    }
}
