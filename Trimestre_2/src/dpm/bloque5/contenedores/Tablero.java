package dpm.bloque5.contenedores;

public class Tablero<T> {
	protected T[][] datos;
	public static int ANCHO_CASILLAS = 6;

	public Tablero(int filas, int columnas) {
		if (filas < 1 | columnas < 1)
			throw new TableroException("El Tablero debe tener al menos una casilla");
		datos = (T[][]) new Object[filas][columnas];
	}

	public T get(int f, int c) {
		return datos[f][c];
	}

	public void set(int f, int c, T obj) {
		datos[f][c] = obj;
	}

	public int numFilas() {
		return datos.length;
	}

	public int numColumnas() {
		return datos[0].length;
	}

	@Override
	public String toString() {
		String s = "";
		int f, c;
		for (f = 0; f < datos.length; f++) {
			s += "| ";
			for (c = 0; c < datos[f].length - 1; c++) {
				s += String.format("%" + ANCHO_CASILLAS + "s%s", datos[f][c], " | ");
			}
			s += String.format("%" + ANCHO_CASILLAS + "s%s", datos[f][c], " |\n");
		}
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		int f, c;
		if (this == obj)
			return true;
		// else
//		if(obj.getClass().getName().equals("Tablero")) {
		if (obj instanceof Tablero) {
			Tablero elOtro = (Tablero) obj;
			if (this.datos.length == elOtro.datos.length && this.datos[0].length == elOtro.datos[0].length) {
				for (f = 0; f < datos.length; f++) {
					for (c = 0; c < datos[f].length; c++) {
						if (datos[f][c] == null) {
							if (elOtro.datos[f][c] != null)
								return false;

						} else if (!datos[f][c].equals(elOtro.datos[f][c]))
							return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean disponible(int f, int c) {
		boolean disponible = true;
		if (!dentroTablero(f, c))
			throw new IndexOutOfBoundsException();

		for (int i = f - 1; i <= f + 1 && disponible; i++) {
			for (int j = c - 1; j <= c + 1 && disponible; j++) {
				if (dentroTablero(i, j) && datos[i][j] != null)
					disponible = false;
			}
		}
		return disponible;
	}

	private boolean dentroTablero(int f, int c) {
		return (f >= 0 && f < datos.length && c >= 0 && c < datos[0].length);
	}

//	public boolean disponible(int fila, int col) {
//		int i, j;
//		boolean disponible = true;
//		if (!dentroTablero(fila, col))
//			throw new IndexOutOfBoundsException(
//					"La fila o la columna proporcionada" + " esta fuera del rango de la matriz.");
//		int filaAnt = 0, filaPost = numFilas() - 1;
//		int columnaAnt = 0, columnaPost = numColumnas() - 1;
//		if (fila > 0)
//			filaAnt = fila - 1;
//		if (fila < numFilas() - 1)
//			filaPost = fila + 1;
//		if (col > 0)
//			columnaAnt = col - 1;
//		if (col < numFilas() - 1)
//			columnaPost = col + 1;
//
//		for (i = filaAnt; i <= filaPost && disponible; i++) {
//			for (j = columnaAnt; j <= columnaPost && disponible; j++) {
//				if (get(i, j) != null)
//					disponible = false;
//			}
//		}
//		return disponible;
//	}

}
