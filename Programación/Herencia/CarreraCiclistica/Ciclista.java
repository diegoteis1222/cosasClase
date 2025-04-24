import java.util.Random;

/**
 * Esta clase abstracta denominada Ciclista posee como atributos un
 * identi{cador, un nombre y un tiempo acumulado en una carrera
 * ciclística.
 * 
 * @version 1.2/2020
 */
public class Ciclista implements Comparable<Ciclista> {
    private int id; /* Atributo que define el id de un ciclista */
    private String nombre; /* Atributo que define el nombre del ciclista */
    private double tiempoAcumulado = 0; /* Atributo que define el tiempo acumulado de un ciclista */
    // ATRIBUTO POSICIÓN DEL CICLISTA EN LA COMPETICIÓN
    private int posGeneral = -1; /* Posición del ciclista en la clasificación general */

    /**
     * Constructor de la clase Ciclista
     * 
     * @param identificador Parámetro que define el identificador de un
     *                      ciclista
     * @param nombre        Parámetro que define el nombre completo de un
     *                      ciclista
     */
    public Ciclista(int identificador, String nombre) {
        this.id = identificador;
        this.nombre = nombre;
        generarTiempo();
    }

    /**
     * Método abstracto que muestra en pantalla el tipo especí{co de un
     * ciclista
     * 
     * @return Tipo de ciclista
     */

    protected String imprimirTipo() {
        return "Ciclista genérico";
    };

    /**
     * Método que devuelve el identi{cador de un ciclista
     * 
     * @return El identi{cador de un ciclista
     */
    protected int getId() {
        return id;
    }

    /**
     * Método que establece el identi{cador de un ciclista
     * 
     * @param Parámetro que especi{ca el identi{cador de un ciclista
     */
    protected void setIdentifcador(int id) {
        this.id = id;
    }

    /**
     * Método que devuelve el nombre de un ciclista
     * 
     * @return El nombre de un ciclista
     */

    protected String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de un ciclista
     * 
     * @param Parámetro que especi{ca el nombre de un ciclista
     */
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el puesto que ocupa un ciclista en la
     * posición general de la competencia
     * 
     * @return El puesto del ciclista en la posición general
     */
    protected int getPosGeneral() {
        return this.posGeneral;
    }

    /**
     * Método que establece el puesto que ocupa un ciclista en la
     * posición general
     * 
     * @param Parámetro que especi{ca el puesto que ocupa un ciclista
     *                  en la posición general
     */
    protected void setPosGeneral(int posGeneral) {
        this.posGeneral = posGeneral;
    }

    /**
     * Método que devuelve el tiempo acumulado de un ciclista en una
     * competencia
     * 
     * @return El tiempo acumulado de un ciclista en una competencia
     */
    protected double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    /**
     * Método que establece el tiempo acumulado por un ciclista
     * 
     * @param Parámetro que especi{ca el tiempo acumulado por un ciclista
     */

    protected void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    /**
     * Método muestra en pantalla los datos de un ciclista
     */
    protected void imprimir() {
        System.out.println("Identificador = " + id);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " +
                tiempoAcumulado);
    }

    void generarTiempo() {
        Random rd = new Random();
        setTiempoAcumulado(rd.nextDouble(20.0, 30.0));
    }

    // Método para comparar el tiempo de dos ciclistas
    @Override
    public int compareTo(Ciclista c) {
        return (int) Double.compare(this.getTiempoAcumulado(), c.getTiempoAcumulado());
    }

    @Override
    public String toString() {
        return "Ciclista [id=" + id + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + ", posGeneral="
                + posGeneral + "]";
    }
}