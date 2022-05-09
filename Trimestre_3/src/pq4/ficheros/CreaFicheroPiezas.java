package pq4.ficheros;

import java.io.*;

public class CreaFicheroPiezas {

	public static void main(String[] args) throws IOException {
		final int N_FICH = 2;
		FileOutputStream fos = new FileOutputStream("piezas.dat");
		fos.write(N_FICH);
		// Ficha 1
		fos.write('T');
		fos.write(7);
		fos.write(7);
		// Ficha 2
		fos.write('p');
		fos.write(4);
		fos.write(2);
		fos.close();
	}

}
