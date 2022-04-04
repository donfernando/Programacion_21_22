import java.util.Iterator;

import ioToboso.*;
public class PruebaListaEnlazada {
	public static void main(String[] arg) {
		int n;
		Object dato;
		Iterator iterador;
		ListaEnlazada lista=new ListaEnlazada();
		for(n=10; n<=60; n+=10)
			lista.add(new Integer(n));
		iterador=lista.iterator();
		for(n=1; iterador.hasNext(); n++) {
			dato=iterador.next();
			System.out.println("El contenido del nodo "+ n +" es: "+dato);
		}


		System.out.print("........Vaciar la lista  Si o No (S/N)? ");
		if(Character.toUpperCase(Entrada.getche())=='S') {
			lista.vaciar();
		
			// Evitar que los nodos sigan estando
			// referenciados desde el objeto iterador.
			iterador=null;
		
			// Para asegurar que se eliminan de la memoria
			// los nodos eliminados de la lista.
			System.gc();
		
		}

		iterador=lista.iterator();
		System.out.println();
		System.out.println("\n--- Listado completo");
		n=1;
		while(iterador.hasNext()) {
			dato=iterador.next();
			System.out.println("    "+(n++)+" ---> "+dato);
		}
		System.out.println("--- fin de Listado");
	}
}
