package juego;

import java.awt.Point;
import java.util.InputMismatchException;
import java.util.Scanner;

import juego.base.Mundo;
import juego.base.Mundo.Direccion;
import juego.flota.Astillero;
import juego.flota.Barco;
import juego.flota.Yate;
import miJuego.MiAstillero;

public class Consola {
	private Scanner in = new Scanner(System.in);
	private static Consola consola;
	
	private Consola() {
	}
	
	public static Consola consola() {
		if(consola==null)
			consola = new Consola();
		return consola;
	}
	
	private String generaString(Mundo m, boolean desvelar) {
		String s = "  ";
		int f, c;
		
		for (c = 0; c < m.getColumnas(); c++) {
			s += "  " + (char) (c + 'A') + " ";
		}
		s += "\n  ╔";
		for (c = 0; c < m.getColumnas() - 1; c++) {
			s += "═══╦";
		}
		s += "═══╗\n";
		for (f = 0; f < m.getFilas() - 1; f++) {
			s += f + " ║";
			for (c = 0; c < m.getColumnas(); c++) {
				s += String.format(" %s ║", casilla(m, f, c, desvelar));
			}
			s += "\n  ╠";
			for (c = 0; c < m.getColumnas() - 1; c++) {
				s += "═══╬";
			}
			s += "═══╣\n";
		}
		s += f + " ║";
		for (c = 0; c < m.getColumnas(); c++) {
			s += String.format(" %s ║", casilla(m, f, c, desvelar));
		}
		s += "\n  ╚";
		for (c = 0; c < m.getColumnas() - 1; c++) {
			s += "═══╩";
		}
		s += "═══╝\n";
		return s;
	}

	private char casilla(Mundo m, int f, int c, boolean desvelar) {
		Barco b;
		char letra;

		b = m.getBarco(f, c);
		if (m.getDisparo(f,c))
			if (b == null)
				letra = '*';
			else if (b.hundido())
				letra = 'H';
			else
				letra = '#';
		else if (desvelar && b != null)
			letra = b.letra();
		else
			letra = ' ';
		return letra;
	}	
	
	public void desvelarMundo(Mundo m) {
		System.out.println(generaString(m, true));
	}
	public void visualizarMundo(Mundo m) {
		System.out.println(generaString(m, false));
	}
	public Point leerCoordenadas(String mensaje,int tope) {
		String linea;
		Point coord=new Point();
		System.out.println(mensaje);

		// Lectura Fila...
		try {
			System.out.print("fila: ");
			coord.x=in.nextInt();
		} catch (InputMismatchException e) {
			coord.x=-1;
			in.nextLine();
		}
		while(coord.x<0 || coord.x>tope) {
			System.out.println("fila inválida...(repita)");
			try {
				System.out.print("fila: ");
				coord.x=in.nextInt();
			} catch (InputMismatchException e) {
				coord.x=-1;
				in.nextLine();
			}
		}
		
		// Lectura Columna...
		System.out.print("columna: ");
		do {
		} while ((linea = in.nextLine().trim()).length()==0);
		coord.y=(linea.toUpperCase().charAt(0))-'A';
		while(coord.y<0 || coord.y>tope) {
			System.out.println("columna inválida...(repita)");
			System.out.print("columna: ");
			do {
			} while ((linea = in.nextLine().trim()).length()==0);
			coord.y=(linea.toUpperCase().charAt(0))-'A';
		}
		return coord;
	}

	public Direccion leerDireccion(String mensaje) {
		System.out.println("(Horiz/Vert/Diag) "+mensaje);
		char opcion;
		opcion = in.nextLine().toUpperCase().trim().charAt(0);
		return opcion=='H'?Direccion.HORIZONTAL:(opcion=='V'?Direccion.VERTICAL:Direccion.DIAGONAL);
	}

	public void mensaje(String e) {
		System.out.println(e);
		
	}
	
	public void colocarBarcosInteracivo(Mundo m,Barco[] listaBarcos) {
		Point p;
		Direccion direc=null;
		boolean esYate;
		
		for (int i = 0; i < listaBarcos.length; i++) {
			esYate = listaBarcos[i] instanceof Yate;
			desvelarMundo(m);
			p = leerCoordenadas("Coordenadas de nuevo " + listaBarcos[i] + ": ", m.getFilas());
			if(!esYate)
				direc = leerDireccion("... y su orientación: ");
			while (!m.colocarBarco(p.x, p.y, esYate?Direccion.HORIZONTAL:direc, listaBarcos[i])) {
				mensaje("Problemas creando el barco...");
				p = leerCoordenadas("Introduce de nuevo las coordenadas: ",m.getFilas());
				if(!esYate)
					direc = leerDireccion("... y su orientación: ");
			}
			mensaje("Nuevo " + listaBarcos[i] + " creado.");
		}
		desvelarMundo(m);
	}
}
