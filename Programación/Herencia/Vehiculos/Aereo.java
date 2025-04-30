public class Aereo extends Vehiculo implements Motor, reactor {

    public Aereo(int velocidadActual, int velocidadMaxima) {
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

    @Override
    public int CalcularRevoluciones(int fuerza, int radio) {
        return (fuerza * radio);
    }

    void despegar() {
        System.out.println(this.getClass().getName() + " está despegando");
    }

    void aterrizar() {
        System.out.println(this.getClass().getName() + " está aterrizando");
    }

    void volar() {
        System.out.println(this.getClass().getName() + " está volando");
    }

    @Override
    public String encender(String string) {
        return "El reactor marca " + string + " esta encendido";
    }

    @Override
    public String apagar(String string) {
        return "El reactor esta apago " + string + " esta apagado";
    }

}
