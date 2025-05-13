public class Cilindro extends FiguraGeometrica {

    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2);
        return volumen;
    }

    public double calcularSuperficie() {
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTapa = Math.PI * Math.pow(radio, 2);
        return areaLateral + 2 * areaTapa;
    }
}