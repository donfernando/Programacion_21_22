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
		Humano jBlasa = new Humano("BLASA");
		Jugador jHal = new Jugador("HAL");
		
		jBlasa.colocarBarcosAutomatico(Astillero.getNuevaFlota());
//		Consola.consola().colocarBarcosInteracivo(jJhonny.getMundo(),
//											MiAstillero.getNuevaFlota());
		
		jHal.colocarBarcosAutomatico(Astillero.getNuevaFlota());
		Consola.consola().mensaje("Tablero de "+jBlasa.getNombre());
		Consola.consola().desvelarMundo(jBlasa.getMundo());
		Consola.consola().mensaje("Tablero de "+jHal.getNombre());
		Consola.consola().visualizarMundo(jHal.getMundo());

		do {
			do {
//				e=jBlasa.disparar(jHal.getMundo());
				e=jBlasa.disparar(jHal.getMundo(),
						Consola.consola().leerCoordenadas("A dónde disparas...",jHal.getMundo().getFilas()));
			} while(e.equals(Estado.YADISPARADO));
			Consola.consola().mensaje(jBlasa.getNombre() + " ha hecho... " + e);
			do {
			e=jHal.disparar(jBlasa.getMundo());
			} while(e.equals(Estado.YADISPARADO));
			Consola.consola().mensaje(jHal.getNombre() + " ha hecho... " + e);
			Consola.consola().mensaje("Tablero de "+jBlasa.getNombre());
			Consola.consola().desvelarMundo(jBlasa.getMundo());
			Consola.consola().mensaje("Tablero de "+jHal.getNombre());
			Consola.consola().visualizarMundo(jHal.getMundo());
		} while (jBlasa.getMundo().quedanBarcos() && jHal.getMundo().quedanBarcos());
		if(jBlasa.getMundo().quedanBarcos())
			Consola.consola().mensaje("Gana: "+jBlasa.getNombre()+" !!!");
		else if(jHal.getMundo().quedanBarcos())
			Consola.consola().mensaje("Gana: "+jHal.getNombre()+" !!!");
		else
			Consola.consola().mensaje("Empate !!! ");
	}
}
