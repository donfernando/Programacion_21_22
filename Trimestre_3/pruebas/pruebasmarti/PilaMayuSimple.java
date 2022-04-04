package pruebasmarti;

import pq1.contenedores.dinamico.Pila;

public class PilaMayuSimple extends Pila<Character>{
	public PilaMayuSimple apilar(Character dato) {
		if(Character.isLetter(dato)) {
			dato = Character.toUpperCase((dato));
			dato = Ejercicios.cleanString(dato+"").charAt(0);
			super.apilar(dato);
		}
		return this;
	}
}
