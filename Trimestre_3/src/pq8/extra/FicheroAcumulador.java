package pq8.extra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FicheroAcumulador {
	public static void main(String[] args) {
		double total=0.0;
		try(BufferedReader bf = new BufferedReader(new FileReader("misFicheros/operaciones.txt"))) {
			String linea = bf.readLine();
			while (linea != null) {
				linea = linea.toLowerCase();
				switch(linea) {
				case "acumula":
					linea = bf.readLine();
					// Presuponemos que si hay comando habrá una línea de operandos
					if (linea.length()!=0) {
						Scanner lIn = new Scanner(linea);
						while(lIn.hasNext()) {
							try {
								total += lIn.nextDouble();
							} catch (InputMismatchException e) {
								lIn.next();
							}
						}
						lIn.close();
					}
					break;
				case "inicia":
					linea = bf.readLine();
					linea = linea.trim();
					if (linea.length()!=0) {
						try {
							total = Double.parseDouble(linea);
						} catch (NumberFormatException e) {
						}
					}					
				}
				System.err.println("Valor: "+total);
				linea = bf.readLine();
			}			
			System.out.println("Total: "+total);
			bf.close();
		} catch (IOException e) {
			System.err.println("Problemas con la entrada de datos...\n"+e);
		}

	}
}