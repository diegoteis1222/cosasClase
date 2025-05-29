import java.util.ArrayList;

public class Factura {

    private int identificador;
    private ArrayList<Linea> itemsFactura;

    public Factura(int identificador) {
        this.identificador = identificador;
        itemsFactura = new ArrayList<Linea>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double calcularTotalFactura() {
        double total = 0;

        for (int i = 0; i < itemsFactura.size(); i++) {
            Linea linea = (Linea) itemsFactura.get(i);
            total += linea.calcularPrecioLinea();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Factura [identificador=" + identificador + ", itemsFactura=" + itemsFactura
                + ", calcularTotalFactura()=" + calcularTotalFactura() + "]";
    }

    public void imprimir() {
        System.out.println("Factura [identificador=" + identificador + "]\n");
        for (Linea l : itemsFactura) {
            Linea linea = (Linea) l;
            System.out.println(identificador + ", cantidad = " + l.getCantidad() + ", nombre = "
                    + l.getProducto().getNombre() + ", p.unit = " + l.getProducto().getPrecio() + ", parcial = "
                    + l.calcularPrecioLinea() + "  ]");
        }
        
            System.out.println("-----------------------------------------------------");
        System.out.println("Total factura = " + calcularTotalFactura());
    }

    public void añadirLinea(int identificador, int cantidad, Producto producto) {
        Linea linea = new Linea(identificador, cantidad, producto);
        itemsFactura.add(linea);
    }
}
