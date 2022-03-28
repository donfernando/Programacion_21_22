package pq1.contenedores.dinamico;

public class ColaConCaducidad<T> extends Cola<T> {
	private int segundos;

	private class Nodo {
		T dato;
		Nodo detras;
		long entrada = System.currentTimeMillis();
	}

	private Nodo cabeza;
	private Nodo cola;

	public ColaConCaducidad(int segundos) {
		this.segundos = segundos;
	}

	public T desacolar() {
		T dato;
		while ((System.currentTimeMillis() - cabeza.entrada)/1000 >= segundos) {
			cabeza = cabeza.detras;
		}	
		dato = cabeza.dato;
		cabeza = cabeza.detras;
		return dato;
	}
}
