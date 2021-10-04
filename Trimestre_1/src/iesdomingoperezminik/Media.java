package iesdomingoperezminik;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma = 0, numero;
		float media, cont = 0;

		System.out.println("Dame datos (para terminar pon 9999): ");
		numero = entrada.nextInt();
		while (numero != 9999) {
			suma = suma + numero;
			cont = cont + 1; // cont++;
			numero = entrada.nextInt();
		}
		if (cont != 0) {
			media = suma / cont;
			System.out.println("La media es: " + media);
		} else {
			System.out.println("Me faltan datos para la media");
		}
		entrada.close();
	}

}
