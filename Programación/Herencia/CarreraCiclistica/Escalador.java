public class Escalador extends Ciclista {
    // Atributo que define la acelaración promedio de un escalador
    private double aceleraciónPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;

    public Escalador(int identificador, String nombre, double aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected double getAceleraciónPromedio() {
        return aceleraciónPromedio;
    }

    protected void setAceleraciónPromedio(double aceleraciónPromedio) {
        this.aceleraciónPromedio = aceleraciónPromedio;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String toString() {
        return "\n"+super.toString() + "\nEscalador [aceleraciónPromedio=" + aceleraciónPromedio + ", gradoRampa="
                + gradoRampa + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     * 
     * @return Un valor String con el texto “Es un escalador”
     */
    protected String imprimirTipo() {
        return "Es un escalador";
    }

    @Override
    void generarTiempo() {
        double tiempo = 55.0 + Math.random()*20;
        tiempo = tiempo - this.aceleraciónPromedio*1.2 - this.gradoRampa*0.35;
        setTiempoAcumulado(tiempo);
    }
}
