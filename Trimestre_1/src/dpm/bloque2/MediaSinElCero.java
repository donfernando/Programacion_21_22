package dpm.bloque2;

import java.util.Scanner;

public class MediaSinElCero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Variables
		int suma = 0, num;
		double media, i = 0;

		// bucle
		System.out.print("Por favor, introduce números (0 para terminar): ");
		num = entrada.nextInt();
		if (num != 0) {
			do {
				suma = suma + num;
				i = i + 1;
				num = entrada.nextInt();
			} while (num != 0);

			// Operacion media final
			media = suma / i;
			// System.out.println("La media de los números dados es " + media);
			System.out.printf("La media de los números es %.2f", media);

		} else
			System.out.println("No tengo datos para calcular la media");
	}

}