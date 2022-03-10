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
	
	public static Barco[] getNuevaFlota(AbsAstillero miFactoria) {
		int i;
		Barco[] listaBarcos = new Barco[8];
		for (i = 0; i < 3 ; i++) {
			listaBarcos[i] = miFactoria.crearBarco('C');
		}
		for (; i < 8 ; i++) {
			//listaBarcos[i]= new Yate();
			listaBarcos[i] = miFactoria.crearBarco('Y');
		}
		
		return listaBarcos;
	}
		
	
}
