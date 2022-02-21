import dpm.bloque6.interfaces.Carta;
import dpm.bloque6.interfaces.Ejercicios;
import dpm.bloque6.interfaces.Palo;

public class PruebaInterfaces {

	public static void main(String[] args) {
		Carta c1,c2;
		c1 = new Carta(4, Palo.PICA);
		c2 = new Carta(3, Palo.TREBOL);
		System.out.println(Ejercicios.menor(c1, c2));
		System.out.println(Ejercicios.menor("c1", "c2"));
		System.out.println(c1.suma(c2));
	}

}
