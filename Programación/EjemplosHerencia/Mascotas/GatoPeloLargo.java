package Mascotas;

public class GatoPeloLargo extends Gato{
    
    public enum razas {
        angora, himalayo, bolines, somali
    }

    private razas PeloLargo;

    public GatoPeloLargo(String nombreMascota, int edadMascota, String colorMascota, double altura, double largura,
            razas peloLargo) {
        super(nombreMascota, edadMascota, colorMascota, altura, largura);
        PeloLargo = peloLargo;
    }

    @Override
    public String toString() {
        return "GatoPeloLargo [PeloLargo=" + PeloLargo + ", toString()=" + super.toString() + "]";
    }

    public String sonido() {
        return super.sonido() + " y sueltan pelo";
    }
}
