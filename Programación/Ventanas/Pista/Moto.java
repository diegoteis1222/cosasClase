public class Moto extends Vehiculo{
	
	static double precio= 5.32;

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + "]";
	}

	public static double getPrecio() {
		return precio;
	}

	public static void setPrecio(double precio) {
		Coche.precio = precio;
	}

	public Moto(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}

}
