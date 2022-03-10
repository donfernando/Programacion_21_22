package juego;

import java.awt.Point;

import juego.base.Humano;
import juego.base.Jugador;
import juego.base.Mundo.Estado;
import juego.flota.AbsAstillero;
import juego.flota.Astillero;
import juego.flota.Barco;
import juego.flota.Submarino;
import juego.flota.Yate;
import miJuego.MiAstillero;

public class HundirLaFlota {
	
	
	public static void main(String[] args) {
		Estado e;		
		Jugador jug_01 = new Humano("BLASA");
		Jugador jug_02 = new Jugador("HAL");
		Point p;
		
		jug_01.colocarBarcosAutomatico(Astillero.getNuevaFlota(new MiAstillero()));
//		Consola.consola().colocarBarcosInteracivo(jJhonny.getMundo(),
//											MiAstillero.getNuevaFlota(new MiAstillero()));
		
		jug_02.colocarBarcosAutomatico(Astillero.getNuevaFlota(new MiAstillero()));
		Consola.consola().mensaje("Tablero de "+jug_01.getNombre());
		Consola.consola().desvelarMundo(jug_01.getMundo());
		Consola.consola().mensaje("Tablero de "+jug_02.getNombre());
		Consola.consola().desvelarMundo(jug_02.getMundo());

		do {
			do {
				e=jug_01.disparar(jug_02.getMundo());
			} while(e.equals(Estado.YADISPARADO));
			Consola.consola().mensaje(jug_01.getNombre() + " ha hecho... " + e);
			do {
			e=jug_02.disparar(jug_01.getMundo());
			} while(e.equals(Estado.YADISPARADO));
			Consola.consola().mensaje(jug_02.getNombre() + " ha hecho... " + e);
			Consola.consola().mensaje("Tablero de "+jug_01.getNombre());
			Consola.consola().desvelarMundo(jug_01.getMundo());
			Consola.consola().mensaje("Tablero de "+jug_02.getNombre());
			Consola.consola().desvelarMundo(jug_02.getMundo());
		} while (jug_01.getMundo().quedanBarcos() && jug_02.getMundo().quedanBarcos());
	}
}
