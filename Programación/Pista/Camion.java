public class Camion extends Vehiculo {

	static double precio = getprice(0);
	static int ejes;

	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + "]";

	}

	public static double getprice(int ejes) {
		return 6.65 * ejes;
	}

	public static double getPrecio() {
		return precio;
	}

	public static void setPrecio(double precio) {
		Coche.precio = precio;
	}

	public Camion(String matricula, int ejes) {
		super(matricula);
		this.ejes = ejes;
	}

	public static int getEjes() {
		return ejes;
	}

	public static void setEjes(int ejes) {
		Camion.ejes = ejes;
	}

}
