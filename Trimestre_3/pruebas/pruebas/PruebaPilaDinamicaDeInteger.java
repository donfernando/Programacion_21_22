package pruebas;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq1.contenedores.dinamico.Pila;

class PruebaPilaDinamicaDeInteger {

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
	void testEncadenaTrasApilar_02() {
		try {
			p.apilar(8).apilar(10);
			p.desapilar();
			assertEquals(p.desapilar(), 8);
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

	@Test
	void testImprimirPila_01() {
		try {
			p.apilar(10).apilar(3);
			assertEquals(p.toString(), "]3,10]");
		} catch (Exception e) {
			fail("Error");
		}
	}

	@Test
	void testImprimirPila_02() {
		try {
			assertEquals(p.toString(), "]]");
		} catch (Exception e) {
			fail("Error");
		}
	}

	@Test
	void testImprimirPila() {
		try {
			p.apilar(010).apilar(3);
			assertEquals(p.toString(), "]3,8]");
		} catch (Exception e) {
			fail("Error");
		}
	}

}
