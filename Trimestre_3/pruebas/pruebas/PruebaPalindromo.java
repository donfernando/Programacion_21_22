package pruebas;

import pruebasmarti.Ejercicios;

public class PruebaPalindromo {

	public static void main(String[] args) {
		String f = "Dábale arroz a la zorra el abad.";
		String es;
		if(Ejercicios.esPalindromo(f))
			es="sí";
		else
			es="no";
		System.out.printf("La frase...\n\"%s\"\n...%s un palíndromo.\n",
				f,es);

	}

}
