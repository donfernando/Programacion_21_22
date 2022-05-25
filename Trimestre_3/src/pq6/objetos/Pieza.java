package pq6.objetos;

//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pieza implements Serializable {
	private static final long serialVersionUID = 1L;

	private char letra;
	private byte fila, columna;

	public Pieza(char l, int f, int c) {
		letra = l;
		fila = (byte) f;
		columna = (byte) c;
	}
	public char getLetra() {
		return letra;
	}
	public int getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}

	@Override
	public String toString() {
		return "pieza:"+letra+"("+fila+','+columna+")\n";
	}
/*	
	private void writeObject(ObjectOutputStream out) throws IOException {
//		out.defaultWriteObject();
		out.write(letra);
		int filaCol;
		filaCol=(fila<<4)|columna;
		out.write(filaCol);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//		in.defaultReadObject();
		letra = (char)in.read();
		int filaCol=in.read();
		fila = (byte)(filaCol>>>4);
		columna = (byte)(filaCol & 0x0F);
	}
*/
}
