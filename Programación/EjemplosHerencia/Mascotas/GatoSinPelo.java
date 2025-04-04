package Mascotas;

public class GatoSinPelo extends Gato {

    public enum razas {
        esfinge, elfo, donskoy
    }

    private razas SinPelo;

    public GatoSinPelo(String nombreMascota, int edadMascota, String colorMascota, double altura, double largura,
            razas sinPelo) {
        super(nombreMascota, edadMascota, colorMascota, altura, largura);
        SinPelo = sinPelo;
    }

    @Override
    public String toString() {
        return "GatoSinPelo [SinPelo=" + SinPelo + ", toString()=" + super.toString() + "]";
    }

    public String sonido() {
        return super.sonido() + " y son feos";
    }

}
