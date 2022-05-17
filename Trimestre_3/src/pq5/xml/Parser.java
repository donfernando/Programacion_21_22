package pq5.xml;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Parser {
	private static ManejadorGeneradoBinario miManejador;

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		Manejador miManejador = new Manejador();
		saxParser.parse("misFicheros/piezas.xml", miManejador);
		System.out.printf("Existen %d piezas de ajedrez en el tablero.\n", miManejador.getFichas());
	}
}