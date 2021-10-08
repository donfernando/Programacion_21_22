package iesdomingoperezminik;
import java.util.Scanner;

public class Portero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad, cuantosSon;
		float altura;
		boolean calzadoAdecuado, entran, quedanClientes;
		
		do {
			System.out.print("Edad: ");
			edad = entrada.nextInt();
			System.out.print("Altura: ");
			altura = entrada.nextFloat();
			System.out.print("Tiene calzado adecuado (true/false): ");
			calzadoAdecuado = entrada.nextBoolean();
			System.out.print("Cuántos son:: ");
			cuantosSon = entrada.nextInt();
			entran = edad >= 14 && edad <= 55 &&
					 altura > 1.25f &&
					 calzadoAdecuado &&
					 cuantosSon <= 6;
			if (entran)
				System.out.println("Adelante...");
			else
				System.out.println("Lo lamento, no pueden pasar...");
			System.out.print("Quedan más clientes??? (true/false): ");
			quedanClientes = entrada.nextBoolean();
		} while (quedanClientes);
		entrada.close();
		System.out.println("fin");
	}

}