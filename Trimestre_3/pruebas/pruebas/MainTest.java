package pruebas;


import pq6.test.*;
import pq7.accesoDirecto.Marcador;

public class MainTest {
	public static void main(String[] args) {
//		Test t = new Test("Blasa","misFicheros/preguntas.txt");
//		Test t = new Test("Antonio","misFicheros/preguntas.txt");
//		TestExtra t = new TestExtra("Ana","misFicheros/preguntas.txt");
//		// Usando como nombre la marca de casilla libre lanza exception
//		Test t = new Test(Marcador.POS_LIBRE,"misFicheros/preguntas.txt");
		
		Test t = new TestExtra("Juan","misFicheros/preguntas.txt");
		examina(t);
		System.out.println();
		t.reiniciar("Blasa");
		examina(t);
		System.out.println();
		t.reiniciar("Ana");
		examina(t);
		
		System.out.println();
		System.out.println(t);
	}
	private static void examina(Test t) {
		System.out.printf("EXAMEN GENERAL DE %s\n",t.getUsuario());
		while(t.hasMoreElements()) {
			if(!t.preguntar()) {
				System.out.println("Error... ");
				System.out.println("Resp: "+t.getRespuestaCorrecta());
			}
			System.out.println();
		}	
		System.out.print("Usuario: " + t.getUsuario()+"    ");
		System.out.println("Aciertos: " + t.getNumAcertadas() + "/" + t.getNumPreguntas());
		t.guardarPuntuacion();
	}
}
