package iesdomingoperezminik.bloque4;
import java.util.Scanner;

public class PruebaObjetos {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		Ficha[] misAmigos;
		Ficha elPrimero;
		int i, sumaEdades;
		float media;
		
		misAmigos = new Ficha[4];
		for (i = 0; i < misAmigos.length; i++) {
			misAmigos[i]=new Ficha();
		}
		misAmigos[0].setNombre("Juan");
		
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
			misAmigos[i].mostrar();
			sumaEdades += misAmigos[i].getEdad();
		}
		media = sumaEdades / (float)misAmigos.length;
		System.out.printf("(REG) La edad media es %.3f", media);
		
		elPrimero = misAmigos[0];
		System.out.printf("El primero de mis amigos tiene %d años.\n",elPrimero.getEdad());
	}
}


