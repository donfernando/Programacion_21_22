package pq6.test;


import java.util.ArrayList;
import java.util.Collections;

public class PreguntaExtra extends Pregunta {

	//CAMBIAR ORDEN DE RESPUESTAS
	public PreguntaExtra(String pregunta, ArrayList<String> opciones, int correcta, int puntos) {
		super(pregunta, opciones, correcta, puntos);
	}
	@Override
	public String toString() {
		String opcionCorrecta = getRespuestaCorrecta();
		int i=0;
		Collections.shuffle(opciones);
		while(!opciones.get(i).equals(opcionCorrecta))
			i++;
		correcta = i;		
		
		return super.toString();
	}
}
