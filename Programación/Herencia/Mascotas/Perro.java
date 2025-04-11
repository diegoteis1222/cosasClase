package Mascotas;

public class Perro extends Mascota {

    protected double peso;
    protected boolean muerde;

    public Perro(String nombreMascota, int edadMascota, String colorMascota, double peso, boolean muerde) {
        super(nombreMascota, edadMascota, colorMascota);
        this.peso = peso;
        this.muerde = muerde;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Perro [nombreMascota=" + nombreMascota + ", muerde=" + muerde + "]";
    }

    public String sonido() {
        return "Los perros ladran";
    }
}
