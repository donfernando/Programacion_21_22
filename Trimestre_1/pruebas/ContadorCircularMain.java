import java.util.Scanner;
import iesdomingoperezminik.bloque4.nuevasClases.ContadorCircular;

public class ContadorCircularMain {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		ContadorCircular c;
		int eleccion,pos;
		c = new ContadorCircular();
		
		String[] nombres= {"Pepe","Juan","Javi","Dolores","Gabriela","Aurora"};
		/*
		String[] nombres;
		nombres = new String[5];
		nombres[0] = "Pepe";
		nombres[1] = "Juan";
		nombres[2] = "Javi";
		nombres[3] = "Dolores";
		nombres[4] = "Gabriela";
		 */
		c.setTope(nombres.length-1);
		System.out.printf("Escriba un número del 1 al %d: ",nombres.length);
		eleccion=entrada.nextInt();
		pos = eleccion-1;
		c.set(pos);
		System.out.println("El delegado es: " + nombres[c.get()]);
		c.incrementar();
		System.out.println("El subdelegado es: " + nombres[c.get()]);
	}
}