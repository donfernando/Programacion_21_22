package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq2.listas.Ejercicios;

class PruebaTotalizar_02 {
	List<Integer> l;
	Iterator<Integer> i;
	@BeforeEach
	void setUp() throws Exception {
		l=new ArrayList<>();
		l.add(8);
		l.add(7);
		l.add(3);
		i=l.iterator();
	}

	@Test
	void test_01() {
		try {
			assertEquals(18, Ejercicios.totalizar(i));
		} catch (Exception e) {
			fail("No debe lanzar exception");
		}
	}
	@Test
	void test_02() {
		try {
			i.next();
			assertEquals(10, Ejercicios.totalizar(i));
		} catch (Exception e) {
			fail("No debe lanzar exception");
		}
	}
	@Test
	void test_03() {
		try {
			l.add(10);
			assertEquals(28, Ejercicios.totalizar(i));
			fail("Debería lanzar exception");
		} catch (Exception e) {
		}
	}
	@Test
	void test_04() {
		try {
			l.add(10);
			i=l.iterator();
			assertEquals(28, Ejercicios.totalizar(i));
		} catch (Exception e) {
			fail("No debe lanzar exception");
		}
	}

}
