package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq2.listas.Ejercicios;

class PruebaSaltoCaballo {
	List<Point> l;
	
	@AfterEach
	void tearDown() throws Exception {
		//System.out.println(l);
//		Point p;
//		Iterator<Point> i = l.iterator();
//		while(i.hasNext()) {
//			p = i.next();
//		System.out.printf("(%d,%d) ",p.x,p.y);
//		}
		
		for (Point p : l) {
			System.out.printf("(%d,%d) ",p.x,p.y);
		}
		System.out.println();
	}

	@Test
	void testInicial() {
		Set<Point> expected = new HashSet<>();
		expected.add(new Point(5,6));
		expected.add(new Point(6,5));
		
		l = Ejercicios.saltoCaballo(new Point(7,7));
		Set<Point> obtenido = new HashSet<>(l);
		assertEquals(expected, obtenido);
	}

	@Test
	void testSaltoCaballo01() {
		Set<Point> expected = new HashSet<>();
		expected.add(new Point(3,4));
		expected.add(new Point(3,6));
		expected.add(new Point(4,3));
		expected.add(new Point(4,7));
		expected.add(new Point(6,3));
		expected.add(new Point(6,7));
		expected.add(new Point(7,4));
		expected.add(new Point(7,6));
		l=Ejercicios.saltoCaballo(new Point(5,5));
		Set<Point> obt = new HashSet<>(l);
		assertEquals(expected, obt);
	}
	@Test
	void testSaltoCaballo02() {
		Set<Point> expected = new HashSet<>();
		expected.add(new Point(1,2));
		expected.add(new Point(2,1));
		l=Ejercicios.saltoCaballo(new Point(0,0));
		Set<Point> obt = new HashSet<>(l);
		assertEquals(expected, obt);
	}
	@Test
	void testSaltoCaballo03() {
		Set<Point> expected = new HashSet<>();
		expected.add(new Point(2,6));
		expected.add(new Point(6,6));
		expected.add(new Point(3,5));
		expected.add(new Point(5,5));
		l=Ejercicios.saltoCaballo(new Point(4,7));
		Set<Point> obt = new HashSet<>(l);
		assertEquals(expected, obt);
	}
	@Test
	void testSaltoCaballoException01() {
		try {
			l=Ejercicios.saltoCaballo(new Point(-4,7));
			fail("Aquí no debería llegar.");
		} catch (Exception e) {
			l=new ArrayList<>();
		}
	}
}
