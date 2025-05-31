import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<inmueble> lista = new ArrayList<>();

        // 1. Casa rural
        CasaRural casaRural = new CasaRural(1, 100, "Vereda La Esperanza", 3, 2, 1, 1525, 10, 0);
        casaRural.precioVenta = casaRural.calcularPrecioventa(1525);
        lista.add(casaRural);

        // 2. Casa en conjunto cerrado
        CasaConjuntoCerrado casaCC = new CasaConjuntoCerrado(2, 120, "Conjunto El Sol", 4, 3, 2, 2225, 1, 0, true);
        casaCC.precioVenta = casaCC.calcularPrecioventa(2225);
        lista.add(casaCC);

        // 3. Casa independiente
        CasaIndependiente casaInd = new CasaIndependiente(3, 110, "Cra 45 #23-60", 3, 2, 2, 3400);
        casaInd.precioVenta = casaInd.calcularPrecioventa(3400);
        lista.add(casaInd);

        // 4. Apartaestudio
        Apartaestudio aparta = new Apartaestudio(4, 40, "Calle 9 #5-20", 1, 1, 1875);
        aparta.precioVenta = aparta.calcularPrecioventa(1875);
        lista.add(aparta);

        // 5. Apartamento familiar
        ApartamentoFamiliar aptFam = new ApartamentoFamiliar(5, 85, "Av. Siempre Viva 742", 0, 0, 0, 0);
        aptFam.precioVenta = aptFam.calcularPrecioventa(2500);
        lista.add(aptFam);

        // 6. Local comercial
        LocalComercial localCom = new LocalComercial(6, 60, "Centro Comercial Gran Plaza", Tipo.CALLE, 3575,
                "Gran Plaza");
        localCom.precioVenta = localCom.calcularPrecioventa(3575);
        lista.add(localCom);

        // 7. Oficina
        Oficina oficina = new Oficina(7, 55, "Edificio Torre Ejecutiva", Tipo.INTERNO, 3975, false);
        oficina.precioVenta = oficina.calcularPrecioventa(3975);
        lista.add(oficina);

        // Imprimir información y precio de venta
        for (inmueble inmueble : lista) {
            System.out.println(inmueble.toString());
            System.out.println("Precio de venta: $" + inmueble.precioVenta);
            System.out.println("---------------");
        }

        double totalInmueblesVendidos = 0;
        double totalPrecioArea = 0;
        double totalImpuestos = 0;

        for (inmueble inmueble : lista) {
            totalInmueblesVendidos += inmueble.precioVenta;
            totalPrecioArea += inmueble.area;

            if (inmueble instanceof Impuesto) {
                double impuestosCosas = (((Impuesto) inmueble).calcularImpuesto());
                totalImpuestos += impuestosCosas;
            }
        }

        System.out.println("Total del valor de todos los inmuebles: " + totalInmueblesVendidos);
        System.out.println("Promedeio del valor por metro cuadrado: " + (totalInmueblesVendidos / totalPrecioArea));
        System.out.println("El total de impuestos es: " + totalImpuestos);

        GuardarInmuebles.guardarEnArchivo(lista, "PutoTodo.dat");
    }
}
