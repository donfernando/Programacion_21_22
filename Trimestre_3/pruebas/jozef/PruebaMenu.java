package jozef;

public class PruebaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu uno = new Menu("Contacto");
		uno.add("Servicios");
		uno.add("Datos");
		uno.add("Precios");
		uno.add(1, "Otros");
		uno.add(0, "Idiomas");
		uno.next();
		uno.next();
		uno.next();
		uno.next();
		uno.next();
		uno.next();
		uno.previous();
		uno.select(1);
		System.out.println(uno);
	}

}
