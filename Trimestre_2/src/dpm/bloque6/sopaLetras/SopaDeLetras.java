package dpm.bloque6.sopaLetras;

import java.awt.Point;
import java.util.ArrayList;

import dpm.bloque5.contenedores.Tablero;

public class SopaDeLetras extends Tablero<Letra> {
	private ArrayList<PalabraEscondida> palabrasPerdidas = new ArrayList<>();
	private int palabrasYaEncontradas;

	public SopaDeLetras(String[] sopa, PalabraEscondida[] palabras) {
		super(sopa.length, sopa[0].length());
		for (int f = 0; f < sopa.length; f++) {
			for (int c = 0; c < sopa[f].length(); c++) {
				set(f, c, new Letra(sopa[f].charAt(c)));
			}
		}
		for (int i = 0; i < palabras.length; i++) {
			if (!contiene(palabras[i]))
				throw new PalabraPerdidaException("");
		}
		for (int i = 0; i < palabras.length; i++) {
			this.palabrasPerdidas.add(palabras[i]);
		}
	}

	private boolean contiene(PalabraEscondida palabraEscondida) {
		String pEnSopa = "";
		int i, nLetras;
		Point coord, direc;
		coord = palabraEscondida.getCoordenada();
		direc = palabraEscondida.getDireccion();
		nLetras = palabraEscondida.getPalabra().length();
		for (i = 0; i < nLetras; i++) {
			pEnSopa += datos[coord.y][coord.x];
			coord.move(direc.y, direc.x);
		}
		return pEnSopa.equalsIgnoreCase(palabraEscondida.getPalabra());
	}

	// TODO COMPLETAR
	// Resaltar todas las letras que formen parte alguna de palabra oculta.
	public void desvelarTodo() {

	}

	public boolean descubrirPalabra(String p, Point coordenada, Point direccion) {
		PalabraEscondida parametro = new PalabraEscondida(p, coordenada, direccion);
		int f,c;
		int iPalabraEscondida;
		PalabraEscondida aux;
		f=coordenada.y;
		c=coordenada.x;
		iPalabraEscondida = palabrasPerdidas.indexOf(parametro);
		if (this.contiene(parametro) && iPalabraEscondida!=-1) {
			aux = palabrasPerdidas.get(iPalabraEscondida);
			if (!aux.encontrada) {
				for (int i = 0; i < p.length(); i++) {
					datos[f][c].resaltar();
					f += direccion.y;
					c += direccion.x;
				}
				aux.encontrada=true;
				palabrasYaEncontradas++;
				return true;
			}
			// aquí no retorno true aunque coincide, porque estaría ya previamente encontrada.
		}
		return false;
	}


	public int numPalabrasEncontradas() {
		return palabrasYaEncontradas;
	}

	public int numPalabras() {
		return palabrasPerdidas.size();
	}

	public String getPalabra(Point coordenada, Point direccion, int numLetras) {
		return getPalabra(coordenada.y, coordenada.x , direccion, numLetras);
	}
	public String getPalabra(int fDesde, int cDesde, Point direccion, int numLetras) {
		String s = "";
		for (int i = 0; i < numLetras; i++) {
			s += datos[fDesde][cDesde].toString();
		}
		return s;
	}

	public String[] getPalabrasYaEncontradas() {
		String[] palabras=new String[numPalabrasEncontradas()];
		int iPal=0;
		for (int i = 0; i < palabrasPerdidas.size(); i++) {
			if(palabrasPerdidas.get(i).encontrada)
				palabras[iPal++]=palabrasPerdidas.get(i).getPalabra();
		}
		return palabras;
	}

	public String[] getPalabrasAunPerdidas() {
		String[] palabras=new String[numPalabras()-numPalabrasEncontradas()];
		int iPal=0;
		for (int i = 0; i < palabrasPerdidas.size(); i++) {
			if(!palabrasPerdidas.get(i).encontrada)
				palabras[iPal++]=palabrasPerdidas.get(i).getPalabra();
		}
		return palabras;
	}

	private String getFila(int f) {
		// TODO COMPLETAR
		return "";
	}

	public void mostrarTablero() {
		// TODO COMPLETAR
		getFila(0);
	}

}
