import java.util.Scanner;

public class pruebaEntrada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1a.-"+entrada.nextInt());
		System.out.println("1b.-"+entrada.nextInt());

		entrada.nextLine();
		System.out.println("2.-"+entrada.nextLine());
		System.out.println("3.-"+entrada.nextLine());
		System.out.println("4.-"+entrada.nextInt());
	}

}
