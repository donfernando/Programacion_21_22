package dpm.bloque4.ejercicios;

public class Jugador {
	private String nombre;
	private int dorsal;
	private float estatura;
	private Equipo miEquipo;
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
	 */
	public void setDorsal(int dorsalNuevo) {
		int iJug;
		if(miEquipo==null)
			this.dorsal=dorsalNuevo;
		else {
			iJug=0;
			while(iJug < miEquipo.getJugadores()-1 && 
				  dorsalNuevo!=miEquipo.getJugador(iJug).getDorsal())
				iJug++;
			if(dorsalNuevo!=miEquipo.getJugador(iJug).getDorsal())
				this.dorsal=dorsalNuevo;
		}
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
	 * 
	 * Este funcion se entiende que será llamada solo desde un objeto Equipo
	 */
	public void setSuEquipo(Equipo equipo) {
		if(!lesionado) {
			if(this.miEquipo!=null)
				this.miEquipo.despedirJugador(this.dorsal);
			this.miEquipo = equipo;
		}
	}
	
	public String toString() {
		return String.format("%s (alt: %.2f m., dorsal: %d)", nombre, estatura, dorsal);
	}
	
}