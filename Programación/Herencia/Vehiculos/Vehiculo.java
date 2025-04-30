public abstract class Vehiculo {

    int VelocidadActual;
    int VelocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        VelocidadActual = velocidadActual;
        VelocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo [VelocidadActual=" + VelocidadActual + ", VelocidadMaxima=" + VelocidadMaxima + "]";
    }

    abstract void acelerar(int velocidad);

    abstract void frenar(int velocidad);
}