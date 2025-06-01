import java.util.Random;

public class Ciclista implements Comparable<Ciclista> {
    private int id;
    private String nombre;
    private double tiempoAcumulado = 0;
    private int posGeneral = -1;

    public Ciclista(int identificador, String nombre) {
        this.id = identificador;
        this.nombre = nombre;
        generarTiempo();
    }

    protected String imprimirTipo() {
        return "Ciclista genérico";
    }

    protected int getId() {
        return id;
    }

    protected void setIdentifcador(int id) {
        this.id = id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getPosGeneral() {
        return this.posGeneral;
    }

    protected void setPosGeneral(int posGeneral) {
        this.posGeneral = posGeneral;
    }

    protected double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + id);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }

    void generarTiempo() {
        Random rd = new Random();
        setTiempoAcumulado(rd.nextDouble(20.0, 30.0));
    }

    @Override
    public int compareTo(Ciclista c) {
        return Double.compare(this.getTiempoAcumulado(), c.getTiempoAcumulado());
    }

    @Override
    public String toString() {
        return "Ciclista [id=" + id + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + ", posGeneral="
                + posGeneral + "]";
    }
}
