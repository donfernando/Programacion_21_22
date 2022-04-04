package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq2.listas.Ejercicios;

class PruebaTotalizar_01 {
	List<Integer> l;
	
	@BeforeEach
	void setUp() throws Exception {
		l=new ArrayList<>();
		l.add(8);
		l.add(7);
		l.add(3);
	}

	@Test
	void test_01() {
		try {
			assertEquals(18, Ejercicios.totalizar(l));
		} catch (Exception e) {
			fail("No debe lanzar exception");
		}
	}
	@Test
	void test_02() {
		try {
			assertNotEquals(0, Ejercicios.totalizar(l));
		} catch (Exception e) {
			fail("No debe lanzar exception");
		}
	}
	@Test
	void test_03() {
		try {
			l.add(10);
			assertEquals(28, Ejercicios.totalizar(l));
		} catch (Exception e) {
			fail("No debe lanzar exception");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> l =new ArrayList<>();
		l.add(80);
		l.add(70);
		l.add(30);
//		System.out.println(l);
		Iterator<Integer> i=l.iterator();
		System.out.println(i.next());
		System.out.println(i.next());

		i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
