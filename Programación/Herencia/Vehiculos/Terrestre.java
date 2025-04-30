public class Terrestre extends Vehiculo {

    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        // TODO Auto-generated constructor stub
    }

    @Override
    void acelerar(int velocidad) {
        int vel = this.VelocidadActual + velocidad;
        if (vel > VelocidadMaxima) {
            System.out.println("Supera la velocidad maxima");
        } else {
            this.VelocidadActual = vel;
        }
    }

    @Override
    void frenar(int velocidad) {
        int vel = this.VelocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            this.VelocidadActual = vel;
        }
    }

    public int CalcularRevoluciones(int fuerza, int radio) {
        return (fuerza * radio);
    }

}
