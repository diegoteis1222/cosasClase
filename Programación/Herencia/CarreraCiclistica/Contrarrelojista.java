public class Contrarrelojista extends Ciclista {
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMáxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }

    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    @Override
    public String toString() {
        return "\n"+super.toString() + "\nContrarelojista [velocidadMáxima=" + velocidadMáxima + "]";
    }

    /**
     * Método que devuelve el tipo de ciclista
     * 
     * @return Un valor String con el texto “Es un constrarrelojista”
     */
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }

    @Override
    void generarTiempo() {
        super.generarTiempo();
        double tiempo = this.getTiempoAcumulado();
        tiempo = tiempo - this.velocidadMáxima*0.33;
        this.setTiempoAcumulado(tiempo);
    }
}