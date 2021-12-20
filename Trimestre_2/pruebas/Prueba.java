import dpm.bloque5.recorridosTablas.ListaStrings;

public class Prueba {

	public static void main(String[] args) {
		ListaStrings l;
		l = new ListaStrings(5);
		l.add("A");
		l.add(null);
		l.add("C");
		l.add("D");
		System.out.println(l);
		l.clear();
		System.out.println(l);
		l.add(0, "x1");
		System.out.println(l);
		l.add("x2");
		System.out.println(l);
	}

}
