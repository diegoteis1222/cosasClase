package Mascotas;

public class GatoPeloCorto extends Gato{

    public enum razas{
        azul_ruso, britanico, manx, devon_rex
    }

    private razas PeloCorto;

    public GatoPeloCorto(String nombreMascota, int edadMascota, String colorMascota, double altura, double largura,
            razas peloCorto) {
        super(nombreMascota, edadMascota, colorMascota, altura, largura);
        PeloCorto = peloCorto;
    }

    @Override
    public String toString() {
        return "GatoPeloCorto [PeloCorto=" + PeloCorto + ", toString()=" + super.toString() + "]";
    }

    public String sonido() {
        return super.sonido() + " y son monos";
    }

}
