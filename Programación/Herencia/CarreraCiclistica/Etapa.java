import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Etapa {

    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Ciclista> participantes;
    private HashMap<String, Double> clasificacion = new HashMap<>();

    private int numEtapa;
    private String nombre;
    private double tiempoTotal;
    private String lugar;

    public Etapa(int numEtapa, String nombre, String lugar) {
        this.numEtapa = numEtapa;
        this.nombre = nombre;
        this.lugar = lugar;
        inicializaEtapa();
    }

    public Etapa() {
    }

    // Inicializar listaequipos y participantes
    void inicializaEtapa() {
        // crear una collecion de equipos PIDIENDO DATOS
        listaEquipos = new ArrayList<>();
        participantes = new ArrayList<>();

        // crear una coleccion de ciclistas para cada equipo PIDIENDO DAtos
        // o le echamos papo y hacemos un MOCK

        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        Ciclista uno = new Velocista(71, "Geraint Thomas", 1, 2);
        Ciclista dos = new Escalador(72, "Egan Bernal", 1.2, 1.5);
        Ciclista tres = new Contrarrelojista(73, "Jonathan Castroviejo", 40);

        // añado ciclistas
        equipo1.addCiclista(uno);
        equipo1.addCiclista(dos);
        equipo1.addCiclista(tres);

        // Calcular tiempo total de equipo
        equipo1.calcularTiempoTotal();

        // Creación del segundo equipo
        Equipo equipo2 = new Equipo("Quick-Step", "Bélgica");

        // Creación de tres ciclistas nuevos
        Ciclista cuatro = new Velocista(74, "Pep Guardiola", 2, 4);
        Ciclista cinco = new Escalador(75, "Renato Sánchez", 1.5, 1.8);
        Ciclista seis = new Contrarrelojista(76, "Iago quivelas", 50);

        // Añadir ciclistas al equipo
        equipo2.addCiclista(cuatro);
        equipo2.addCiclista(cinco);
        equipo2.addCiclista(seis);

        // Calcular tiempo total de equipo
        equipo2.calcularTiempoTotal();

        // Equipo 3: Movistar Team (España)
        Equipo equipo3 = new Equipo("Movistar", "España");

        Ciclista siete = new Velocista(80, "Pedro Alonso", 0.7, 1);
        Ciclista ocho = new Escalador(81, "Max Jhonson", 1.8, 1.6);
        Ciclista nueve = new Contrarrelojista(82, "Jonathan Arribas", 30);

        equipo3.addCiclista(siete);
        equipo3.addCiclista(ocho);
        equipo3.addCiclista(nueve);

        // Calcular tiempo total de equipo
        equipo3.calcularTiempoTotal();

        // Equipo 4: Jumbo-Visma (Países Bajos)
        Equipo equipo4 = new Equipo("Jumbo-Visma", "Países Bajos");

        Ciclista diez = new Velocista(88, "Primož Roglič", 5, 7.2);
        Ciclista once = new Escalador(89, "Jonas Vingegaard", 3.2, 3);
        Ciclista doce = new Contrarrelojista(90, "Wout van Aert", 40);

        equipo4.addCiclista(diez);
        equipo4.addCiclista(once);
        equipo4.addCiclista(doce);

        // Calcular tiempo total de equipo
        equipo4.calcularTiempoTotal();

        // añadir a listaEquipos
        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);

        // añadir a participantes
        for (int i = 0; i < equipo1.listaCiclistas.size(); i++) {
            participantes.add(equipo1.getListaCiclistas().get(i));
        }

        for (int i = 0; i < equipo2.listaCiclistas.size(); i++) {
            participantes.add(equipo2.getListaCiclistas().get(i));
        }

        for (int i = 0; i < equipo3.listaCiclistas.size(); i++) {
            participantes.add(equipo3.getListaCiclistas().get(i));
        }

        for (int i = 0; i < equipo4.listaCiclistas.size(); i++) {
            participantes.add(equipo4.getListaCiclistas().get(i));
        }
    }

    public void mostrarEquipos() {
        // Muestro los equipos
        for (int i = 0; i < listaEquipos.size(); i++) {
            System.out.println(listaEquipos.get(i));
        }
    }

    public void mostrarParticipantes() {
        for (Ciclista c : participantes) {
            System.out.println(c);
        }
    }

    public void sumarTiempos() {
        double tiempo = 0;
        for (Ciclista c : participantes) {
            tiempo += c.getTiempoAcumulado();
        }
    }

    public void ordenarEquipos() {
        Collections.sort(listaEquipos);
    }

    public void ordenarParticipantes() {
        Collections.sort(participantes);
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public int getNumEtapa() {
        return numEtapa;
    }

    public void setNumEtapa(int numEtapa) {
        this.numEtapa = numEtapa;
    }

    public double getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(double tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Ciclista> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Ciclista> participantes) {
        this.participantes = participantes;
    }

    public HashMap<String, Double> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(HashMap<String, Double> clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Etapa [listaEquipos=" + listaEquipos + ", participantes=" + participantes + ", clasificacion="
                + clasificacion + ", numEtapa=" + numEtapa + ", nombre=" + nombre + ", tiempoTotal=" + tiempoTotal
                + ", lugar=" + lugar + "]";
    }

}