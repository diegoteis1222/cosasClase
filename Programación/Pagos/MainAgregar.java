public class MainAgregar {
    public static void main(String[] args) {
        
        ListaEmpleados list = new ListaEmpleados();
        VentanaAgregarEmpleado ventanaA = new VentanaAgregarEmpleado(list);
        ventanaA.setVisible(true);

    }
}
