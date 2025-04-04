package Mascotas;

public class Mascota {

    protected String nombreMascota;
    protected int edadMascota;
    protected String colorMascota;

    public Mascota(String nombreMascota, int edadMascota, String colorMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
        this.colorMascota = colorMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }

    @Override
    public String toString() {
        return "Mascota [nombreMascota=" + nombreMascota + ", edadMascota=" + edadMascota + ", colorMascota="
                + colorMascota + "]";
    }

    public String sonido() {
        return "sonido generico";
    }

}
