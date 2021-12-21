package dpm.bloque5.excepciones;

public class Tablas {
	public static void desplazarAlFinal(char[] letras, int pos) {
		char aux;
		int i;
		aux = letras[pos];
		for (i = pos+1; i < letras.length; i++) {
			letras[i-1]=letras[i];
		}
		letras[letras.length-1]=aux;
	}
}
