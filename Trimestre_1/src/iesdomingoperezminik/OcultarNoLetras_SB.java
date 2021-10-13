package iesdomingoperezminik;
import java.util.Scanner;

public class OcultarNoLetras_SB {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		String frase;
		StringBuffer sbFrase;
		int pos;
		System.out.println("Introduce la frase: ");
		frase = entrada.nextLine();
		
		sbFrase = new StringBuffer(frase);
		
		
		for (pos = 0; pos < sbFrase.length(); pos++) {
			if (! Character.isLetter(sbFrase.charAt(pos)))
				sbFrase.setCharAt(pos, '*');
		}
		
		System.out.println(sbFrase);
		System.out.println(frase);
	}
}
