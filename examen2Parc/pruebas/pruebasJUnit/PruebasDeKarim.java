package pruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import base.Triangulo;

class PruebasDeKarim {
	@Test
	void crearTrianguloImposible_01() {
		Triangulo t;
		try {
			t = new Triangulo(10, 3, 3);
			fail("Este triangulo no se deberia permitir.");
		} catch (Exception e) {
		}
	}

	@Test
	void crearTrianguloImposible_02() {
		Triangulo t;
		try {
			t = new Triangulo(2, 5, -10);
			fail("Este triangulo no se deberia permitir.");
		} catch (Exception e) {
		}
	}

	@Test
	void crearTrianguloImposible_03() {
		Triangulo t;
		try {
			t = new Triangulo(-5, -5, -5);
			fail("Este triangulo no se deberia permitir.");
		} catch (Exception e) {
		}
	}

	@Test
	void crearTriangulosIguales_01() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(10, 5, 7);
			k = new Triangulo(5, 7, 10);
			assertEquals(t, k);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTriangulosIguales_02() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(10, 5, 7);
			k = new Triangulo(7, 5, 10);
			assertEquals(t, k);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTriangulosIguales_03() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(10, 5, 7);
			k = new Triangulo(10, 7, 5);
			assertEquals(t, k);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTriangulosDistintos_01() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(5, 10, 9);
			k = new Triangulo(7, 9, 5);
			assertNotEquals(t, k);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTriangulosDistintos_02() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(5, 10, 9);
			k = new Triangulo(7, 9, 5);
			assertNotEquals(k, t);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTriangulosDistintos_03() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(5, 10, 9);
			k = new Triangulo(5, 10, 9);
			assertNotSame(k, t);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTrianguloMayor_01() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(10, 7, 9);
			k = new Triangulo(8, 4, 5);
			assertTrue(t.compareTo(k) > 0);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

	@Test
	void crearTrianguloMenor_01() {
		Triangulo t;
		Triangulo k;
		try {
			t = new Triangulo(10, 7, 9);
			k = new Triangulo(8, 4, 5);
			assertTrue(k.compareTo(t) < 0);
		} catch (Exception e) {
			fail("No se deberia haber lanzado ninguna excepcion.");
		}
	}

}
