package Mascotas;

public class PerroMediano extends Perro{

    public enum razas{
        callie, dalmata, bulldog, galgo, sabueso
    }

    private razas Mediano;

    public PerroMediano(String nombreMascota, int edadMascota, String colorMascota, double peso, boolean muerde,
            razas mediano) {
        super(nombreMascota, edadMascota, colorMascota, peso, muerde);
        Mediano = mediano;
    }

    @Override
    public String toString() {
        return "PerroMediano [Mediano=" + Mediano + ", toString()=" + super.toString() + "]";
    }

    
    public String sonido() {
        return super.sonido() + " y divierten";
    }
}
