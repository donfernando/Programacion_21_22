import java.util.Scanner;

public class EcuacionSegundoGrado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Variables
		double A, B, C, resultado;
		double raiz,discriminante;

		// Si pongo variables de INT en A, B y C (mejor en minusculas) los resultados me lo muestran sin decimales

		// Primera condición
		System.out.print("Por favor, introduce 3 números: ");
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		if (A == 0) {
			System.out.println("La ecuación no es de segundo grado, que es ésta...");
			System.out.println("    Bx + C = 0  ");
			if (B == 0) {
				System.out.println("La ecuación no es de grado uno, sino que es ésta...");
				System.out.println("    C = 0  ");
				if (C == 0) {
					System.out.println("Para todo entero se cumple la ecuación");
				}
				else {
					System.out.println("No tiene solución.");
				}
			}
			else {
				resultado = -C / B;
				System.out.printf("El resultado de la ecuación es %.2f", resultado);
			}
		}
		else {
			discriminante = B*B-4*A*C;
			if(discriminante<0)
				System.out.println("Queda pendiente tratar las soluciones "
						         + "con números complejos");
			else
				if(discriminante==0) {
					resultado=-B/(2*A);
					System.out.printf("El resultado de la ecuación es %.2f", resultado);
				}
				else {
					raiz=Math.sqrt(discriminante);
					System.out.println("Hay dos soluciones.");
					resultado=(-B+raiz)/(2*A);
					System.out.printf("Resultado uno: %.2f\n", resultado);
					resultado=(-B-raiz)/(2*A);
					System.out.printf("Resultado dos: %.2f\n", resultado);
				}
		}
		entrada.close();
	}
}