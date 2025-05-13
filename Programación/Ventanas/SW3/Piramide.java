public class Piramide extends FiguraGeometrica {

    private double base;
    private double altura;
    private double apotema;

    public double getApotema() {
        return apotema;
    }

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.apotema = calcularApotema();
        this.setVolumen(this.calcularVolumen()); 
        this.setSuperficie(this.calcularSuperficie()); 
    }

    public double calcularApotema() {
        double apotema = Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.base / 2, 2));
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
