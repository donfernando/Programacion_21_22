package pruebasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import juego.Consola;
import juego.base.Mundo;
import juego.base.Mundo.Direccion;
import juego.flota.Barco;
import juego.flota.Submarino;
import juego.flota.Transatlantico;
import juego.flota.Yate;

class PruebaColocarBarco_01 {
	Mundo mundo;
	
	
	@BeforeEach
	void preparaBarcosYaPuestos_01() {
		mundo=new Mundo();
		mundo.colocarBarco(0, 0, Direccion.HORIZONTAL, new Transatlantico());
		mundo.colocarBarco(5, 0, Direccion.HORIZONTAL, new Transatlantico());
		Consola.consola().desvelarMundo(mundo);
	}
	
	@AfterEach
	void acabarBarcosYaPuestos_01() {
		Consola.consola().desvelarMundo(mundo);
	}
	
	
	@Test
	void testColocarBarcoPegado_01() {
		Barco b = new Transatlantico();
		int f=1,c=0;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertFalse(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}
	@Test
	void testColocarBarcoPegado_02() {
		Barco b = new Transatlantico();
		int f=1,c=3;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertFalse(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}
	@Test
	void testColocarBarcoPegado_03() {
		Barco b = new Transatlantico();
		int f=2,c=3;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertFalse(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}
	@Test
	void testColocarBarcoPegado_04() {
		Barco b = new Submarino();
		int f=2,c=3;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertTrue(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}

	
	@Test
	void testColocarBarcoFuera_01() {
		Barco b = new Yate();
		int f=9,c=9;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertTrue(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}
	@Test
	void testColocarBarcoFuera_02() {
		Barco b = new Submarino();
		int f=9,c=9;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertFalse(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}
	@Test
	void testColocarBarcoFuera_03() {
		Barco b = new Submarino();
		int f=-1,c=0;
		Consola.consola().mensaje(String.format("Colocando %s en %d,%d",b,f,c));
		try {
			assertFalse(mundo.colocarBarco(f, c, Direccion.VERTICAL, b));
		} catch (Exception e) {
			fail("Esta función no debería lanzar excepción.");
		}
	}

	
	
	
	
	
	
}
