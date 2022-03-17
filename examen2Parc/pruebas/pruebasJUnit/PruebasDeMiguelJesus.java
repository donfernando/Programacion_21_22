package pruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import base.Triangulo;

class PruebasDeMiguelJesus {
	@Test
	void crearEquilateroImposible_2() {
		Triangulo t;
		try {
			t = new Triangulo(3, 5, 10);
			fail("Este triangulo no se deberia permitir");
		} catch (Exception e) {

		}
	}

	@Test
	void crearTriangulosImposible_3() {
		Triangulo t;
		try {
			t = new Triangulo(10, -5, 7);
			fail("Este triangulo no se deberia permitir");
		} catch (Exception e) {

		}
	}

	@Test
	void crearTriangulosImposible_4() {
		Triangulo t;
		try {
			t = new Triangulo(10, 0, 7);
			fail("Este triangulo no se deberia permitir");
		} catch (Exception e) {
		}
	}
	@Test
	void crearTrianguloConSigoMismo_01() {
		Triangulo t,k;
		try {
			t = new Triangulo(10, 10, 7);
			k=t;
			assertSame(t, k);
		} catch (Exception e) {
			fail("Este triangulo no se deberia permitir");
		}
	}
	@Test
	void crearTrianguloConSigoMismo_02() {
		Triangulo t,k;
		try {
			t = new Triangulo(10, 10, 7);
			k=t;
			assertEquals(t, k);
		} catch (Exception e) {
			fail("Este triangulo no se deberia permitir");
		}
	}	@Test
	void probarAreaTriangulo_01() {
		Triangulo t;
		try {
			t = new Triangulo(3, 4, 5);
			assertEquals(t.area(), 3*4/2.0);
		} catch (Exception e) {
			fail("Este triangulo no se deberia permitir");
		}
	}
}
