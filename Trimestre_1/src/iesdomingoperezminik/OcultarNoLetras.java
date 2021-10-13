package iesdomingoperezminik;
import java.util.Scanner;

public class OcultarNoLetras {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		String frase;
		StringBuffer sbFrase;
		int pos;
		System.out.println("Introduce la frase: ");
		frase = entrada.nextLine();
		
		for (pos = 0; pos < frase.length(); pos++) {
			if (Character.isLetter(frase.charAt(pos)))
				System.out.print(frase.charAt(pos));
			else
				System.out.print('*');
		}
		System.out.println();
		System.out.println(frase);
	}
}
