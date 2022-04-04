package pruebasmarti;

import java.text.Normalizer;

import pq1.contenedores.dinamico.Cola;
import pq1.contenedores.dinamico.Pila;

public class Ejercicios {
	public static String cleanString(String texto) {
		texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
		texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return texto;
	}
	public static boolean esPalindromo(String frase) {
		PilaMayuSimple p = new PilaMayuSimple();
		ColaMayuSimple c = new ColaMayuSimple();
		char pCh='a', cCh='b';
		
		for (int i = 0; i < frase.length(); i++) {
			p.apilar(frase.charAt(i));
			c.acolar(frase.charAt(i));
		}
		while(!p.vacia() && (pCh=p.desapilar())==(cCh=c.desacolar())) {
		}
		return pCh==cCh;	
	}
	
	
	public static boolean esPalindromo_2(String frase) {
		Pila<Character> p = new Pila<Character>();
		Cola<Character> c = new Cola<>();
		char pCh='a', cCh='b';
		
		frase = cleanString(frase).toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isLetter(frase.charAt(i))) {
				p.apilar(frase.charAt(i));
				c.acolar(frase.charAt(i));
			}
		}
		while(!p.vacia() && (pCh=p.desapilar())==(cCh=c.desacolar())) {
		}
		return pCh==cCh;	
	}	
	
	
	
//	public static void main(String[] args) {
//		String fr="Cañón";
//		String filtrado;
//		filtrado = Normalizer.normalize(fr, Normalizer.Form.NFD);
//		
//		System.out.println(fr);
//		for (int i = 0; i < filtrado.length(); i++) {
//			System.out.println(filtrado.charAt(i));
//		}
//		System.out.println();
//		System.out.println(cleanString(fr));
//	}
	
}
