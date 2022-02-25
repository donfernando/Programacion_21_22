package juego.base;

import juego.flota.Barco; 

public class Mundo {
	public static enum Direccion {HORIZONTAL,VERTICAL, DIAGONAL};
	public final static int TAMANIO = 10;
	Barco[][] tablero= new Barco[TAMANIO][TAMANIO];
	
	public Mundo() {

		
	}
	
	
}
