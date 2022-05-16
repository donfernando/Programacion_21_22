package pq4.ficheros;

import java.awt.Point;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CreaFicheroPiezasBinarioDesdeFichTexto_final {

	public static void main(String[] args) {
		String linea;
		int i;
		int fila = 0, columna;

		ArrayList<Character> caracteres = new ArrayList<>(64);
		ArrayList<Point> puntos = new ArrayList<>(64);

		try (BufferedReader entrada = new BufferedReader(
			new FileReader("misFicheros/piezas_retornoAOS.txt", Charset.forName("UTF-8")))) {
			linea = entrada.readLine();
			while (linea != null) {
				for (columna = 0; columna < linea.length(); columna++) {
					if (linea.charAt(columna) != '·') {
						caracteres.add(linea.charAt(columna));
						puntos.add(new Point(fila, columna));
					}
				}
				fila++;
				linea = entrada.readLine();
			}
		} catch (IOException e) {
			System.err.println("Problemas en la lectura del fichero...");
		}

		int numFichas = caracteres.size();
		try (FileOutputStream salida = new FileOutputStream("misFicheros/piezas2.dat")) {
			salida.write(numFichas);
			for (i = 0; i < numFichas; i++) {
				salida.write(caracteres.get(i));
				salida.write(puntos.get(i).x);
				salida.write(puntos.get(i).y);
			}
		} 
		catch (IOException e) {	
			System.err.println("Problemas en la escritura del fichero...");

		}
	}
}
