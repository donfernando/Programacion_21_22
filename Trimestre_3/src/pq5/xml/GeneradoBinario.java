package pq5.xml;


import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GeneradoBinario extends DefaultHandler {
	boolean enLetra,enFila,enColumna;
	char letra;
	int fila,columna;
	ArrayList<Character> letras= new ArrayList<>(64);
	ArrayList<Point> puntos= new ArrayList<>(64);
	@Override
   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

   }

   @Override
   public void characters(char[] ch, int start, int length) throws SAXException {


   
   }

   @Override
   public void endElement(String uri, String localName, String qName) throws SAXException {

   }

}