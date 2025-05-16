import java.util.ArrayList;

public class test {

    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a
    // la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("\nTodos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }

        // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

        // ENTRENO
        System.out.println("\nTodos los integrantes entrenan. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }

        // Partido
        System.out.println("\nTodos los integrantes van al partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.jugarPartido();
            ;
        }

        // propios
        System.out.println("\nTodos los integrantes hacen algo unico. (Todos ejecutan su método propio)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            if (integrante instanceof Entrenador) {
                ((Entrenador) integrante).planificarEntrenamiento();
                ((Entrenador) integrante).prepararTactica();
                ((Entrenador) integrante).primaPorGanar();
            } else if (integrante instanceof Futbolista) {
                ((Futbolista) integrante).entrevista();
                ((Futbolista) integrante).primaPorGanar();
            } else if (integrante instanceof Masajista) {
                ((Masajista) integrante).darMasaje();
                ((Masajista) integrante).primaPorGanar();
            }
            ;
        }

    }
}
