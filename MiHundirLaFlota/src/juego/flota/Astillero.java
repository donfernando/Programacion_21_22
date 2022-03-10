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
	
	public static Barco[] getNuevaFlota(AbsAstillero miFactoria) {
		Barco[] listaBarcos = { new Acorazado(), new Transatlantico(), new Transatlantico(), new Submarino(),
				new Submarino(), new Submarino(), new Yate(), new Yate(), new Yate(), new Yate() };
		return listaBarcos;
	}
	
	
}
