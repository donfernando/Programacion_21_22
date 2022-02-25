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
		for (int c = 0; c < numColumnas(); c++) {
			suma = 0;
			for (int f = 0; f < numFilas(); f++) {
				if (get(f, c) != null)
					suma += get(f, c);
			}
			resultado[c] = suma;
		}
		return resultado;
	}

	public Double[] subTotalFilas() {
		double suma;
		Double[] resultado = new Double[numFilas()];
		for (int f = 0; f < numFilas(); f++) {
			suma = 0;
			for (int c = 0; c < numColumnas(); c++) {
				if (get(f, c) != null)
					suma += get(f, c);
			}
			resultado[f] = suma;
		}
		return resultado;
	}

	public Double total() {
		Double resultado = 0.0;
		Double[] totalFilas = subTotalFilas();

		for (int i = 0; i < totalFilas.length; i++)
			resultado += totalFilas[i];

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
			s=String.format("%"+anchoCol+"." + decimales + "f | ", dato);
		else
			s=String.format("%"+anchoCol+"f | ", dato);
		return s;
	}
}