package juego.flota;

public class Submarino extends Barco{
	public Submarino() {
		super(2);
	}
	@Override
	public String toString() {
		return "Submarino";
	}
	@Override
	public char letra() {
		return 'S';
	}

}
