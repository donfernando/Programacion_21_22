package pruebas;

import pq2.menu.Menu;

public class PruebaMenu {

	public static void main(String[] args) {
		Menu m = new Menu("Contacto");
		m.add("Servicios");
		m.add("Datos");
		m.add("Precios");
		m.add(1, "Otros");
		System.out.println(m);
		System.out.println();
		m.add(0, "Idiomas");
		System.out.println(m);
		System.out.println();
		m.next();
		m.next();
		m.next();
		m.next();
		m.next();
		System.out.println(m);
		System.out.println();
		m.next();
		System.out.println(m);
		System.out.println();
		m.previous();
		System.out.println(m);
		System.out.println();
		m.select(1);
		System.out.println(m);
		System.out.println();
		
		System.out.println(m.get(m.read()));
		
		m.add("mal");
	}

}
