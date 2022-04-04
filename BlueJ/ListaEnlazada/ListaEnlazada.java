import java.util.*;

public class ListaEnlazada {
	private static class Nodo {
		Object dato;
		Nodo sig;
	}
	private Nodo falsoNodoInicial= new Nodo();
	
	public void add(Object obj)	{
		Nodo nuevo=new Nodo();
		nuevo.dato=obj;
		nuevo.sig=falsoNodoInicial.sig;
		falsoNodoInicial.sig = nuevo;
	}
	public void vaciar () {
		falsoNodoInicial.sig=null;
	}
	public Iterator iterator() {
		return new Desplazarse();
	}
	private class Desplazarse implements Iterator {
		private Nodo actual=falsoNodoInicial;
		public boolean hasNext() {
			return actual.sig != null;
		}
		public Object next() {
			if(!hasNext())
				throw new NoSuchElementException ("No hay mas elementos en la lista.");
			actual= actual.sig;
			return actual.dato;
		}
		public void remove() {
			throw new UnsupportedOperationException("Funcion remove() no implementada.");
		}
	}
}
		
		