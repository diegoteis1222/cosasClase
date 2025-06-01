public class PruebaEtapa {
    public static void main(String[] args) {
        Etapa etapa = new Etapa(1, "Vigo-Vigo", "Vigo");

        System.out.println("----------------Clasificacion--------------");
        etapa.calcularClasificacion();
        etapa.asignarPosiciones();

        System.out.println("----------------Equipos--------------");
        etapa.mostrarEquipos();
        etapa.mostrarParticipantes();

    }
}
