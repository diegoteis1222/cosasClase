package CarreraCiclistica;

public class CarreraTest {

	public static void main(String[] args) {

		Equipo equipo1 = new Equipo("FOXHOUND", "EEUU");
		Ciclista ciclis1 = new Ciclista(123979, "Big Boss");
		Ciclista ciclis2 = new Ciclista(123980, "Solid Snake");
		Ciclista ciclis3 = new Ciclista(123981, "Raiden");

		// añado ciclistas
		equipo1.addCiclista(ciclis1);
		equipo1.addCiclista(ciclis2);
		equipo1.addCiclista(ciclis3);

		// randomizar este metodo-->crear metodo correr etapa para cada ciclista

		// los ciclistas van a correr
		for (Ciclista c : equipo1.getListaCiclistas()) {
			c.correr();
			System.out.println(c);
		}
		// ordenar equipo por tiempo
		equipo1.ordenaTiempoEquipo();

		// como ordenamos eseta lista???-->deberia ir por tiempo
		equipo1.calcularTotalTiempo();

		// cñasificacion general
		// equipo1.listarEquipo(); -- MEJORAR
		System.out.println("\nTiempo equipo");
		System.out.println(equipo1.toString());

	}
}
