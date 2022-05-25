package pq6.objetos;

import java.awt.Point;
import java.io.*;
import java.util.ArrayList;

public class MuestraTableroObjetosPieza {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("misFicheros/objetosPieza.obj");
		ObjectInputStream entrada = new ObjectInputStream(in);
		int f,c;
		ArrayList<Pieza> piezas;
		char[][] tablero = new char[8][8];
		piezas = (ArrayList<Pieza>)entrada.readObject();
		entrada.close();
		for (int i = 0; i < piezas.size(); i++) {
			tablero[piezas.get(i).getFila()][piezas.get(i).getColumna()]=
					piezas.get(i).getLetra();
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
