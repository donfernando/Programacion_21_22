package iesdomingoperezminik.bloque2;

public class Multiplicaciones {

	public static void main(String[] args) {
		int cont, tabla;

		for (tabla = 1; tabla <= 5; tabla++) {
			System.out.println("Tabla del "+tabla);
			for (cont = 1; cont <= 10; cont++) {
				// System.out.println( tabla + " x " + cont + " = " + (tabla*cont));
				System.out.printf("%d x %2d = %02d\n", tabla, cont, tabla * cont);
			}
			System.out.println();
		}

	}

}
