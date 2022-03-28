package pq1.contenedores.dinamico.Ana;

import pq1.contenedores.dinamico.Ana.*;

public class ColaConCaducidad<T> extends Cola<T>{
	private int segundos;

	private class Nodo {
		T dato;
		Nodo detras;
		long entrada = System.currentTimeMillis();
	}

	private Nodo elPrimero;
	private Nodo elUltimo;

	public ColaConCaducidad(int segundos) {
		this.segundos = segundos;
	}

	public T desacolar() {
		T dato;
		while ((System.currentTimeMillis() - elPrimero.entrada)/1000 >= segundos) {
			elPrimero = elPrimero.detras;
		}	
		dato = elPrimero.dato;
		elPrimero = elPrimero.detras;
		return dato;
	}
	
	public ColaConCaducidad<T> acolar(T dato) {
		if (dato == null) {
			throw new NullPointerException("No puede poner null");
		}
		Nodo nuevo;
		nuevo = new Nodo();// crea la caja
		nuevo.dato = dato;// metemos el dato
		if (elPrimero == null) {
			elPrimero = nuevo;
		} else {
			elUltimo.detras = nuevo;
		}
		elUltimo = nuevo;
		return this;
	}
	
	public boolean vacia() {
		return elPrimero == null;
	}
	
	
}
