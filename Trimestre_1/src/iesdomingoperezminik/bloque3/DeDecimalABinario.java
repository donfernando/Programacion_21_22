package iesdomingoperezminik.bloque3;

import java.util.Scanner;

public class DeDecimalABinario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero; 
		StringBuffer resultado = new StringBuffer();
		
		System.out.print("Introduce un entero: ");
		numero = entrada.nextInt();
		
		do {
			resultado.insert(0, numero%2);
			numero = numero/2;
		} while(numero>0);
		System.out.print(resultado);
		entrada.close();
	}
}







