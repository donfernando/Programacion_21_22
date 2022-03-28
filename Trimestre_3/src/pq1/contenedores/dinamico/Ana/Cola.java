package pq1.contenedores.dinamico.Ana;

public class Cola<T> {
	private class Nodo {
		T dato;
		Nodo detras;
	}

	private Nodo elPrimero;
	private Nodo elUltimo;

	public Cola<T> acolar(T dato) {
		if (dato == null) {
			throw new NullPointerException("No puede poner null");
		}
		Nodo nuevo;
		nuevo = new Nodo();// crea la caja
		nuevo.dato = dato;// metemos el dato
		if (elPrimero == null) {
			elPrimero = nuevo;
			elUltimo = nuevo;
		} else {
			elUltimo.detras = nuevo;
		}
		elUltimo = nuevo;
		return this;
	}

	public T desacolar() {
		T dato;
		dato = elPrimero.dato;
		elPrimero = elPrimero.detras;
// if(elPrimero == null) { no es imprescindible
// elUltimo = null;
// }
		return dato;
	}

	public boolean vacia() {
		return elPrimero == null;
	}

	public String toString() {
		String s = "[";
		Nodo i = elPrimero;
		while (i != null) {
			if (i == elPrimero) {
				s += i.dato.toString();
			} else {
				s += "," + i.dato.toString();
			}
			i = i.detras;
		}
		return s + "]";
	}
}