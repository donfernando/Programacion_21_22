package ejercicio3;

import java.util.Scanner;
import ejercicio2.FrioCaliente;

/** 
 * Se trata de implementar una aplicación que, haciendo uso de la clase FrioCaliente
 * plantee un juego al usuario.
 * <br/>1.- Debe pedir al usuario un número que haga de límite máximo y a continuación 
 * generar al azar un número entero que esté entre 1 y el número facilitado por
 * el usuario.
 * <br/>2.- Debe pedir al usuario que acierte dicho número.
 * <br/>&nbsp;A cada intento del usuario introduce un número y el programa imprimirá una
 * de estas frases para orientar al usuario en sus intentos...
 * <br/>&nbsp;&nbsp;...te quedaste corto. Es mayor.
 * <br/>&nbsp;&nbsp;...te pasate. Es menor.
 * <br/>&nbsp;&nbsp;...número fuera del rango.
 * <br/>3.- Cuando finalmente el usuario acierte, no informará del número de intentos
 * que le ha costado averiguar el número oculto.
 * 
 * @author fernando
 */

public class AdivinaNumero {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		FrioCaliente fc;
		int intento;
		int resultado;
		System.out.print("Se elegirá al azar un número entre 1 y ...(elije tú): ");
		fc = new FrioCaliente(entrada.nextInt());
		System.out.println("Empieza el juego...");
		intento = 0;
		do {
			intento++;
			System.out.print(intento + ".- ");
			resultado = fc.adivinar(entrada.nextInt());
			switch (resultado) {
			case 9:
				System.out.println("...número fuera del rango.");
				break;
			case -1:
				System.out.println("...te quedaste corto. Es mayor.");
				break;
			case 1:
				System.out.println("...te pasate. Es menor.");
				break;
			}
		} while (resultado != 0);
		System.out.printf("Averiguado en %d intentos",intento);
	}

}
