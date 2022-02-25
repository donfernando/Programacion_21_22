package juego.flota;

public class Yate extends Barco{
	public Yate() {
		super(1);
	}
	@Override
	public String toString() {
		return "Yate";
	}
	@Override
	public char letra() {
		return 'Y';
	}
	
}
