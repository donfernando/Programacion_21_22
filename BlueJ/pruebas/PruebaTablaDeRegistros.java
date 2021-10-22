
import java.util.Scanner;

public class PruebaTablaDeRegistros {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		Ficha[] fichas;
		int i, sumaEdades;
		float media;
		
		fichas = new Ficha[4];
		for (i = 0; i < fichas.length; i++) {
			fichas[i]=new Ficha();
		}
		fichas[0].nombre = "Juan";
		fichas[1].nombre = "Álvaro";
		fichas[2].nombre = "Alba";
		fichas[3].nombre = "Elsa";
		
		System.out.println("Dime las edades correspondientes...");
		for (i = 0; i < fichas.length; i++) {
			System.out.print(fichas[i].nombre+": ");
			fichas[i].edad = entrada.nextInt();
		}
		sumaEdades=0;
		for (i = 0; i < fichas.length; i++) {
			System.out.printf("%s tiene %d años\n", fichas[i].nombre, fichas[i].edad);
			sumaEdades += fichas[i].edad;
		}
		media = sumaEdades / (float)fichas.length;
		System.out.printf("La edad media es %.3f", media);
		
		
	}
}
