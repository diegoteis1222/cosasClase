public class TestMain {

    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada", 10.25);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china", 30.55);
        Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva", 8.30);
        Producto producto4 = new Producto(4, "Cartulina", "Cartulina 60x40 cms", 6.75);

        Factura fact = new Factura(123);

        fact.añadirLinea(1, 5, producto1);
        fact.añadirLinea(2, 3, producto2);
        fact.añadirLinea(3, 2, producto3);
        fact.añadirLinea(4, 4, producto4);

        fact.imprimir();
    }
}
