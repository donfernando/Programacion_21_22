package pq4.ficheros;

import java.awt.Point;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CreaFicheroPiezasBinarioDesdeFichTexto_v1 {

	public static void main(String[] args) throws IOException {
		//FileReader entrada = new FileReader("misFicheros/piezas_retornoAOS.txt",Charset.forName("UTF-8"));
		//FileReader entrada = new FileReader("misFicheros/piezas_retornoWin.txt",Charset.forName("UTF-8"));
		FileReader entrada = new FileReader("misFicheros/piezas.txt",Charset.forName("UTF-8"));
		FileOutputStream salida;
		char letra;
		int iLetra;
		int i;
		boolean acaboDePasarLinea = false;
		int fila = 0, columna = 0;

		ArrayList<Character> caracteres = new ArrayList<>(64);
		ArrayList<Point> puntos = new ArrayList<>(64);
		
		iLetra = entrada.read();
		while (iLetra!=-1) {
			letra=(char)iLetra;
			if (letra != '\n' & letra != '\r') {
					if (letra != '·') {
						caracteres.add(letra);
						puntos.add(new Point(fila, columna));
					}
					columna++;
					acaboDePasarLinea=false;
			} else {
				if(acaboDePasarLinea)
					acaboDePasarLinea=false;
				else {
					fila++;
					columna = 0;
					acaboDePasarLinea=true;
				}
			}
			iLetra = entrada.read();
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
