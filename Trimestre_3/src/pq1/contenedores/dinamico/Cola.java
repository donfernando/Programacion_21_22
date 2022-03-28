package pq1.contenedores.dinamico;

public class Cola<T> {
	private class Nodo {
		T dato;
		Nodo siguiente;
	}
	
	protected Nodo cabeza;
	protected Nodo cola;

	public Cola<T> acolar(T dato) {
		if (dato == null)
			throw new NullPointerException();
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.dato = dato;

		if (cabeza == null) {
			cabeza = nuevo;
		} else {
			cola.siguiente = nuevo;
		}
		cola = nuevo;
		return this;
	}

	public T desacolar() {
		T aux;
		aux = cabeza.dato;
		cabeza = cabeza.siguiente;
		return aux;
	}

	public boolean vacia() {
		return cabeza == null;
	}
}