public class Esfera extends FiguraGeometrica {
    
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(this.calcularVolumen());
        this.setSuperficie(this.calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = 4 * Math.PI * Math.pow(this.radio, 3) / 3d;
        return volumen;
    }
    
	public double calcularSuperficie() {
		double superficie = 4 * Math.PI * Math.pow(this.radio, 2);
		return superficie;
	}

}
