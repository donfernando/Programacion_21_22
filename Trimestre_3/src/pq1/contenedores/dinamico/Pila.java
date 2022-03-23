package pq1.contenedores.dinamico;

class Nodo<E> {
	E dato;
	Nodo<E> debajo;
}

public class Pila<T> {
//	private static class Nodo<E>{
//		E dato;
//		Nodo<E> debajo;
//	}
	private Nodo<T> cima;

	public Pila<T> apilar(T dato) {
		if (dato == null)
			throw new NullPointerException();
		Nodo<T> nuevo;
		nuevo = new Nodo<T>();
		nuevo.dato = dato;
		nuevo.debajo = cima;
		cima = nuevo;
		return this;
	}

	public T desapilar() {
		T aux;
		aux = cima.dato;
		cima = cima.debajo;
		return aux;
	}

	public boolean vacia() {
		return cima == null;
	}

	public String toString() {
		Nodo<T> i;
		i = cima;
		String r = "]";
		if (i != null) {
			while (i.debajo != null) {
				r = r + i.dato + ",";
				i = i.debajo;
			}
			r = r + i.dato;			
		}
		r = r + "]";
		return r;
	}

}
