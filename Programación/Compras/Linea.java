public class Linea {

    private int identificador;
    private int cantidad;
    private Producto producto;

    public Linea(int identificador, int cantidad, Producto producto) {
        this.identificador = identificador;
        this.cantidad = cantidad;
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
        return "Linea [identificador=" + identificador + ", cantidad=" + cantidad + ", producto=" + producto.getNombre()
                + "]";
    }

    public double calcularPrecioLinea() {
        return this.cantidad * this.producto.getPrecio();
    }

}
