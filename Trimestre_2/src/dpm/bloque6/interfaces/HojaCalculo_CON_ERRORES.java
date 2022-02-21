package dpm.bloque6.interfaces;

import java.util.Random;
import dpm.bloque5.contenedores.Tablero;

public class HojaCalculo_CON_ERRORES extends Tablero<Double> {
	public static int decimales = 2;

	public HojaCalculo_CON_ERRORES(int filas, int columnas) {
		super(filas, columnas);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				set(i, j, (Double) 0.0);
			}
		}
	}

	public void rellenarAleatorio() {
		for (int i = 0; i < numFilas(); i++) {
			for (int j = 0; j < numColumnas(); j++) {
				Random a = new Random();
				set(i, j, (a.nextDouble() * 10));
			}
		}
	}

	public double[] subTotalColumnas() {
		double sum;
//		Double[] t = datos[0];
//		int tam = t.length;
		double[] subtablacol = new double[numColumnas()];
		for (int c = 0; c < subtablacol.length; c++) {
			sum = 0.0;
			for (int f = 0; f < numFilas(); f++) {
				sum += (Double)get(f, c);
			}
			subtablacol[c] = sum;
		}

		return subtablacol;
	}

	public Double[] subTotalFilas() {
		double sum;
		Double[] subtablafil = new Double[numFilas()];
		for (int f = 0; f < subtablafil.length; f++) {
			sum = 0.0;
			for (int c = 0; c < numColumnas(); c++) {
				sum += (Double)get(f, c);
			}
			subtablafil[f] = sum;
		}
		return subtablafil;
	}

	public Double total() {
		Double sum = 0.0;
		for (int i = 0; i < numFilas(); i++) {
			for (int j = 0; j < numColumnas(); j++) {
				sum += (Double)get(i, j);
			}
		}
		return sum;
	}

	@Override
	public String toString() {
		String s = "";
		int f, c;
		for (f = 0; f < numFilas(); f++) {
			s += "| ";
			for (c = 0; c < numColumnas() - 1; c++) {
				s += String.format("%." + decimales + "f%s", get(f,c), " | ");
			}
			s += String.format("%." + decimales + "f%s", get(f,c), " |\n");
		}
// String tabla = "| ";
// for (int i = 0; i < subTotalColumnas().length; i++) {
// double tab = subTotalColumnas()[i];
// tabla += String.format("%." + decimales + "f%s ", tab, " |");
// }
//
// String tabla2 = "| ";
// for (int i = 0; i < subTotalFilas().length; i++) {
// double tab = subTotalFilas()[i];
// tabla2 += String.format("%." + decimales + "f%s ", tab, " |");
// }
// s += String.format("\nSubtotal Columnas: " + tabla);
// s += String.format("\nSubtotal Filas: " + tabla2);
// s += String.format("\nSuma total de los números del tablero: %." + decimales + "f", total());

		return s;
	}
}