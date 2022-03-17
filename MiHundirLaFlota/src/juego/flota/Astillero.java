package juego.flota;

public class Astillero extends AbsAstillero {

	@Override
	public Barco crearBarco(char tipo) {
		Barco b;
		switch (tipo) {
		case 'A':
			b = new Acorazado();
			break;
		case 'Y':
			b = new Yate();
			break;
		case 'S':
			b = new Submarino();
			break;
		case 'T':
			b = new Transatlantico();
			break;
		default:
			b = null;
		}
		return b;
	}
	
	public static Barco[] getNuevaFlota() {
		AbsAstillero astillero = new Astillero();
		Barco[] listaBarcos = {
//				new Acorazado(), 
//				new Transatlantico(), 
				astillero.crearBarco('A'),
				astillero.crearBarco('T'),
				astillero.crearBarco('S'),
//				astillero.crearBarco('Y'),
				};
		return listaBarcos;
	}
	
	
}
