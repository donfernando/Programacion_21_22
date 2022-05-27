package pq6.test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;

import pq7.accesoDirecto.Marcador;


public class Test implements Enumeration<Pregunta> {
	public final static Scanner entrada = new Scanner(System.in);
	
	protected String usuario;
	protected ArrayList<Pregunta> preguntas = new ArrayList<>();
	protected int puntosConseguidos, aciertos, pregActual;
	protected String ultRespuestaCorrecta;
	protected static String nFichMarcador="misFicheros/puntuacion";
	
	public Test(String usuario, String fichero, String fMarcador) {
		this(usuario,fichero);
		nFichMarcador = "misFicheros/"+fMarcador;
	}
	
	public Test(String usuario, String fichero) {
		if(usuario == null || usuario.length() == 0 || usuario.equals(Marcador.POS_LIBRE))
			throw new NullPointerException("El usuario es nulo o inválido");
		this.usuario = usuario;
		String linea, pregunta;
		ArrayList<String> opciones;
		int respCorrecta;
		int puntosPregunta;

		try(BufferedReader entrada = new BufferedReader(
				new FileReader(fichero, Charset.forName("UTF-8")))) {
			linea = entrada.readLine();
			while(linea != null) {//recorro el fichero				
				pregunta = linea.substring(1);//guardo la primera pregunta
				opciones = new ArrayList<String>(4);
				linea = entrada.readLine();
				while(linea != null && !linea.startsWith(";;")) {//recorro opciones
					opciones.add(linea);//guardo opcion
					linea = entrada.readLine();//leo opcion
				}
				
				// Resp correcta int con rango 0..3
				respCorrecta = linea.charAt(2)-'0'-1; 
				// Parseamos a entero el String que contiene el valor de la pregunta
				puntosPregunta = Integer.parseInt(entrada.readLine());
				addPregunta(pregunta, opciones, respCorrecta, puntosPregunta);
				linea = entrada.readLine();
			}
			entrada.close();
		} catch(IOException e) {}
	}
	
	public void addPregunta(String preg, ArrayList<String> opciones, int respCorrecta, int puntos){
		preguntas.add(new Pregunta(preg, opciones, respCorrecta, puntos));
	}
	
	public boolean preguntar() {
		int respuesta;
		boolean acertada;
		Pregunta pregunta = nextElement();
		
		System.out.print(pregunta);
		System.out.printf("Elige una respuesta(1~%d): ", pregunta.getNumOpciones());
		respuesta = entrada.nextInt()-1;
		acertada = pregunta.comprobarRespuesta(respuesta);
		if(acertada) {
			aciertos++;
			puntosConseguidos += pregunta.getPuntos();
		}
		ultRespuestaCorrecta=pregunta.getRespuestaCorrecta();
		return acertada;
	}

	
	public void reiniciar(String nuevoUsuario){
		if(usuario == null || usuario.length() == 0 || usuario.equals(Marcador.POS_LIBRE))
			throw new NullPointerException("El usuario es nulo o inválido");
		this.usuario = nuevoUsuario;
		reiniciar();
	}
	
	public void reiniciar() {
		pregActual = 0;
		aciertos = 0;
		puntosConseguidos = 0;
	}
	
	public int getNumPregActual() {
		return pregActual;
	}
	
	public int getNumPreguntas() {
		return preguntas.size();
	}
	
	public int getNumAcertadas() {
		return aciertos;
	}
	
	public int getPuntosTotales() {
		return puntosConseguidos;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getRespuestaCorrecta() {
		return ultRespuestaCorrecta;
	}

	@Override
	public boolean hasMoreElements() {
		return pregActual < getNumPreguntas();
	}

	@Override
	public Pregunta nextElement() {
		Pregunta p = preguntas.get(pregActual);
		pregActual++;
		return p;
	}
	
	public void guardarPuntuacion() {
		try {
			Marcador m = new Marcador(nFichMarcador);
			m.setPuntos(usuario, puntosConseguidos);
			m.close();
		} catch (IOException e) {
			System.err.println("Problemas almacenando puntuación");
		}
	}
@Override
public String toString() {
	String s="xxx";
	try {
		Marcador m = new Marcador(nFichMarcador);
		s=m.toString();
		m.close();
	} catch (IOException e) {
		System.err.println("Problemas leyendo el marcador de puntuaciones");
	}	
	return s;
}	
	
	
}
