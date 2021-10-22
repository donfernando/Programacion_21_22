package iesdomingoperezminik.bloque3;
import java.util.Scanner;

public class PruebaTablaDeRegistros {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		Ficha[] misAmigos;
		int i, sumaEdades;
		float media;
		
		misAmigos = new Ficha[4];
		for (i = 0; i < misAmigos.length; i++) {
			misAmigos[i]=new Ficha();
		}
		misAmigos[0].nombre = "Juan";
		misAmigos[1].nombre = "Álvaro";
		misAmigos[2].nombre = "Alba";
		misAmigos[3].nombre = "Elsa";
		
		System.out.println("Dime las edades correspondientes...");
		for (i = 0; i < misAmigos.length; i++) {
			System.out.print(misAmigos[i].nombre+": ");
			misAmigos[i].edad = entrada.nextInt();
		}
		sumaEdades=0;
		for (i = 0; i < misAmigos.length; i++) {
			System.out.printf("%s tiene %d años\n", misAmigos[i].nombre, misAmigos[i].edad);
			sumaEdades += misAmigos[i].edad;
		}
		media = sumaEdades / (float)misAmigos.length;
		System.out.printf("(REG) La edad media es %.3f", media);
	}
}