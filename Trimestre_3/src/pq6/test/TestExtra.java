package pq6.test;


import java.util.ArrayList;
import java.util.Collections;

public class TestExtra extends Test{
	//CAMBIAR ORDEN DE PREGUNTAS
	
	public TestExtra(String usuario, String fichero) {
		super(usuario,fichero);
		Collections.shuffle(preguntas);
	}

	public void reiniciar() {
		super.reiniciar();
		Collections.shuffle(preguntas);		
	}
	public void addPregunta(String preg, ArrayList<String> opciones, int respCorrecta, int puntos){
		preguntas.add(new PreguntaExtra(preg, opciones, respCorrecta, puntos));
	}

	
	
}
