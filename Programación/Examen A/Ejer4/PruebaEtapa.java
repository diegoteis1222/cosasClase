import java.util.ArrayList;
import java.util.Collections;

public class PruebaEtapa {
    public static void main(String[] args) {
        // Crear equipos y ciclistas (solo una vez)
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        equipo1.addCiclista(new Velocista(71, "Geraint Thomas", 1, 2));
        equipo1.addCiclista(new Escalador(72, "Egan Bernal", 1.2, 1.5));
        equipo1.addCiclista(new Contrarrelojista(73, "Jonathan Castroviejo", 40));

        Equipo equipo2 = new Equipo("Quick-Step", "Bélgica");
        equipo2.addCiclista(new Velocista(74, "Pep Guardiola", 2, 4));
        equipo2.addCiclista(new Escalador(75, "Renato Sánchez", 1.5, 1.8));
        equipo2.addCiclista(new Contrarrelojista(76, "Iago Quivelas", 50));

        Equipo equipo3 = new Equipo("Movistar", "España");
        equipo3.addCiclista(new Velocista(80, "Pedro Alonso", 0.7, 1));
        equipo3.addCiclista(new Escalador(81, "Max Jhonson", 1.8, 1.6));
        equipo3.addCiclista(new Contrarrelojista(82, "Jonathan Arribas", 30));

        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);

        ArrayList<Ciclista> participantes = new ArrayList<>();

        for (int i = 0; i < equipo1.listaCiclistas.size(); i++) {
            participantes.add(equipo1.getListaCiclistas().get(i));
        }

        for (int i = 0; i < equipo2.listaCiclistas.size(); i++) {
            participantes.add(equipo2.getListaCiclistas().get(i));
        }

        for (int i = 0; i < equipo3.listaCiclistas.size(); i++) {
            participantes.add(equipo3.getListaCiclistas().get(i));
        }

        // crear las etapas
        Etapa etapa1 = new Etapa(1, "Vigo - Vigo", "Vigo");
        etapa1.setListaEquipos(equipos);
        etapa1.setParticipantes(participantes);

        Etapa etapa2 = new Etapa(2, "Uganda - Zimbawe", "Africa");
        etapa2.setListaEquipos(equipos);
        etapa2.setParticipantes(participantes);

        Etapa etapa3 = new Etapa(3, "TuPrima - TuMadre", "Tucasa");
        etapa3.setListaEquipos(equipos);
        etapa3.setParticipantes(participantes);

        System.out.println("\n--- Clasificación Etapa 1 ---");
        etapa1.calcularClasificacion();
        etapa1.asignarPosiciones();

        System.out.println("\n--- Clasificación Etapa 2 ---");
        etapa2.calcularClasificacion();
        etapa2.asignarPosiciones();

        System.out.println("\n--- Clasificación Etapa 3 ---");
        etapa3.calcularClasificacion();
        etapa3.asignarPosiciones();


        System.out.println("\n--- Clasificación General ---");
        Collections.sort(participantes);
        for (int i = 0; i < participantes.size(); i++) {
            Ciclista c = participantes.get(i);
            System.out.println((i + 1) + " " + c.getNombre() + "  Tiempo: " + c.getTiempoAcumulado());
        }
    }
}
