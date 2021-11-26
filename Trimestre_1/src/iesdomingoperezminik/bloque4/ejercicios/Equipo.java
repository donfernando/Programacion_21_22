package iesdomingoperezminik.bloque4.ejercicios;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	private int division;
	private int partidos;
	private int puntosLiga;

	// Busqueda Lineal
	private boolean dorsalYaExiste(int dorsal) {
		int pos = 0;
		boolean existe;
		if (jugadores.size() != 0) {
			while (pos < jugadores.size() - 1 & dorsal != jugadores.get(pos).getDorsal()) {
				pos++;
			}
			existe = (dorsal == jugadores.get(pos).getDorsal());
		} else
			existe = false;
		return existe;
	}

	/*
	 * Busqueda Lineal Alternativa private boolean dorsalYaExiste(int dorsal) { int
	 * pos = 0; boolean existe; while (pos < jugadores.size() && dorsal !=
	 * jugadores.get(pos).getDorsal()) { pos++; } existe = pos<jugadores.size();
	 * return existe; }
	 */

	/**
	 * Inicializa el nombre del equipo y todo aquello que sea preciso.
	 */
	public Equipo(String nombre) {
		this.nombre = nombre;
		jugadores = new ArrayList<Jugador>();
	}

	/**
	 * @return Número de Jugadores
	 */
	public int getJugadores() {
		return jugadores.size();
	}

	/**
	 * @return El objeto jugador 'pos' de la lista de jugadores. pos es una posicion
	 *         de 0 en adelante. Si no existe ese jugador se retorna null
	 */
	public Jugador getJugador(int pos) {
		Jugador j = null;
		if (pos >= 0 && pos <= jugadores.size() - 1)
			j = jugadores.get(pos);
		return j;
	}

	/**
	 * @param Añade un nuevo jugador al equipo
	 */
	public void contratarJugador(Jugador jugador) {
		// Añadir a mi lista de jugadores a "jugador"
		// Pedir al jugador jugador que se apunte que
		// yo (this) soy su equipo.
		int dorsalNuevo;
		if (!jugador.lesionado) {
			jugador.setSuEquipo(this);
			if (dorsalYaExiste(jugador.getDorsal())) {
				dorsalNuevo = 1;
				while (dorsalYaExiste(dorsalNuevo))
					dorsalNuevo++;
				jugador.setDorsal(dorsalNuevo);
			}
			jugadores.add(jugador);
		}
	}

	/**
	 * @param Elimina del equipo el jugador cuyo dorsal se le indica.<br/>
	 *                Es llamada por el propio jugador no desde fuera.
	 */
	public void despedirJugador(int dorsal) {
		int pos = 0;
		if (jugadores.size() != 0) {
			while (pos < jugadores.size() - 1 && dorsal != jugadores.get(pos).getDorsal()) {
				pos++;
			}
			if (dorsal == jugadores.get(pos).getDorsal()) {
				// TODO Error de llamadas recurrentes.
				// jugadores.get(pos).setSuEquipo(null);
				jugadores.remove(pos);
			}
		}
	}

	/**
	 * @return La división en la que el equipo está jugando actualmente. Si aun no
	 *         tiene division asignada, retonara 0.
	 */
	public int getDivision() {
		return division;
	}

	/**
	 * @param Cambia la división en la que el equipo juega. Solo puede ser un número
	 *               entre 1 y 4
	 */
	public void setDivision(int division) {
		if (division >= 1 && division <= 4)
			this.division = division;
	}

	/**
	 * @return Consulta los puntos que lleva el equipo actualmente en la
	 *         competición. Cada equipo comienza con 0 puntos.
	 */
	public int getPuntosLiga() {
		return puntosLiga;
	}

	/**
	 * @param Añade puntos indicados al equipo. Los puntos solo pueden ser un valor
	 *              entre 1 y 9. Cada vez que se añaden puntos, se incrementa en uno
	 *              el número de partidos.
	 */
	public void incrementarPuntosLiga(int puntosLiga) {
		if (puntosLiga >= 1 && puntosLiga <= 9) {
			this.puntosLiga += puntosLiga;
			partidos++;
		}
	}

	/**
	 * @return El nombre del equipo. Este nombre no se puede cambiar, solo se le
	 *         pone el nombre a un equipo cuando se crea inicialmente.
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
		String r = "Equipo: " + nombre + "\n";
		r += "\tPartidos jugados: " + partidos + "\n";
		r += "\tPuntos: " + puntosLiga + "\n";

		for (i = 0; i < jugadores.size(); i++) {
			r += "\t- " + jugadores.get(i).getNombre() + "(" + jugadores.get(i).getDorsal() + ")\n";
		}
		return r;
	}

}
