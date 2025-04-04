package Mascotas;

public class PerroGrande extends Perro {

    public enum razas {
        pastor_aleman, doberman, rotweiller
    }

    private razas Grande;

    public PerroGrande(String nombreMascota, int edadMascota, String colorMascota, double peso, boolean muerde,
            razas grande) {
        super(nombreMascota, edadMascota, colorMascota, peso, muerde);
        Grande = grande;
    }

    @Override
    public String toString() {
        return "PerroGrande [Grande=" + Grande + ", toString()=" + super.toString() + "]";
    }

    public String sonido() {
        return super.sonido() + " y amedrentan";
    }

}
