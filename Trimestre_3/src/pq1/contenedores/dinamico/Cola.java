package pq1.contenedores.dinamico;

public class Cola<T> {

	private class Nodo {
		T dato;
		Nodo detras;
	}
	
	public Cola<T> acolar(T dato){
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.dato=dato;
		if(vacia())
			
	}
}
