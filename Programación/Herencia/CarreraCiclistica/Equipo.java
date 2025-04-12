package CarreraCiclistica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Equipo {

    private String nombre;
    // NO DEBERIA SER DE OBJETOO????
    private double totalTiempo;
    private String pais;
    ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new ArrayList<Ciclista>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTotalTiempo() {
        return totalTiempo;
    }

    // vale para resetear si pasamos 0.0
    public void setTotalTiempo(double totalTiempo) {
        this.totalTiempo = totalTiempo;
    }

    public ArrayList<Ciclista> getListaCiclistas() {
        return listaCiclistas;
    }

    public void setListaCiclistas(ArrayList<Ciclista> listaCiclistas) {
        this.listaCiclistas = listaCiclistas;
    }

    // METODOS
    void addCiclista(Ciclista ciclista) {
        // añadir ciclista
        listaCiclistas.add(ciclista);
    }

    // TODO quitar ciclista, modificar????
    // como ordenamos por tiempo????
    public void ordenaTiempoEquipo() {
        Collections.sort(listaCiclistas);
    }

    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            System.out.println(c.getNombre());
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del ciclista");
        String nombreCiclista = sc.nextLine();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);

            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println("Encontrado---->");
                System.out.println(c.getNombre());
            }
        }

        sc.close();
    }

    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);

            totalTiempo += c.getTiempoAcumulado();
        }
    }

    @Override
    public String toString() {
        return "Equipo: \nNombre=" + nombre + "\ntotalTiempo=" + totalTiempo + "\nPais=" + pais;
    }

}
