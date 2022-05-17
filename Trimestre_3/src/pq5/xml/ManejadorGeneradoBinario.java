package pq5.xml;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ManejadorGeneradoBinario extends DefaultHandler {
	boolean enLetra, enFila, enColumna;
	char letra;
	int fila, columna;
	ArrayList<Character> letras = new ArrayList<>(64);
	ArrayList<Point> puntos = new ArrayList<>(64);

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("letra")) {
			enLetra = true;
		} else if (qName.equals("fila")) {
			enFila = true;
		} else if (qName.equals("columna")) {
			enColumna = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (enLetra) {
			letra = ch[0];
		} else if (enFila) {
			fila = ch[0] - '0';
		} else if (enColumna) {
			columna = ch[0] - '0';
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("letra")) {
			enLetra = false;
		} else if (qName.equals("fila")) {
			enFila = false;
		} else if (qName.equals("columna")) {
			enColumna = false;
		} else if (qName.equals("ficha")) {
			letras.add(letra);
			puntos.add(new Point(fila,columna));
		}
	}
}