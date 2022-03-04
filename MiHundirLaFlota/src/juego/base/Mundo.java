package juego.base;

import java.awt.Point;

import juego.flota.Barco;

public class Mundo {
	public static enum Direccion {
		HORIZONTAL, VERTICAL, DIAGONAL
	};

	public static enum Estado {
		TOCADO, HUNDIDO, AGUA, YADISPARADO, GAMEOVER
	};

	private final static int TAMANIO = 10;
	private Barco[][] tablero = new Barco[TAMANIO][TAMANIO];
	private boolean[][] disparos = new boolean[TAMANIO][TAMANIO];
	private int casillaConBarco=0;
	public int getFilas() {
		return tablero.length;
	}

	public int getColumnas() {
		return tablero[0].length;
	}

	public Barco getBarco(int f, int c) {
		return tablero[f][c];
	}
	public boolean getDisparo(int f, int c) {
		return disparos[f][c];
	}

	public boolean quedanBarcos() {
		return casillaConBarco!=0;
	}
	
	public Estado recibeDisparo(int f, int c) {
		Estado r;
		if (disparos[f][c])
			r = Estado.YADISPARADO;
		else {
			disparos[f][c] = true;
			if (tablero[f][c] == null)
				r = Estado.AGUA;
			else {
				r = tablero[f][c].tocado();
				casillaConBarco--;
			}
		}
		return r;
	}

	public boolean colocarBarco(int f, int c, Direccion d, Barco b) {
		Point desplazamiento;
		int posParaRevisar;
		int posF, posC;
		int i;

		if (d.equals(Direccion.HORIZONTAL))
			desplazamiento = new Point(0, 1);
		else if (d.equals(Direccion.VERTICAL))
			desplazamiento = new Point(1, 0);
		else
			desplazamiento = new Point(1, 1);

		posParaRevisar = b.getTamanio();
		posF = f;
		posC = c;
		while (posParaRevisar > 1 && posicionDisponible(posF, posC)) {
			posParaRevisar--;
			posF += desplazamiento.x;
			posC += desplazamiento.y;
		}

		if (posicionDisponible(posF, posC)) {
			i = 0;
			do {
				casillaConBarco++;
				tablero[f][c] = b;
				f += desplazamiento.x;
				c += desplazamiento.y;
				i++;
			} while (i < b.getTamanio());
			return true;
		}
		return false;
	}

	private boolean dentroTablero(int f, int c) {
		return (f >= 0 && f < tablero.length && c >= 0 && c < tablero[0].length);
	}

	private boolean posicionDisponible(int fila, int col) {
		int f, c;
		boolean disponible = true;
		if (!dentroTablero(fila, col))
			disponible = false;
		else {
			// Acotar zona que debe estar libre de barcos
			int filaAnt, filaPost;
			int columnaAnt, columnaPost;
			if (fila > 0)
				filaAnt = fila - 1;
			else
				filaAnt = 0;

			if (fila < tablero.length - 1)
				filaPost = fila + 1;
			else
				filaPost = tablero.length - 1;

			if (col > 0)
				columnaAnt = col - 1;
			else
				columnaAnt = 0;
			if (col < tablero[0].length - 1)
				columnaPost = col + 1;
			else
				columnaPost = tablero[0].length - 1;

			for (f = filaAnt; f <= filaPost && disponible; f++) {
				for (c = columnaAnt; c <= columnaPost && disponible; c++) {
					if (tablero[f][c] != null)
						disponible = false;
				}
			}
		}
		return disponible;
	}

	public Estado estado(int f, int c) {
		return Estado.AGUA;
	}
}
