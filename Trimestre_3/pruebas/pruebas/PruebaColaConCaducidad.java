package pruebas;

import java.io.IOException;

import pq1.contenedores.dinamico.Ana.*;

public class PruebaColaConCaducidad {

	public static void main(String[] args) throws IOException {
//		Cola<Integer> c = new Cola<>();
//		Cola<Integer> c = new ColaConCaducidad<>(10);
		ColaConCaducidad<Integer> c = new ColaConCaducidad<>(10);
		long empieza =System.currentTimeMillis();
		long transcurridos;
		transcurridos = System.currentTimeMillis()-empieza;
		System.out.printf("Han pasado: %d mSeg.\n",transcurridos);
		c.acolar(0);			
		for (int i = 1; i < 5; i++) {
			System.in.read();
			transcurridos = System.currentTimeMillis()-empieza;
			System.out.printf("Han pasado: %d mSeg.\n",transcurridos);
			c.acolar(i);			
		}
			while( ! c.vacia() ) {
				System.in.read();
				System.out.println("Dato: "+c.desacolar());
			}
			
		System.out.println("FIN");
	}

}
