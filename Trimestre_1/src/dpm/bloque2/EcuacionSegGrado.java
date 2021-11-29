package dpm.bloque2;

import java.util.Scanner;

public class EcuacionSegGrado {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		float a,b,c;
		float discriminante;
		
		// Leer los coeficientes
		System.out.print("A: ");
		a = in.nextFloat();
		System.out.print("B: ");
		b = in.nextFloat();
		System.out.print("C: ");
		c = in.nextFloat();

		if (a != 0) {
			discriminante = b*b -4*a*c;
			if (discriminante < 0) {
				System.out.println("la solución precisa de números complejos");
			}
			else {
				if (discriminante == 0) {
					System.out.println("Solución única: " + (-b/(2.0*a)));
				}
				else {
					System.out.println("Primera solución: "+ (-b+Math.sqrt(discriminante))/(2*a));
					System.out.println("Segunda solución: "+ (-b-Math.sqrt(discriminante))/(2*a));
				}
			}
		}
		else {
			if(b != 0) {
				System.out.println("Solución única: " + (-b/(double)c));
			}
			else {
				if (c != 0) {
					System.out.println("NO HAY SOLUCIONES");
				}
				else {
					System.out.println("INFINAS SOLUCIONES");
				}
			}
		}
		in.close();
	}
}
