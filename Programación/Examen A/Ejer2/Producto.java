public class Producto {

    private int identificador;
    private String nombre;
    private String descipcion;
    private int precio;

    public Producto(int identificador, String nombre, String descipcion, int precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.precio = 100 + (int)(Math.random() * ((1000 - 100) + 1));
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", descipcion=" + descipcion
                + ", precio=" + precio + "]";
    }

}