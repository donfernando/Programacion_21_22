package pq1.contenedores.dinamico.Francisco;

public class Cola<T> {
	private class Nodo {
		T dato;
		Nodo detras;
	}

	Nodo elPrimero;
	Nodo elUltimo;

	public Cola<T> encolar(T dato) {
		if (dato == null)
			throw new NullPointerException();
		Nodo nodoNuevo = new Nodo();
		nodoNuevo.dato = dato;
		if (elPrimero == null) {
			elPrimero = nodoNuevo;
		} else {
			elUltimo.detras = nodoNuevo;
		}
		elUltimo = nodoNuevo;
		return this;
	}

	public T desencolar() {
		T dato;
		dato = elPrimero.dato;
		elPrimero = elPrimero.detras;
//		if(elPrimero==null)
//			elUltimo=null;
		return dato;
	}

	public boolean vacia() {
		return elPrimero==null;
	}
	
	public String toString() {
		Nodo i = elPrimero;
		String s = "";
		if (elPrimero != null) {
			while (i.detras != null) {
				s = ", " + i.dato + s;
				i = i.detras;
			}
			s = i.dato + s;
		}
		return "[" + s + "]";

	}
}