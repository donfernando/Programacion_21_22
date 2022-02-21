package dpm.bloque6.interfaces;

import java.util.Random;
import dpm.bloque5.contenedores.Tablero;

public class HojaCalculo extends Tablero<Double> {
	public static int decimales = 2;
	public static int anchoCol = 6;

	public HojaCalculo(int filas, int columnas) {
		super(filas, columnas);
	}

	public void rellenarAleatorio() {
		for (int i = 0; i < numFilas(); i++) {
			for (int j = 0; j < numColumnas(); j++) {
				Random a = new Random();
				set(i, j, (a.nextDouble() * 10));
			}
		}
	}

	public Double[] subTotalColumnas() {
		double suma;
		Double[] resultado = new Double[numColumnas()];
		for (int j = 0; j < numColumnas(); j++) {
			suma = 0;
			for (int i = 0; i < numFilas(); i++) {
				if (get(i, j) != null)
					suma += get(i, j);
			}
			resultado[j] = suma;
		}
		return resultado;
	}

	public Double[] subTotalFilas() {
		double suma;
		Double[] resultado = new Double[numFilas()];
		for (int i = 0; i < numFilas(); i++) {
			suma = 0;
			for (int j = 0; j < numColumnas(); j++) {
				if (get(i, j) != null)
					suma += get(i, j);
			}
			resultado[i] = suma;
		}
		return resultado;
	}

	public Double total() {
		Double resultado = 0.0;
		Double[] totalFilas = subTotalFilas();
//		Double[] totalColumnas = subTotalColumnas();

		for (int i = 0; i < totalFilas.length; i++)
			resultado += totalFilas[i];

		
//		for (int i = 0; i < totalColumnas.length; i++)
//			resultado += totalColumnas[i];

		return resultado;
	}

	@Override
	public String toString() {
		String s = "";
		int f, c;
		for (f = 0; f < numFilas(); f++) {
			s += "| ";
			for (c = 0; c < numColumnas() - 1; c++) {
				s += formatea(get(f,c));

			}
			s += formatea(get(f,c))+"\n";
		}
		return s;
	}
		
	private String formatea(Double dato) {
		String s;
		if(dato!=null)
			s=String.format("%"+anchoCol+"." + decimales + "f%s", dato, " | ");
		else
			s=String.format("%"+anchoCol+"f%s", dato, " | ");
		return s;
	}
}