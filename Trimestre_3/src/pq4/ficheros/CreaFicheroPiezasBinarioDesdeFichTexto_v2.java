package pq4.ficheros;

import java.awt.Point;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CreaFicheroPiezasBinarioDesdeFichTexto_v2 {

	public static void main(String[] args) throws IOException {
		//FileReader in = new FileReader("misFicheros/piezas.txt",Charset.forName("UTF-8"));
		FileReader in = new FileReader("misFicheros/piezas_retornoAO.txt",Charset.forName("UTF-8"));
		BufferedReader entrada = new BufferedReader(in);
		FileOutputStream salida;
		String linea;
		int i;
		int fila = 0, columna;

		ArrayList<Character> caracteres = new ArrayList<>(64);
		ArrayList<Point> puntos = new ArrayList<>(64);
		
		linea = entrada.readLine();
		while (linea != null) {
			for (columna = 0; columna < linea.length(); columna++) {
				if(linea.charAt(columna)!='·') {
					caracteres.add(linea.charAt(columna));
					puntos.add(new Point(fila, columna));
				}
			}
			fila++;
			linea = entrada.readLine();
		}
		entrada.close();
		int numFichas = caracteres.size();
		
		salida = new FileOutputStream("misFicheros/piezas2.dat");
		salida.write(numFichas);
		for (i = 0; i < numFichas; i++) {
			salida.write(caracteres.get(i));
			salida.write(puntos.get(i).x);
			salida.write(puntos.get(i).y);
		}
		salida.close();
	}
}
