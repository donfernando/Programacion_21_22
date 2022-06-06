package pq8.extra;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class Prueba {
	public static void main(String[] args) throws IOException {
//		new FileWriter("material/fichero").close();
		System.out.printf("%c %d\n",'<',(int)'<');
		System.out.printf("%c %d\n",'5',(int)'5');
		System.out.println(("<"+12+43).compareTo(12+43+"<"));
	}
}
