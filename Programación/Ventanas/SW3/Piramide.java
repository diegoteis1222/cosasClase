public class Piramide extends FiguraGeometrica {

    private double base;
    private double altura;
    private double apotema;

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(apotema);
        this.setSuperficie(apotema);
    }

    public double calcularApotema() {
        double apotema = Math.sqrt( Math.pow(this.altura, base));
        return apotema;
    }

    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2) * altura) / 3d;
        return volumen;
    }

    public double calcularSuperficie() {
        double areaBase =  Math.pow(base, 2);
        double areaLado = base * apotema / 2d;
        return areaBase + 4 * areaLado;
    }
}
