package juego.flota;

public class Acorazado extends Barco{
	public Acorazado() {
		super(4);
	}
	@Override
	public String toString() {
		return "Acorazado";
	}
	@Override
	public char letra() {
		return 'A';
	}
	
}