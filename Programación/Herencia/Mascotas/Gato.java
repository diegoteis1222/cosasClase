package Mascotas;

public class Gato extends Mascota {

    protected double saltoAltura;
    protected double saltoLargura;

    public Gato(String nombreMascota, int edadMascota, String colorMascota, double altura, double largura) {
        super(nombreMascota, edadMascota, colorMascota);
        this.saltoAltura = altura;
        this.saltoLargura = largura;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Gato [nombreMascota=" + nombreMascota + ", saltoAltura=" + saltoAltura + ", saltoLargura="
                + saltoLargura + "]";
    }
    public String sonido(){
        return "los gatos maullan y ronronean";
    }

}
