public class paralelepipedo extends FiguraGeometrica{
    private double largo;
    private double ancho;
    private double alto;

    public paralelepipedo(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = this.alto * this.ancho * this.largo;
        return volumen;
    }

    public double calcularSuperficie() {
        double area = 2 * ((this.largo * this.ancho) + (this.largo * this.alto) + ( this.ancho * this.alto));
        return area;
    }
}
