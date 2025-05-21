import java.util.ArrayList;

public class Peaje {
    String nombre;
    String departamento;
    ArrayList<Vehiculo> vehiculos;
    int totalPeaje = 0;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCoches = 0;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new ArrayList<Vehiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalPeaje() {
        return totalPeaje;
    }

    public void setTotalPeaje(int totalPeaje) {
        this.totalPeaje = totalPeaje;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

    public static void setTotalCamiones(int totalCamiones) {
        Peaje.totalCamiones = totalCamiones;
    }

    public static int getTotalMotos() {
        return totalMotos;
    }

    public static void setTotalMotos(int totalMotos) {
        Peaje.totalMotos = totalMotos;
    }

    public static int getTotalCoches() {
        return totalCoches;
    }

    public static void setTotalCoches(int totalCoches) {
        Peaje.totalCoches = totalCoches;
    }

    

}