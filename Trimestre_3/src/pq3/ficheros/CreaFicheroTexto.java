package pq3.ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class CreaFicheroTexto {
	public static void main(String[] args) throws IOException {
		final String N_FICH = "salidaUTF8.txt";
		FileWriter salida;
		InputStreamReader entrada;
		int cod;
		char ch;
		salida = new FileWriter(N_FICH, Charset.forName("UTF8"));
		entrada = new InputStreamReader(System.in);
		cod = entrada.read();
		while (cod != '.') {
			//ch = (char) cod;
			salida.write(cod);
			cod = entrada.read();
		}
		entrada.close();
		salida.close();
		System.out.println("FIN");
	}
}
