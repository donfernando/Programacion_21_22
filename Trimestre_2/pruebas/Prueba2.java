//import dpm.bloque5.recorridosTablas.ListaStrings;
import dpm.bloque5.excepciones.ListaStrings;

public class Prueba2 {

	public static void main(String[] args) {
		ListaStrings l,lista;
		l = new ListaStrings();
		System.out.println(l);
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		System.out.println(l.capacity());
	}

}
