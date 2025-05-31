import java.util.ArrayList;
import java.util.List;

public class Orden {

    private int identificador;
    private List<LineaPedido> pedidos;

    public Orden(int identificador) {
        this.identificador = identificador;
        this.pedidos = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void añadirItem(int identificador, Producto producto) {
        LineaPedido lp = new LineaPedido(identificador, producto);
        pedidos.add(lp);
    }

    public int calcularTotalOrden() {
        int total = 0;
        for (LineaPedido lp : pedidos) {
            total += lp.calcularSubtotalLineaPedido();
        }
        return total;
    }

    public double totalIva() {
        double totalSinIva = calcularTotalOrden();
        double iva = totalSinIva * 0.17;
        return totalSinIva + iva;
    }

    @Override
    public String toString() {
        return "Orden [identificador=" + identificador + ", pedidos=" + pedidos + "]";
    }

}