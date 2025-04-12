package CarreraCiclistica;

import java.util.Random;

public class Ciclista implements Comparable {

	protected int id;

	protected String nombre;
	protected double tiempoAcumulado = 0d;

	protected int posGeneral = 0;

	public Ciclista(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	protected int getId() {
		return id;
	}

	protected void setId() {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getPosGeneral() {
		return this.posGeneral;
	}

	protected void setPosGeneral(int pos) {
		this.posGeneral = pos;
	}

	protected double getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	protected void setTiempoAcumulado(double tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	// metodo para asignar tiempo a un ciclista
	public void correr() {
		Random random = new Random();
		double etapa = random.nextDouble(30, 70);
		this.setTiempoAcumulado(etapa);
	}

	// METODOS
	/**
	 * Método que muestra en pantalla el tipo especí{co de un
	 * ciclista
	 * 
	 * @return Tipo de ciclista
	 */
	// puedo crear ciclista
	// hay ciclistas especializados
	protected String imprimirTipo() {
		return "Ciclista Generico";
	}

	@Override
	public String toString() {
		return "Ciclista: \n\tId=" + id + ", Nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado
				+ ", posGeneral="
				+ posGeneral;
	}

	// meotodo para comparar tiempo ciclista
	@Override
	public int compareTo(Object o) {
		Ciclista c = (Ciclista) o;
		// TODO Auto-generated method stub
		return (int) (this.getTiempoAcumulado() - c.getTiempoAcumulado());
	}

}
