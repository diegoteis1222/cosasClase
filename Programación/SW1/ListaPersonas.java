import java.util.ArrayList;

public class ListaPersonas {

    ArrayList<Persona> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new ArrayList<Persona>();
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }

    public void borrarLista() {
        listaPersonas.removeAll(listaPersonas);
    }

}

