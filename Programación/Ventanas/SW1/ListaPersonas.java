import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaPersonas implements Serializable {

    private static final String NOMBRE_FICHERO = "DATOS.OBJ";

    ArrayList<Persona> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new ArrayList<Persona>();
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ListaPersonas(ArrayList<Persona> Conjunto) {
        this.listaPersonas = Conjunto;
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

    // Guardar la lista en un fichero
    public static void guardarArrayList(ListaPersonas lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO))) {
            oos.writeObject(lista);
            System.out.println("Array guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar");
        }
    }

    // Cargar la lista en un fichero
    public static ListaPersonas cargarArrayList() {
        ListaPersonas lista;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO))) {
            lista = (ListaPersonas) ois.readObject();
            System.out.println("Arraylist cargado");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar");
            lista = new ListaPersonas(new ArrayList<>());
        }
        return lista;
    }

}
