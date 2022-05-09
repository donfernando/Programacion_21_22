package pq3.ficheros;

import java.io.*;

public class Numeros_txt_a_bin {
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new FileReader("misFicheros/numeros.txt"));
		DataOutputStream salida = new DataOutputStream(new FileOutputStream("misFicheros/numeros.dat"));
		
		String linea = entrada.readLine();
		while (linea != null) {
			try {
//				System.out.println(linea);
				salida.writeInt(Integer.parseInt(linea));
			} catch (NumberFormatException e) {}
			linea = entrada.readLine();
		}
		entrada.close();
		salida.close();
	}
}
