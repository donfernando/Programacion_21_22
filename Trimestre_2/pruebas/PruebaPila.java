
import dpm.bloque5.herencia.PilaString;

public class PruebaPila {
	public static void main(String[] args) {
		PilaString pila = new PilaString();
		pila.apilar("1");
		pila.apilar("2");
		pila.apilar("3");
		pila.add(0,"hola");
		pila.apilar("4");
		pila.apilar("5");
		pila.desapilar();

		System.out.println(pila);
		System.out.println(pila.vacia());
		while(!pila.vacia())
			System.out.println(pila.desapilar());
	}
}
