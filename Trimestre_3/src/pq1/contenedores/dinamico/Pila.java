package pq1.contenedores.dinamico;

public class Pila<T> {
//	private static class Nodo<E>{
//		E dato;
//		Nodo<E> debajo;
//	}
	private Nodo<T> cima;
	
	public Pila<T> apilar(T dato) {
		if(dato == null)
			throw new NullPointerException();
		Nodo<T> nuevo;
		nuevo = new Nodo<T>();
		nuevo.dato=dato;
		nuevo.debajo=cima;
		cima=nuevo;
		return this;
	}
	
	public T desapilar() {
		T aux;
		aux=cima.dato;
		cima = cima.debajo;
		return aux;
	}
	
	public boolean vacia() {
		return cima==null;
	}
}
