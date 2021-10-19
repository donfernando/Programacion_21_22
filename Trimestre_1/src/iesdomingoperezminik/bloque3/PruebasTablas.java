package iesdomingoperezminik.bloque3;
import java.util.Scanner;

public class PruebasTablas {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		int[] edades;
		String[] nombres;
		int i;
		
		
		edades = new int[4];
		nombres = new String[4];
		nombres[0]="Juan";
		nombres[1]="Álvaro";
		nombres[2]="Alba";
		nombres[3]="Elsa";
		
		System.out.println("Dime las edades correspondientes...");
		for (i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i]+": ");
			edades[i] = entrada.nextInt();
		}
		
		
		
	}
}