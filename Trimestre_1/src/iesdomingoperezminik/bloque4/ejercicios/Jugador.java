package iesdomingoperezminik.bloque4.ejercicios;

public class Jugador {
	private String nombre;
	private int dorsal;
	private float estatura;
	private Equipo suEquipo;
	public boolean lesionado;
	/**
	 * Se le debe facilitar el nombre, su estatura y el dorsal.
	 * (se presupone sin comprobarlo que el dorsal es único
	 *  y que nadie más en su equipo lo tiene)
	 * 
	 */
	public Jugador(String nombre, float estatura, int dorsal) {
		this.nombre=nombre;
		this.estatura=estatura;
		this.dorsal=dorsal;
	}
	/**
	 * @return El nombre del jugador
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return La estatura del jugador
	 */
	public float getEstatura() {
		return estatura;
	}
	/**
	 * Se asigna nuevo dorsal.
	 * (opcional)....comprobar que en su equipo (si lo tiene) nadie tenga este dorsal.
	 */
	public void setDorsal(int dorsal) {
		this.dorsal=dorsal;
	}
	
	/**
	 * @return El dorsal que el jugador lleva a la espalda
	 */
	public int getDorsal() {
		return dorsal;
	}
	
	
	/**
	 * Inicialmente el jugador no tiene equipo hasta que se la asigna.
	 * Mientras un jugador está lesionado, no se le puede asignar ni cambiar de equipo.
	 * (opcional)...impedir que a un jugador
	 * se le asigne un equipo en el que algun jugador tenga asignado su dorsal
	 */
	public void setSuEquipo(Equipo suEquipo) {
		this.suEquipo = suEquipo;
	}
	
	
	public String toString() {
		return String.format("Jug(%s, alt: %.2fm., dorsal: %d)", nombre, estatura, dorsal);
	}
	
}