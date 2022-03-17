package dpm.bloque6.sopaLetras;

import java.awt.Point;

public class PalabraEscondida {
	private String palabra;
	private Point coordenada;
	private Point direccion;
	public boolean encontrada;
	public PalabraEscondida(String p, Point coord, Point direc) {
		palabra = p;
		coordenada=coord;
		direccion = direc;
	}
	public String getPalabra() {
		return palabra;
	}
	public Point getCoordenada() {
		return coordenada;
	}
	public Point getDireccion() {
		return direccion;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO COMPLETAR
		return super.equals(obj);
	}
}
