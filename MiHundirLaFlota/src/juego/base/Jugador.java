package juego.base;

import juego.HundirLaFlota;
import juego.base.Mundo.Direccion;
import juego.base.Mundo.Estado;
import juego.flota.Astillero;
import juego.flota.Barco;
import miJuego.MiAstillero;

public class Jugador {
	protected Mundo miMundo;
	protected String miNombre; 
	public Jugador(String nombre) {
		miMundo = new Mundo(5);
		miNombre = nombre;
	}

	public String getNombre() {
		return miNombre;
	}
	
	public Mundo getMundo() {
		return miMundo;
	}

	public void colocarBarcosAutomatico(Barco[] listaBarcos) {
		int f, c, d;
		Direccion direc;
		for (int i = 0; i < listaBarcos.length; i++) {
			do {
				f = (int) (Math.random() * miMundo.getFilas());
				c = (int) (Math.random() * miMundo.getColumnas());
				d = (int) (Math.random() * Direccion.values().length);
				direc = Direccion.values()[d];
			} while (!miMundo.colocarBarco(f, c, direc, listaBarcos[i]));
		}
	}

	public Estado disparar(Mundo m) {
		Estado e;
		int f = (int) (Math.random() * m.getFilas());
		int c = (int) (Math.random() * m.getColumnas());
		e = m.recibeDisparo(f, c);
		return e;
	}
}
