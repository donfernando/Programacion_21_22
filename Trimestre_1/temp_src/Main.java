import java.util.Scanner;

public class Main {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// Declaraciones
		String nombre;
		String saludo;
		
		//++++
		

		
		
		// Algoritmo
		
		saludo= "Buenos días ";
		System.out.println("¡Hola! ¿Quién eres?");
		nombre = entrada.nextLine();
		System.out.println(saludo + nombre);
	
		System.out.println(saludo);
	}

}