package pq2.listas;

import pq1.contenedores.dinamico.Cola;

public class ColaMayuSimple extends Cola<Character> {
	public ColaMayuSimple acolar(Character dato) {
		if(Character.isLetter(dato)) {
			dato = Character.toUpperCase((dato));
			dato = Ejercicios.cleanString(dato+"").charAt(0);
			super.acolar(dato);
		}
		return this;
	}
}