package pq4.ficheros;

import java.io.*;

public class MuestraTableroPiezas {
	public static void main(String[] args) throws IOException {
		FileInputStream entrada = new FileInputStream("misFicheros/piezas.dat");
		char ficha;
		int f,c;
		char[][] tablero = new char[8][8];
		int numFichas = entrada.read();
		while (numFichas != 0) {
			ficha = (char) entrada.read();
			f=entrada.read();
			c=entrada.read();
			tablero[f][c] = ficha;
			numFichas--;
		}
		entrada.close();
		
		for (f = 0; f < tablero.length; f++) {
			for (c = 0; c < tablero[0].length; c++) {
				if (tablero[f][c] == 0) {
					tablero[f][c] = '·';
				}
				System.out.print(tablero[f][c]);
			}
			System.out.println();
		}
	}

}
