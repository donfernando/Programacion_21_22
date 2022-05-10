package pq4.ficheros;

import java.awt.Point;
import java.io.*;
import java.util.ArrayList;

public class CreaFicheroPiezasBinarioDesdeFichTexto {

	public static void main(String[] args) throws IOException {
		FileReader entrada = new FileReader("misFicheros/piezas.txt");
		FileOutputStream salida;

		ArrayList<Character> caracteres = new ArrayList<>();
		ArrayList<Point> puntos = new ArrayList<>();

		char letra;
		int iLetra;
		int fila = 0, columna = 0;
		iLetra = entrada.read();
		while (iLetra!=-1) {
			letra=(char)iLetra;
			if (letra != '\n') {
				if (letra != '\r') {
					if (letra != '·') {
						caracteres.add(letra);
						puntos.add(new Point(fila, columna));
					}
					columna++;
				}

			} else {
				fila++;
				columna = 0;
			}
			iLetra = entrada.read();
		}
		entrada.close();
		int numFichas = caracteres.size();
		
		salida = new FileOutputStream("misFicheros/piezas2.dat");
		salida.write(numFichas);
		for (fila = 0; fila < numFichas; fila++) {
			salida.write(caracteres.get(fila));
			salida.write(puntos.get(fila).x);
			salida.write(puntos.get(fila).y);
		}
		salida.close();
	}
}
