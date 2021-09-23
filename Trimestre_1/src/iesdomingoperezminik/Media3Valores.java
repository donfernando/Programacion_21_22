package iesdomingoperezminik;
import java.util.Scanner;

public class Media3Valores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Variables
		double media;
		
		int suma = 0;

		// Acumulador
		System.out.print("Introduce 3 números: ");
		for (int i = 1; i <= 3; i=i+1) {
			suma = suma + entrada.nextInt();
		}

		media = suma / 3.0;

		// Salida Pantalla
		System.out.println("El resultado de la suma es = " + suma);
		System.out.printf("La media es %.2f, de los números introducidos.\n", media);

		entrada.close();
	}

}