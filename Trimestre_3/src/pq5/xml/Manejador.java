package pq5.xml;


import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Manejador extends DefaultHandler {
   private int fichas=0;
   public int getFichas() {
	return fichas;
   }
	
   @Override
   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	   if(qName.equals("ficha"))
		   fichas++;
  }

//   @Override
//   public void characters(char[] ch, int start, int length) throws SAXException {
//	   String s=new String(ch,start,length);
//	   if(s.length()==1)
//		   System.out.print(s);
//   }

//   @Override
//   public void endElement(String uri, String localName, String qName) throws SAXException {
//   System.out.println("FIN: "+qName);
//   }

}