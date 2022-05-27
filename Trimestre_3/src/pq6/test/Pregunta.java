package pq6.test;


import java.util.ArrayList;

public class Pregunta {
	protected String texto;
	protected ArrayList<String> opciones;
	protected int correcta;
	protected int puntos;
	
	public Pregunta(String pregunta, ArrayList<String> opciones, int correcta, int puntos) {
		if(opciones.size() > 4 | opciones.size() < 2)
			throw new IndexOutOfBoundsException("No pueden haber menos de 2 o más de 4 opciones.");
		texto = pregunta;
		this.opciones=opciones;
		this.correcta = correcta;
		this.puntos = puntos;
	}
	
	public boolean comprobarRespuesta(int respuestaUsuario) {
		return respuestaUsuario == correcta;
	}
	
	public String getRespuestaCorrecta() {
		return opciones.get(correcta);
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public int getNumOpciones() {
		return opciones.size();
	}
	
	@Override
	public String toString() {
		String resultado = texto+"\n";
		for (int i = 0; i < opciones.size(); i++) {
			resultado += (i+1) + ") " + opciones.get(i)+"\n";
		}
		return resultado;
	}
}
