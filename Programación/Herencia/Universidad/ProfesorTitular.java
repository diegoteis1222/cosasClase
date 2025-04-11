public class ProfesorTitular extends Profesor {

    private String asignatura;

    public ProfesorTitular(String nombre, String direccion, String departamento, String categoria, String asignatura) {
        super(nombre, direccion, departamento, categoria);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    

    @Override
    public String toString() {
        return "ProfesorTitular [asignatura=" + asignatura + ", toString()=" + super.toString() + "]";
    }

    @Override
    public String IrClase() {
        return super.IrClase() + " de " + this.getCategoria() + " en el " + this.getDepartamento() + "\n"
                + " para la asignatura " + this.getAsignatura();
    }

}
