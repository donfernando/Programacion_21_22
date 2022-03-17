package miJuego;

import juego.flota.AbsAstillero;
import juego.flota.Astillero;
import juego.flota.Barco;

public class MiAstillero extends Astillero{

	
	
	@Override
	public Barco crearBarco(char tipo) {
		if(tipo == 'C')
			return new Crucero();
		else
			return super.crearBarco(tipo);
	}
	
	public static Barco[] getNuevaFlota() {
		int i;
		AbsAstillero astillero = new MiAstillero();

		Barco[] listaBarcos = new Barco[3];
		for (i = 0; i < 2 ; i++) {
			listaBarcos[i] = astillero.crearBarco('S');
		}
		for (; i < 3 ; i++) {
			//listaBarcos[i]= new Yate();
			listaBarcos[i] = astillero.crearBarco('C');
		}
		
		return listaBarcos;
	}
		
	
}
