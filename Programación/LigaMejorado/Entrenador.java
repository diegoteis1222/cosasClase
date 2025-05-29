public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int fed) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = fed;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenar() {
        System.out.println("Dirige un entrenamiento (entrenador)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirige un partido (entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar un entrenamiento");
    }

    public void prepararTactica() {
        System.out.println("Prepara la tactica del partido");
    }

    @Override
    public double primaPorGanar() {
        double calculoEnPadre = super.primaPorGanar();
        return calculoEnPadre * 2.45 + 3000d;
    }

    @Override
    public String toString() {
        return "Entrenador [idFederacion=" + idFederacion + ", toString()=" + super.toString() + "]";
    }
}
