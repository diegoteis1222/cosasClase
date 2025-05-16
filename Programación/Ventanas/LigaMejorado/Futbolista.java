public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dor, String demar) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dor;
        this.demarcacion = demar;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento (futbolista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega un partido (futbolista)");
    }

    public void entrevista() {
        System.out.println("Da una entrevista");
    }

    @Override
    public String toString() {
        return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", toString()=" + super.toString()
                + "]";
    }

    @Override
    public double primaPorGanar() {
        double aux = super.primaPorGanar();	
        return Math.pow(aux, 2) + 500d;
    }

}
