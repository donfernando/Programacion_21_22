package pruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejerc1.Examen;
import ejerc1.IndicesNoValidosException;

import java.awt.Point;

class PruebasExamen_getZona_01 {
	static private double[][] datos, esperable_01;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		datos = new double[][] {
			{3,5,-1,18,32},
			{45,3.2,0,67,0},
			{-5,12,74,5,34},
			{2,81,7,5,0},
			{47,12,99,23,11},
			{23,36,22,5,5}
		};
		esperable_01 = new double[][] {
				{3.2,0,67},
				{12,74,5},
				{81,7,5}
		};
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetZona_01() {
		double[][] actual;
		double[][] esperable = {
				{3.2,0,67},
				{12,74,5},
				{81,7,5}
		};
		
		try {
			actual = Examen.getZona(new Point(1,1), new Point(3,3), datos);			
			assertArrayEquals(actual, esperable);
		} catch (IndicesNoValidosException e) {
			fail("Esta excepcion no se debería producir");			
		} catch (Exception e) {
			fail("Esta excepcion no se debería producir");
		}
	}
	@Test
	void testGetZona_02() {
		double[][] actual;
		
		try {
			actual = Examen.getZona(new Point(-1,1), new Point(3,3), datos);			
			fail("Se debería haber producido ya una excepcion.");			
		} catch (IndicesNoValidosException e) {
		} catch (Exception e) {
			fail("Esta excepcion no es la que se debería producir");
		}
	}
	@Test
	void testGetZona_03() {
		double[][] actual;
		
		try {
			actual = Examen.getZona(null, new Point(3,3), datos);			
			fail("Se debería haber producido ya una excepcion.");			
		} catch (NullPointerException e) {
		} catch (Exception e) {
			fail("Esta excepcion no es la que se debería producir\n"+e);
		}
	}

}
