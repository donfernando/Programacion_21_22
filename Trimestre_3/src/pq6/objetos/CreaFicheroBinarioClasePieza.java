package pq6.objetos;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CreaFicheroBinarioClasePieza {

	public static void main(String[] args) {
		String linea;
		int fila = 0, columna;

		ArrayList<Pieza> piezas = new ArrayList<>(64);

		try (BufferedReader entrada = new BufferedReader(
			new FileReader("misFicheros/piezas.txt", Charset.forName("UTF-8")))) {
			linea = entrada.readLine();
			while (linea != null) {
				for (columna = 0; columna < linea.length(); columna++) {
					if (linea.charAt(columna) != '·') {
						piezas.add(new Pieza(linea.charAt(columna),fila, columna));
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
				new FileOutputStream("misFicheros/objetosPieza.obj"))) {
			salida.writeObject(piezas);
			salida.close();
		} 
		catch (IOException e) {	
			System.err.println("Problemas en la escritura del fichero...");
		}
	}
}
