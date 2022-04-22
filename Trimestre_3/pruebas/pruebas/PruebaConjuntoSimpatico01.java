package pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq2.conjunto.ConjuntoSimpatico;

class PruebaConjuntoSimpatico01 {

	private ConjuntoSimpatico c;

	
	@AfterEach
	void vistaDeDatosGenerados() {
		System.out.println("Conjunto resultante: "+c);
	}
	
	@Test
	void testCrear() {
		ConjuntoSimpatico exp = new ConjuntoSimpatico(new int[] {4,3});
		c = new ConjuntoSimpatico(new int[] {3,4,3});
		assertEquals(exp, c);
	}
	
	@Test
	void testEliminar() {
		c = new ConjuntoSimpatico(new int[] {3,4});
		try {
			c.remove(3);
			fail("Al no estar implementada la eliminación, se debe lanzar excepción");
		} catch (UnsupportedOperationException e) {
		}
	}

}
