package iesdomingoperezminik.bloque2;
import java.util.Scanner;

public class Media3Valores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Variables
		double media;
		int suma = 0;
		int num, i;
		
		
		System.out.print("Introduce 3 números: ");
		i = 1;
		while(i <= 3) {
		//for (; i <= 3;) {
			num = entrada.nextInt();
			suma = suma + num;
			i=i+1;
		}
		media = suma / 3.0;
		// Salida Pantalla
		System.out.println("El resultado de la suma es = " + suma);
		System.out.printf("La media es %.2f, de los números introducidos.\n", media);

		entrada.close();
	}

}