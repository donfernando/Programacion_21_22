package iesdomingoperezminik;

import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int radio;
		double area, perimetro;

		System.out.print("Radio: ");
		radio = entrada.nextInt();

		// Cálculos
		area = Math.PI * (radio * radio);
		perimetro = 2 * Math.PI * radio;
		//System.out.println("El área es " + area);
		//System.out.println("El perímetro es " + perimetro);
		System.out.printf("El área es %.2f\n", area);
		System.out.printf("\"El perímetro es %.2f\"\n", perimetro);
		entrada.close();
	}
}