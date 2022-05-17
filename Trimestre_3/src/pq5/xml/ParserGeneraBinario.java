package pq5.xml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ParserGeneraBinario {
	private static ManejadorGeneradoBinario miManejador;

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		int i;
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		miManejador = new ManejadorGeneradoBinario();
		saxParser.parse("misFicheros/piezas.xml", miManejador);

		// VOLCADO al fichero Binario
		int numFichas = miManejador.letras.size();
		try (FileOutputStream salida = new FileOutputStream("misFicheros/piezas2.dat")) {
			salida.write(numFichas);
			for (i = 0; i < numFichas; i++) {
				salida.write(miManejador.letras.get(i));
				salida.write(miManejador.puntos.get(i).x);
				salida.write(miManejador.puntos.get(i).y);
			}
			salida.close();
		} 
		catch (IOException e) {	
			System.err.println("Problemas en la escritura del fichero...");

		}
	}
}
