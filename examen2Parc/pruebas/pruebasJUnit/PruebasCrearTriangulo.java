package pruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import base.Triangulo;

class PruebasCrearTriangulo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void crearEquilateroImposible_01() {
		Triangulo t;
		try {
			t = new Triangulo(0, 0, 0);
			fail("Este triangulo no se debería permitir");
		} catch (Exception e) {
		}
	}

	@Test
	void crearTriangulosIguales_01() {
		Triangulo t, k;
		try {
			t = new Triangulo(10, 5, 7);
			k = new Triangulo(5, 7, 10);
			assertEquals(t, k);
		} catch (Exception e) {
			fail("No se debería haber lanzado ninguna excepción");
		}
	}
	@Test
	void crearTrianguloNulo_01() {
		Triangulo t;
		try {
			t = new Triangulo(10, 5, 7);
			assertNotEquals(t, null);
		} catch (Exception e) {
			fail("No se debería haber lanzado ninguna excepción");
		}
	}
	@Test
	void crearTrianguloNulo_02() {
		Triangulo t;
		try {
			t = new Triangulo(10, 5, 7);
			assertNotEquals(null,t);
		} catch (Exception e) {
			fail("No se debería haber lanzado ninguna excepción");
		}
	}

	@Test
	void crearTriangulosMasivamente_01() {
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			try {
				new Triangulo(5, 5, 4).area();
			} catch (Exception e) {
				
			}
		}
	}
	@Test
	void crearTriangulosMasivamente_02() {
		Random r = new Random();
		for (int i = 0; i < 50000; i++) {
			try {
				new Triangulo(5, 5, 4).area();
			} catch (Exception e) {
				
			}
		}
	}
	@Test
	void crearTriangulosMasivamente_03() {
		Random r = new Random();
		for (int i = 0; i < 500000; i++) {
			try {
				new Triangulo(5, 5, 4).area();
			} catch (Exception e) {
				
			}
		}
	}

}
