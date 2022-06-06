package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import org.junit.jupiter.api.Test;
import pq8.extra.EncadenadasPersistente_txt;

class PruebaEncadenadasPersistente_txt {

	@Test
	void test() {
		EncadenadasPersistente_txt p = new EncadenadasPersistente_txt(new File("palabras.txt"));
		p.guardar(new File("palabras.txt"));
		
	}

}
