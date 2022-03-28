package pruebas;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq1.contenedores.dinamico.Cola;

class PruebaColaDinamicaDeInteger {

	private Cola<Integer> c;
	
	@BeforeEach
	void preparaCadaTest() {
		c = new Cola<Integer>();
	}
	
	@Test
	void testEncadenaTrasAcolar() {
		try {
			c.acolar(8).acolar(10);
			assertEquals(c.desacolar(), 8);
		} catch (Exception e) {
			fail("Error");
		}
	}

	@Test
	void testEncadenaTrasAcolar_02() {
		try {
			c.acolar(8).acolar(10);
			c.desacolar();
			assertEquals(c.desacolar(), 10);
		} catch (Exception e) {
			fail("Error");
		}
	}
	@Test
	void testSacarDeColaVacia() {
		
		try {
			c.desacolar();
			fail("Error");
		} catch (Exception e) {
		}
	}
	@Test
	void testUsarPilaTrasExcepcion() {
		try {
			c.desacolar();
			fail("Error");
		} catch (Exception e) {			
		}
		c.acolar(5);
		c.acolar(50);
		assertEquals(5, c.desacolar());
	}
	@Test
	void testVacia() {
		assertTrue(c.vacia());
	}
	@Test
	void testNoVacia() {
		c.acolar(3);
		assertFalse(c.vacia());
	}
	@Test
	void testAcolarNull() {
		try {
			c.acolar(null);
			fail("Error");
		} catch (Exception e) {
		}
	}


}
