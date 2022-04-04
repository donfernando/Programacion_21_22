package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq1.contenedores.Pila;

class PruebaPila {

	private Pila<Integer> p;
	
	@BeforeEach
	void preparaCadaTest() {
		p = new Pila<Integer>();
	}
	
	@Test
	void testEncadenaTrasApilar() {
		try {
			p.apilar(8).apilar(10);
			assertEquals(p.desapilar(), 10);
		} catch (Exception e) {
			fail("Error");
		}
	}
	@Test
	void testSacarDePilaVacia() {
		
		try {
			p.desapilar();
			fail("Error");
		} catch (Exception e) {
		}
	}
	@Test
	void testUsarPilaTrasExcepcion() {
		try {
			p.desapilar();
			fail("Error");
		} catch (Exception e) {			
		}
		try {
			p.apilar(5);
			assertEquals(5, p.desapilar());
		} catch (Exception e) {
			fail("Error");			
		}
	}
	@Test
	void testVacia() {
		assertTrue(p.vacia());
	}
	@Test
	void testNoVacia() {
		p.apilar(3);
		assertFalse(p.vacia());
	}
	@Test
	void testApilarNull() {
		try {
			p.apilar(null);
			fail("Error");
		} catch (Exception e) {
		}
	}

}
