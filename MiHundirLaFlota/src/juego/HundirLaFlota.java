package juego;

import juego.base.Humano;
import juego.base.Jugador;
import juego.base.Mundo.Estado;

public class HundirLaFlota {
	public static void main(String[] args) {
		Estado e;		
		Humano jJhonny = new Humano("Juanito");
		Jugador jComputer = new Jugador("HAL");

		jJhonny.colocarBarcosAutomatico();
		
		Consola.consola().mensaje("Tablero de "+jJhonny.getNombre());
		Consola.consola().desvelarMundo(jJhonny.getMundo());

		jComputer.colocarBarcosAutomatico();		
		do {
			Consola.consola().mensaje("Tablero de "+jComputer.getNombre());
			Consola.consola().desvelarMundo(jComputer.getMundo());
//			p = Consola.consola().leerCoordenadas("Posicion de disparo: ");
//			e=jJhonny.disparar(jComputer.getMundo(),p);
			e=jJhonny.disparar(jComputer.getMundo());
			Consola.consola().mensaje(jJhonny.getNombre() + " ha hecho... " + e.toString());
		} while (!e.equals(Estado.AGUA) && jComputer.getMundo().quedanBarcos());

		Consola.consola().mensaje("Tablero de "+jComputer.getNombre());
		Consola.consola().desvelarMundo(jComputer.getMundo());
		
		
		
		
		
	}
}
