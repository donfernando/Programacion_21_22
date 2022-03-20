package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
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
		p.apilar(5);
		assertEquals(5, p.desapilar());
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
