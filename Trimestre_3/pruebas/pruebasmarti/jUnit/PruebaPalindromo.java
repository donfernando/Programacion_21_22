package pruebasmarti.jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pruebasmarti.Ejercicios;

class PruebaPalindromo {
	static String frase;
	@BeforeAll
	static void preparaTest() {
		frase = "dabale arroz a la zorra el abad.";
	}
	@Test
	void test_01() {
		assertTrue(Ejercicios.esPalindromo(frase));
	}
	@Test
	void test_02() {
		assertTrue(Ejercicios.esPalindromo(frase.substring(0,frase.length()-1)));
	}

	@Test
	void test_03() {
		assertFalse(Ejercicios.esPalindromo(frase.substring(0,frase.length()-2)));
	}

}