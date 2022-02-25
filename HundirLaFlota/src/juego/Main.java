package juego;

import juego.base.Mundo;
import juego.base.Mundo.Direccion;
import juego.flota.Acorazado;
import juego.flota.Submarino;
import juego.flota.Transatlantico;

public class Main {

	public static void main(String[] args) {
		Mundo m = new Mundo();
		
		Direccion d = Direccion.HORIZONTAL;

		System.out.println(Direccion.values().length);
	}

}
