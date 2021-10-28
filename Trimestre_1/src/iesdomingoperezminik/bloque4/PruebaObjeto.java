package iesdomingoperezminik.bloque4;
import java.util.Scanner;

public class PruebaObjeto {
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		Ficha miAmigo;
		
		miAmigo = new Ficha();
		miAmigo.setNombre("Antonio");
		miAmigo.edad = 12;
		System.out.printf("Mi amigo %s tiene %d años.\n",miAmigo.getNombre(), miAmigo.getEdad());
	}
}


