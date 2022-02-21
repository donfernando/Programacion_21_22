package dpm.bloque5.contenedores;

public class TableroCuadrado<T> extends Tablero<T> {
	public TableroCuadrado(int tam) {
		super(tam,tam);
	}

	// TODO
	public int elementosEnDiagonal() {
		int contador = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i][i] != null) {
				contador = contador + 1;
			}
		}
		return contador;
	}

	public int elementosEnDiagonalSecundaria() {
		int contador = 0;
		int fila = 0;
		for (int columna = numColumnas() - 1; columna >= 0; columna--) {
			if (datos[fila][columna] != null) {
//			if (datos[numFilas()-1-columna][columna] != null) {
				contador = contador + 1;
			}
			fila = fila + 1;
		}
		return contador;
	}
}