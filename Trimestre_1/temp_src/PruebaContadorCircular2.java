import java.util.Scanner;

import iesdomingoperezminik.bloque4.nuevasClases.ContadorCircular;

public class PruebaContadorCircular2 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		ContadorCircular c;
		int i;
		String [] nombres;
		
		nombres = new String[5];
		nombres[0]="Junito";
		nombres[1]="Arturo";
		nombres[2]="Felisa";
		nombres[3]="Romén";
		nombres[4]="Trini";
		
		
		c = new ContadorCircular();
		c.setTope(nombres.length-1);
		System.out.printf("Elije una prosicion entre 1 y %d: ", nombres.length);
		i= entrada.nextInt()-1;
		
		System.out.println(nombres[i]);
		c.incrementar();
		System.out.println(nombres[i+1]);
		}
	}

}
