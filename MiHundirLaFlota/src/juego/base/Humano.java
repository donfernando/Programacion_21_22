package juego.base;

import java.awt.Point;

import juego.base.Mundo.Estado;

public class Humano extends Jugador {

	public Humano(String nombre) {
		super(nombre);
	}

	public Estado disparar(Mundo m, Point p) {
		Estado e;
		e = m.recibeDisparo(p.x, p.y);
		return e;
	}


}
