import java.util.ArrayList;

public class ListaPersonas {

    ArrayList<Persona> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new ArrayList<Persona>();
    }

    public void añadirPerona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }

    public void borraLista() {
        listaPersonas.removeAll(listaPersonas);
    }

}

