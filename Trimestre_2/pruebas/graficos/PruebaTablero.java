package graficos;

import dpm.bloque5.contenedores.Tablero;

public class PruebaTablero {

	public static void main(String[] args) {
		Tablero t = new Tablero(5,5);
		System.out.println(t);
		t.set(0,1, "2");
		System.out.println(t);
	}

}
