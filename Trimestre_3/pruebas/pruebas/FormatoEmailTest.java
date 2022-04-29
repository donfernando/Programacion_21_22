package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pq2.conjunto.karim.Email;
import pq2.conjunto.EmailIllegalArgumentException;

class FormatoEmailTest {
	Email e;

	@BeforeEach
	void ini() throws Exception {
		e = new Email();
	}

	@Test
	void test_01() {
		String text="md.96@g.c";
		for (int i = 0; i < text.length(); i++) {
			e.add(text.charAt(i));
		}
		System.out.println(e);
		assertTrue(e.valida());
	}

	@Test
	void test_02() {
		String text="md.96@g.";
		for (int i = 0; i < text.length(); i++) {
			e.add(text.charAt(i));
		}
		System.out.println(e);
		assertFalse(e.valida());
	}
	
	@Test
	void test_03() {
		String text="m@a96@g.";
		try {
			for (int i = 0; i < text.length(); i++) {
				e.add(text.charAt(i));
			}
			fail("Se debería haber lanzado exception.");
		} catch (EmailIllegalArgumentException except) {
			System.out.println(e);
			assertTrue(e.valida());			
		}
	}
}
