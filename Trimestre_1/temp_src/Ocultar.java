import java.util.*;

public class Ocultar {
	public static void main(String[] args) {
		// Declaración de variables
		String mensaje, mensaje2;
		StringBuffer sbF = new StringBuffer();
		int i = 0, longitud = 0, continuar = 0;
		// Mensaje de Bienvenida
		System.out.println("Cifrado de mensajes");
		System.out.println("********************");
		Scanner entrada = new Scanner(System.in);
		// Solicitud de texto
		System.out.println("Introduzca el mensaje a cifrar");
		mensaje = entrada.nextLine();
		mensaje2 = "";
		for (i = 0; i < mensaje.length(); i++) {
			if (Character.isLetter(mensaje.charAt(i))) {
				// Usando un String
				System.out.print(mensaje.charAt(i));
				// Usando un StringBuffer
				sbF.append(mensaje.charAt(i));
				mensaje2 = mensaje2 + mensaje.charAt(i);
			} else {
				// Usando un String
				System.out.print("*");
				// Usando un StringBuffer
				sbF.append("*");
				mensaje2 = mensaje2 + '*';
			}
		}
		// Mostrar resultados en pantalla
		System.out.println("Original: "+mensaje);
		System.out.println("SB: "+sbF);
		System.out.println("S: "+mensaje2);

		// Finalización de ejecución
		System.out.println("Gracias por utilizar este sofware");
		System.out.println("*********************************");
	}
}