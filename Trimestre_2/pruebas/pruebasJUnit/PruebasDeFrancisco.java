package pruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejerc1.Examen;
import ejerc1.IndicesNoValidosException;

class PruebasDeFrancisco {

	static private double[][] datos, datos3, esperable;
	static private int i = 0;	
	
	@BeforeAll
	static void setUpBeforeClass() {
		datos = new double[][] { { 3, 5, -1, 18, 32 }, { 45, 3.2, 0, 67, 0 }, { -5, 12, 74, 5, 34 }, { 2, 81, 7, 5, 0 },
				{ 47, 12, 99, 23, 11 }, { 23, 36, 22, 5, 5 } };
		esperable = new double[][] { { 3.2, 0, 67 }, { 12, 74, 5 }, { 81, 7, 5 } };
		datos3 = new double[][] { { 5, -1, 18, 32 }, { 45, 3.2, 0, 67, 0 }, { -5, 12, 74, 5, 34 }, { 2, 81, 7, 5, 0 },
				{ 47, 12, 99, 23, 11 }, { 23, 36, 22, 5, 5 } };
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		i++;
		System.out.println("Prueba " + i + " realizada.");
	}

	@Test
	void testGetZona_CasillaSuelta() throws IndicesNoValidosException {
		double[][] actual;
		double[][] esperable = {{3.2}};
		

		try {
			actual = Examen.getZona(new Point(0, 0), new Point(0, 0), datos);
			assertArrayEquals(actual, esperable);
		} catch (IndicesNoValidosException e) {
			fail("Esta excepción no se debería reproducir");
		} catch (Exception e) {
			fail("Esta excepción no se debería reproducir");
		}
	}	@Test
	void testGetZona_01() throws IndicesNoValidosException {
		double[][] actual;

		try {
			actual = Examen.getZona(new Point(1, 1), new Point(3, 3), datos);
			assertArrayEquals(actual, esperable);
		} catch (IndicesNoValidosException e) {
			fail("Esta excepción no se debería reproducir");
		} catch (Exception e) {
			fail("Esta excepción no se debería reproducir");
		}
	}

	@Test
	void testGetZona_02() throws IndicesNoValidosException {

		try {
			Examen.getZona(new Point(-1, 1), new Point(3, 3), datos);
			fail("Se deberia haber prducido ya una excepción");
		} catch (IndicesNoValidosException e) {

		} catch (Exception e) {
			fail("Esta excepción no se debería reproducir");
		}
	}

	@Test
	void testGetZona_03() {
		try {
			Examen.getZona(new Point(1, 1), new Point(3, 3), null);
			fail("Se debería haber producido una excepcionn");
		} catch (IndicesNoValidosException e) {
			fail("Esta escepción no debería haberse propagado");
		} catch (NullPointerException e) {
		}
	}

	@Test
	void testGetZona_04() throws IndicesNoValidosException {
		double actual[][] = Examen.getZona(new Point(0, 0), new Point(5, 4), datos);
		assertArrayEquals(actual, datos);
	}

	@Test
	void testGetZona_05() {
		try {
			Examen.getZona(new Point(0, 0), new Point(5, 4), datos3);
			fail("Se debería haber producido una excepción");
		} catch (IndicesNoValidosException e) {
		}
	}

	@Test
	void testGetZona_06_1() {
		double[][] doublesRandom = new double[1000][1000];
		int i, j;
		double j2;
		for (i = 0; i < datos.length; i++) {
			for (j = 0, j2 = 1.0; j < datos[0].length; j++, j2++) {
				doublesRandom[i][j] = j2;
			}
		}
		try {
			Examen.getZona(new Point(0, 0), new Point(999, 999), doublesRandom);
		} catch (Exception e) {
			fail("No debería lanzarse excepcion");

		}
	}

	@Test
	void testGetZona_06_2() {
		double[][] doublesRandom = new double[10000][10000];
		int i, j;
		double j2;
		for (i = 0; i < datos.length; i++) {
			for (j = 0, j2 = 1.0; j < datos[0].length; j++, j2++) {
				doublesRandom[i][j] = j2;
			}
		}
		try {
			Examen.getZona(new Point(0, 0), new Point(9999, 9999), doublesRandom);
		} catch (Exception e) {
			fail("No debería lanzarse excepcion");

		}
	}

}
