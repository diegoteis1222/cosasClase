import java.util.ArrayList;

public class ListaEmpleados {

    private ArrayList<Empleado> lista;
    private double totalNomina;

    public double getTotalNomina() {
        return totalNomina;
    }

    public ListaEmpleados() {
        lista = new ArrayList<>();
        totalNomina = 0;
    }

    public void agregarEmpleado(Empleado a) {
        lista.add(a);
    }

    public double calcularTotalNomina() {
        totalNomina = 0;
        for (Empleado e : lista) {
            totalNomina += e.calcularNomina();
        }
        return totalNomina;
    }

    public String[][] obtenerMatriz() {
        String[][] datos = new String[lista.size()][3];
        for (int i = 0; i < lista.size(); i++) {
            Empleado e = lista.get(i);
            datos[i][0] = e.getNombre();
            datos[i][1] = e.getApellidos();
            datos[i][2] = Double.toString(e.calcularNomina());
            totalNomina += e.calcularNomina();
        }
        return datos;
    }

    public String convertirTexto() {
        StringBuilder texto = new StringBuilder();
        for (Empleado e : lista) {
            texto.append("Nombre = ").append(e.getNombre()).append("\n")
                    .append("Apellidos = ").append(e.getApellidos()).append("\n")
                    .append("Cargo = ").append(e.getCargo()).append("\n")
                    .append("Género = ").append(e.getGenero()).append("\n")
                    .append("Salario = $").append(e.getSalarioDia()).append("\n")
                    .append("Días trabajados = ").append(e.getDiasTrabajados()).append("\n")
                    .append("Otros ingresos = $").append(e.getOtrosIngresos()).append("\n")
                    .append("Pagos salud = $").append(e.getPagosSalud()).append("\n")
                    .append("Aportes pensiones = $").append(e.getAportePensiones()).append("\n")
                    .append("---------\n");
        }
        texto.append("Total nómina = $").append(String.format("%.2f", calcularTotalNomina()));
        return texto.toString();
    }
}
