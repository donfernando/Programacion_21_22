package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
		ConjuntoSimpatico exp = new ConjuntoSimpatico(new int[] {4,3,6854});
//		ConjuntoSimpatico exp = new ConjuntoSimpatico(Arrays.asList(4,3));
		c = new ConjuntoSimpatico(new int[] {3,4,3,6854,6854});
		assertEquals(exp, c);
	}
	
	@Test
	void testEliminar() {
		c = new ConjuntoSimpatico(new int[] {3,4});
		try {
			c.remove(3);
		} catch (UnsupportedOperationException e) {
			fail("Al no estar implementada la eliminación, se debe lanzar excepción");
		}
	}

	@Test
	void testBuscar() {
		c = new ConjuntoSimpatico(new int[] {3,4});
		assertFalse(c.contains(3));
	}

}
