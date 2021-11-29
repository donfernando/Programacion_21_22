package dpm.bloque2;
import java.util.Scanner;

public class MediaDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, suma = 0;
		int numLeidos = 0;
		float resultado;

		System.out.println("Introduzca números (9999 para terminar): ");
		numero = entrada.nextInt();

		if (numero != 9999) {
			do {
				suma = suma + numero;
				numLeidos++;     // numLeidos = numLeidos + 1;
				System.out.println("Introduzca otro número...");
				numero = entrada.nextInt();
			} while (numero != 9999);
			resultado = suma / (float)numLeidos;
			System.out.println("La media es " + resultado);
		} else {
			System.out.println("No tengo datos ");
		}
		entrada.close();
	}

}