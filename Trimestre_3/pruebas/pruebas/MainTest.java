package pruebas;


import pq6.test.*;
import pq7.accesoDirecto.Marcador;

public class MainTest {
	public static void main(String[] args) {
		Test t = new Test("Juan","misFicheros/preguntas.txt");
//		Test t = new Test("Blasa","misFicheros/preguntas.txt");
//		Test t = new Test("Antonio","misFicheros/preguntas.txt");
//		TestExtra t = new TestExtra("Ana","misFicheros/preguntas.txt");
//		// Usando como nombre la marca de casilla libre lanza exception
//		Test t = new Test(Marcador.POS_LIBRE,"misFicheros/preguntas.txt");
		
		for (int i = 0; i < t.getNumPreguntas(); i++) {			
			if(!t.preguntar()) {
				System.out.println("Error... ");
				System.out.println("Resp: "+t.getRespuestaCorrecta());
			}
			System.out.println();
		}
		
		System.out.println("Usuario: " + t.getUsuario());
		t.guardarPuntuacion();
		System.out.println("Aciertos: " + t.getNumAcertadas() + "/" + t.getNumPreguntas());
		System.out.println("Puntos: " + t.getPuntosTotales());
	}

}
