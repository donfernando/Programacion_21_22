package pq6.objetos;

import java.awt.Point;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CreaFicheroPiezasBinarioDesdeFichTexto {

	public static void main(String[] args) {
		String linea;
		int i;
		int fila = 0, columna;

		ArrayList<Character> caracteres = new ArrayList<>(64);
		ArrayList<Point> puntos = new ArrayList<>(64);

		try (BufferedReader entrada = new BufferedReader(
			new FileReader("misFicheros/piezas.txt", Charset.forName("UTF-8")))) {
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
			entrada.close();
		} catch (IOException e) {
			System.err.println("Problemas en la lectura del fichero...");
		}

		
		// Volcar datos en forma de Objetos
		
		try (ObjectOutputStream salida = new ObjectOutputStream(
				new FileOutputStream("misFicheros/piezas.obj"))) {
			salida.writeObject(caracteres);
			salida.writeObject(puntos);
			salida.close();
		} 
		catch (IOException e) {	
			System.err.println("Problemas en la escritura del fichero...");
		}
	}
}
