import java.util.ArrayList;
import java.util.Collections;

public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private double totalTiempo;
    private String pais;

    ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.totalTiempo = 0;
        this.pais = pais;
        listaCiclistas = new ArrayList<>();
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Equipo otroEquipo) {
        return (int) Double.compare(this.totalTiempo, otroEquipo.totalTiempo);
    }

    public double getTotalTiempo() {
        return totalTiempo;
    }

    public void setTotalTiempo(double totalTiempo) {
        this.totalTiempo = totalTiempo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Ciclista> getListaCiclistas() {
        return listaCiclistas;
    }

    void listarEquipo() {
        for (Ciclista c : getListaCiclistas()) {
            System.out.println(c);
        }
    }

    void addCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void setListaCiclistas(ArrayList<Ciclista> listaCiclistas) {
        this.listaCiclistas = listaCiclistas;
    }

    /**
     * Método que calcula el tiempo total de un equipo acumulando el tiempo obtenido
     * por cada uno de sus ciclistas
     */
    public void calcularTiempoTotal() {
        for (Ciclista c : getListaCiclistas()) {
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    void ordenarCiclistasPorTiempo() {
        Collections.sort(listaCiclistas);
    }

    // Método que busca un ciclista ingresado por teclado
    Ciclista buscarCiclista(String nombre) {
        Ciclista cnull = new Ciclista(0, null);
        for (int i = 0; i < listaCiclistas.size(); i++) {
            if (listaCiclistas.get(i).getNombre().equals(nombre)) {
                return listaCiclistas.get(i);
            }
        }
        return cnull;
    }

    @Override
    public String toString() {
        return "\nEquipo [nombre=" + nombre + ", totalTiempo=" + totalTiempo + ", pais=" + pais + "]";
    }

}