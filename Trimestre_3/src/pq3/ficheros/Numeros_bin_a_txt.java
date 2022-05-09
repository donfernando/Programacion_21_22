package pq3.ficheros;

import java.io.*;

public class Numeros_bin_a_txt {
	public static void main(String[] args) throws IOException {
		final String FICH_LECTURA = "misFicheros/numeros.dat";
		final String FICH_ESCRITURA = "misFicheros/resultado.txt";

		DataInputStream entrada = new DataInputStream(new FileInputStream(FICH_LECTURA));
		FileWriter salida = new FileWriter(FICH_ESCRITURA);

		int cod;
		try {
			while (true) {
				cod = entrada.readInt();
				System.out.println(cod);
				salida.write("Número original: "+cod + "\n");
			}
		} catch (EOFException e) {
		} finally {
			entrada.close();
			salida.close();
		}
		System.out.println("FIN");

	}
}
