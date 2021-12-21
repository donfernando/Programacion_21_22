//import dpm.bloque5.recorridosTablas.ListaStrings;
import dpm.bloque5.excepciones.ListaStrings;

public class Prueba {

	public static void main(String[] args) {
		ListaStrings l;
		l = new ListaStrings(5);
		System.out.println(l);
		l.add("A");
		l.add("otro dato");
		l.add("C");
		l.add("D");
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l);
		
	}

}
