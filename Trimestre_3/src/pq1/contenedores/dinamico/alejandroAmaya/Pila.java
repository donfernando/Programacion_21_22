package pq1.contenedores.dinamico.alejandroAmaya;

public class Pila<T> {
	private class Nodo {
		T dato;
		Nodo debajo;

		@Override
		public String toString() {
			if (debajo != null) {
				return debajo.toString()+"," + dato;
//				return dato + "," + debajo.toString();
			} else {
				return dato + "";
			}
		}
	}
	private Nodo cima;

	@Override
	public String toString() {
		return "]" + cima!=null?cima.toString():"" + "]";
	}

	public Pila<T> apilar(T dato) {
		if (dato == null)
			throw new NullPointerException();
		Nodo nuevo;
		nuevo = new Nodo();
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
}
