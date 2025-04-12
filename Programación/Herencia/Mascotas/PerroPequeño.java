package Mascotas;

public class PerroPequeño extends Perro{

    public enum razas {
        caniche, yorkshire_terrier, schnauzer
    }

    private razas Pequeno;

    public PerroPequeño(String nombreMascota, int edadMascota, String colorMascota, double peso, boolean muerde,
            razas pequeno) {
        super(nombreMascota, edadMascota, colorMascota, peso, muerde);
        Pequeno = pequeno;
    }

    @Override
    public String toString() {
        return "PerroPequeño [Pequeno=" + Pequeno + ", toString()=" + super.toString() + "]";
    }

    public String sonido() {
        return super.sonido() + " y estos entretienen";
    }
    
}
