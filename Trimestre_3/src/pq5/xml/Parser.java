package pq5.xml;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Parser {
   public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
       SAXParserFactory factory = SAXParserFactory.newInstance();
       SAXParser saxParser = factory.newSAXParser();
//       Manejador miManejador = new Manejador();
       GeneradoBinario miManejador = new GeneradoBinario();
       saxParser.parse("misFicheros/piezas.xml", miManejador);

   }
}