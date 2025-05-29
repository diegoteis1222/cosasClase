public class Producto {

    private int identificador;
    private String nombre;
    private String descipcion;
    private double precio;

    public Producto(int identificador, String nombre, String descipcion, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", descipcion=" + descipcion
                + ", precio=" + precio + "]";
    }

}