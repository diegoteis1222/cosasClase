public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExp;

    public Masajista(int id, String nombre, String apellidos, int edad, String titu, int anios) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titu;
        this.aniosExp = anios;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asistencia (masajista)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Observa concienzudamente (masajista)");
    }

    public void darMasaje() {
        System.out.println("Da un masaje");
    }

    @Override
    public String toString() {
        return "Masajista [titulacion=" + titulacion + ", aniosExp=" + aniosExp + ", toString()=" + super.toString()
                + "]";
    }
}
