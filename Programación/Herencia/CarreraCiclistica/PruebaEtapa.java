public class PruebaEtapa {
    public static void main(String[] args) {
        Etapa etapa = new Etapa(1, "Vigo-Vigo", "Vigo");

        // ordenar participantes y equipos --> Fallando
        etapa.ordenarEquipos();
        etapa.ordenarParticipantes();

        // listar
        etapa.mostrarEquipos();
        etapa.mostrarParticipantes();
    }
}
