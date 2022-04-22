package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pq2.conjunto.NumeroSimpatico;

class PruebaNumeroSimpatico {

	@Test
	void test() {
		assertTrue(NumeroSimpatico.valida(63));
		assertFalse(NumeroSimpatico.valida(68));
	}

}
