package pq3.ficheros;

public class Argumentos {
	public static void main(String[] args) {
		if (args.length != 0)
			System.out.println("Fichero: " + args[0]);
		else
			System.out.println("Me faltan argumentos... ");
	}
}
