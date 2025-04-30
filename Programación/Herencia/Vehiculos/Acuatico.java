public class Acuatico extends Vehiculo implements Motor, Vela {

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int CalcularRevoluciones(int fuerza, int radio) {
        return (fuerza * radio);
    }

    public void recomendarVelocidad(int velocidadViento) {
    
        if(velocidadViento > 80 | velocidadViento < 10) {
            this.VelocidadActual = 0;
        }

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

}
