public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
        calcularTiempoParcial(); // que se sume al tiempo
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nVelocista [potenciaPromedio=" + potenciaPromedio + ", velocidadPromedio="
                + velocidadPromedio + "]";
    }

    protected String imprimirTipo() {
        return "Es un velocista";
    }

    @Override
    void generarTiempo() {
        super.generarTiempo();
        double tiempo = this.getTiempoAcumulado();
        tiempo = tiempo - this.potenciaPromedio * 2 - this.velocidadPromedio * 0.25;
        setTiempoAcumulado(tiempo);
    }

    @Override
    public void calcularTiempoParcial() {
        super.calcularTiempoParcial();

        double tiempo = this.getTiempoAcumulado();
        tiempo += 5 * velocidadPromedio;
        tiempo -= 2 * potenciaPromedio;

        setTiempoAcumulado(tiempo);

    }

}
