package miJuego;

import juego.flota.Barco;

public class Crucero extends Barco {

	public Crucero() {
		super(5);
	}
	@Override
	public String toString() {
		return "Crucero";
	}
	@Override
	public char letra() {
		return 'C';
	}	}
