package juego.flota;

public class Transatlantico extends Barco{
	public Transatlantico() {
		super(3);
	}
	@Override
	public String toString() {
		return "Transatlántico";
	}
	@Override
	public char letra() {
		return 'T';
	}

}
