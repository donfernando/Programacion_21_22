package dpm.bloque5.herencia;

import dpm.bloque5.excepciones.ListaStrings;

public class PilaString extends ListaStrings{

	public void apilar(String s) {
		add(s);
	}
	public String desapilar() {
		if(isEmpty())
			throw new PilaVaciaException();
		return remove(size()-1);
	}
	public boolean vacia() {
		return isEmpty();
	}
}
