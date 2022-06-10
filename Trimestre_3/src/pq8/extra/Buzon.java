package pq8.extra;

public class Buzon {

	private static Buzon buzon;
	Object[][] casillas = new Object[TAMANIO][TAMANIO];
	final static int TAMANIO = 10;

	private Buzon() { // privado para que no se puede acceder

	}

	public static Buzon getBuzon() {
		if (buzon == null) {
			buzon = new Buzon();
		} // Modelo de singleton
		return buzon; // Se ejecuta solo si no existe un buzón
	}

	public Object get(int f, int c) {
		return casillas[f][c];
	}

	public void set(int f, int c, Object o) {
		if (casillas[f][c] != null) {
			throw new BuzonRuntimeException();
		} else {
			casillas[f][c] = o;
		}
	}
}