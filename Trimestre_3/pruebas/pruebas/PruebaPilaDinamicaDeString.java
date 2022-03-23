package pruebas;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq1.contenedores.dinamico.Pila;

class PruebaPilaDinamicaDeString {

	private Pila<String> p;
	
	@BeforeEach
	void preparaCadaTest() {
		p = new Pila<String>();
	}
	
	@Test
	void testEncadenaTrasApilar() {
		try {
			p.apilar("8").apilar("010");
			assertEquals(p.desapilar(), "010");
		} catch (Exception e) {
			fail("Error");
		}
	}

	@Test
	void testImprimirPila_01() {
		try {
			p.apilar("Hola").apilar("Ana Dolores");
			assertEquals("]Ana Dolores,Hola]",p.toString());
		} catch (Exception e) {
			fail("Error");
		}
	}

}
