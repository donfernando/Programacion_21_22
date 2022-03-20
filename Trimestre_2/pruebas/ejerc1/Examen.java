package ejerc1;

import java.awt.Point;

public class Examen {
	public static double[][] getZona(Point p1, Point p2, double[][] tabla) throws IndicesNoValidosException {
		double[][] tablaSecundaria;
		int difX = p2.x - p1.x, difY = p2.y - p1.y;
		if (p1.x < 0 | p1.y < 0 | p2.x < 0 | p2.y < 0 | p1.x >= tabla.length | p1.y >= tabla[0].length
				| p2.x >= tabla.length | p2.y >= tabla[0].length)
			throw new IndicesNoValidosException();

		if (p2.x < p1.x) {
			difX = difX * -1;
		}
		if (p2.y < p1.y) {
			difY = difY * -1;
		}

		tablaSecundaria = new double[(difX) + 1][(difY) + 1];
		int desdeFila, hastaFila, desdeColumna, hastaColumna;

		if (p2.x < p1.x) {
			desdeFila = p2.x;
			hastaFila = p1.x;
		} else {
			desdeFila = p1.x;
			hastaFila = p2.x;
		}

		if (p2.y < p1.y) {
			desdeColumna = p2.y;
			hastaColumna = p1.y;
		} else {
			desdeColumna = p1.y;
			hastaColumna = p2.y;
		}

		for (int i = desdeFila, i2 = 0; i <= hastaFila; i++, i2++) {
			for (int j = desdeColumna, j2 = 0; j <= hastaColumna; j++, j2++) {
				tablaSecundaria[i2][j2] = tabla[i][j];
			}
		}

		return tablaSecundaria;
	}
}
