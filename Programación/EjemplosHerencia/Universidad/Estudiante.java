public class Estudiante extends Persona{
    
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    @Override
    public String toString() {
        return "Estudiante [carrera=" + carrera + ", semestre=" + semestre + ", toString()=" + super.toString() + "]";
    }

    public String IrClase() {
        return super.IrClase() + " y atiende";
    }
    
}
