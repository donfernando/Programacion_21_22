package dpm.bloque5.contenedores;

public class Tablero<T> {
	protected T [][] datos;
	public static int ANCHO_CASILLAS = 6;
	public Tablero(int filas, int columnas) {
		if(filas < 1 | columnas <1)
			throw new TableroException("El Tablero debe tener al menos una casilla");
		datos = (T[][])new Object[filas][columnas];
	}
	
	public T get(int f, int c) {
		return datos[f][c];
	}
	public void set(int f, int c, T obj) {
		datos[f][c]=obj;
	}
	
	public int numFilas() {
		return datos.length;
	}
	
	public int numColumnas() {
		return datos[0].length;
	}
	
	@Override
	public String toString() {
		String s="";
		int f,c;
		for (f = 0; f < datos.length; f++) {
			s += "| ";
			for (c = 0; c < datos[f].length-1; c++) {
				s += String.format("%"+ANCHO_CASILLAS+"s%s", datos[f][c]," | ");
			}
			s += String.format("%"+ANCHO_CASILLAS+"s%s", datos[f][c]," |\n");
		}
		return s;
	}
}
