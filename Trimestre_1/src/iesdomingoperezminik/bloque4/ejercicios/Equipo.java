package iesdomingoperezminik.bloque4.ejercicios;

public class Equipo {
	private String nombre;
	private Jugador[] jugadores;
	private int numJugadores;
	private int division;
	private int partidos;
	private int puntosLiga;
	
	private boolean dorsalYaExiste(int dorsal) {
		int pos=0;
		while(pos < numJugadores-1 && dorsal != jugadores[pos].getDorsal()) {
			pos++;
		}
		return dorsal == jugadores[pos].getDorsal();
	}
	
	/**
	 * Inicializa el nombre del equipo y todo aquello que sea preciso.
	 */
	public Equipo(String nombre) {
		this.nombre=nombre;
		jugadores = new Jugador[15];
		// numJugadores=0;
	}
	/**
	 * @return Número de Jugadores
	 */
	public int getJugadores() {
		return numJugadores;
	}
	/**
	 * @return El objeto jugador 'pos' de la lista de jugadores.
	 * pos es una posicion de 0 en adelante.
	 * Si no existe ese jugador se retorna null
	 */
	public Jugador getJugador(int pos) {
		// TODO pendiente de implementacion
		return null;
	}
	/**
	 * @param Añade un nuevo jugador al equipo
	 */
	public void contratarJugador(Jugador jugador) {
		// Añadir a mi lista de jugadores a "jugador"
		// Pedir al jugador jugador que se apunte que 
		//   yo (this) soy su equipo.
		// TODO pendiente de implementacion
	}
	/**
	 * @param Elimina del equipo el jugador cuyo dorsal se le indica.
	 */
	public void despedirJugador(int dorsal) {
		// TODO pendiente de implementacion
	}
	/**
	 * @return La división en la que el equipo está jugando actualmente.
	 * Si aun no tiene division asignada, retonara 0.
	 */
	public int getDivision() {
		return division;
	}
	/**
	 * @param Cambia la división en la que el equipo juega.
	 * Solo puede ser un número entre 1 y 4
	 */
	public void setDivision(int division) {
		if(division>=1 && division<=4)
			this.division=division;
	}
	/**
	 * @return Consulta los puntos que lleva el equipo actualmente en la competición.
	 * Cada equipo comienza con 0 puntos.
	 */
	public int getPuntosLiga() {
		return puntosLiga;
	}
	/**
	 * @param Añade puntos indicados al equipo. Los puntos solo pueden ser un valor entre 1 y 9.
	 * Cada vez que se añaden puntos, se incrementa en uno el número de partidos.
	 */
	public void incrementarPuntosLiga(int puntosLiga) {
		if(puntosLiga>=1 && puntosLiga<=9) {
			this.puntosLiga += puntosLiga;
			partidos++;
		}
	}
	/**
	 * @return El nombre del equipo. Este nombre no se puede cambiar,
	 *  solo se le pone el nombre a un equipo cuando se crea inicialmente.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return El número de partidos jugados hasta la fecha.
	 */
	public int getPartidos() {
		return partidos;
	}
	
	@Override
	public String toString() {
		int i;
		String r = "Equipo: "+nombre+"\n";
		r += "\tPartidos jugados: "+partidos+"\n";
		r += "\tPuntos: "+puntosLiga+"\n";
		
		for (i = 0; i < numJugadores; i++) {
			r += "\t- "+jugadores[i].getNombre()+"\n";
		}
		return r;
	}
	
	
	
}
