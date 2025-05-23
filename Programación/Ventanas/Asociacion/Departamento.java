import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Departamento {

    private String nombre; // Nombre del departamento
    private ArrayList<Municipio> municipios; // Lista de municipios del departamento

    /**
     * Constructor de la clase Departamento
     * 
     * @param nombre     Nombre del departamento
     * @param municipios Lista de municipios que pertenecen al departamento
     */
    public Departamento(String nombre, ArrayList<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        
    }

    /**
     * Devuelve el nombre del departamento
     * 
     * @return Nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del departamento
     * 
     * @param nombre Nombre del departamento
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Agrega un municipio al departamento
     * 
     * @param municipio Municipio a agregar
     */
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    /**
     * Elimina un municipio del departamento por su nombre
     * 
     * @param nombre Nombre del municipio a eliminar
     */
    public void eliminarMunicipio(String nombre) {
        Municipio municipio;
        for (int i = 0; i < municipios.size(); i++) {
            municipio = (Municipio) municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio);
                break;
            }
        }
    }

    /**
     * Busca un municipio por su nombre e imprime sus datos si lo encuentra
     * 
     * @param nombre Nombre del municipio a buscar
     */
    public void buscarMunicipio(String nombre) {
        boolean encontrado = false;
        for (Municipio municipio : municipios) {
            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Municipio no encontrado.");
        }
    }

    /**
     * Busca e imprime los municipios con población mayor o igual a la dada
     * 
     * @param poblacion Población mínima a buscar
     */
    public void buscarMunicipioConPoblacionMayor(int poblacion) {
        List<Municipio> encontrados = municipios.stream()
                .filter(m -> m.getPoblacion() >= poblacion)
                .collect(Collectors.toList());
        if (encontrados.isEmpty()) {
            System.out.println("No existen municipios con esta población.");
        } else {
            encontrados.forEach(m -> System.out.println(m.getNombre()));
        }
    }

    /**
     * Calcula y devuelve la población total del departamento
     * 
     * @return Población total
     */
    public int calcularCensoPoblacionDepartamento() {
        int totalCenso = 0;
        for (Municipio municipio : municipios) {
            totalCenso += municipio.getPoblacion();
        }
        return totalCenso;
    }

    public static ArrayList<Municipio> MunicipiosEjemplo() {
        ArrayList<Municipio> municipios = new ArrayList<>();

        municipios.add(new Municipio("Ciudad Andina", 120000, 15.2, 2600));
        municipios.add(new Municipio("Villa Mar", 85000, 26.7, 120));
        municipios.add(new Municipio("Pueblo Alto", 34000, 12.3, 3200));
        municipios.add(new Municipio("San Valle", 97000, 21.5, 800));
        municipios.add(new Municipio("Costa Azul", 143000, 28.0, 15));

        return municipios;
    }

    public void listaTodo() {
        for (Iterator iterator = municipios.iterator(); iterator.hasNext();) { //wtf
            Municipio municipio = (Municipio) iterator.next();
            System.out.println("nombre: " + municipio.getNombre() + "poblacion: " + municipio.getPoblacion());
        }
    }
}
