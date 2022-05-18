package pq6.objetos;

import java.awt.Point;
import java.io.*;
import java.util.ArrayList;

public class MuestraTableroPiezas {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("misFicheros/piezas.obj");
		ObjectInputStream entrada = new ObjectInputStream(in);
		int f,c;
		ArrayList<Character> caracteres;
		ArrayList<Point> puntos;
		char[][] tablero = new char[8][8];
		caracteres = (ArrayList<Character>)entrada.readObject();
		puntos = (ArrayList<Point>)entrada.readObject();
		entrada.close();
		for (int i = 0; i < caracteres.size(); i++) {
			tablero[puntos.get(i).x][puntos.get(i).y]= caracteres.get(i);
			
		}
		
		for (f = 0; f < tablero.length; f++) {
			for (c = 0; c < tablero[0].length; c++) {
				if (tablero[f][c] == 0) {
					tablero[f][c] = '·';
				}
				System.out.print(tablero[f][c]);
			}
			System.out.println();
		}
	}

}
